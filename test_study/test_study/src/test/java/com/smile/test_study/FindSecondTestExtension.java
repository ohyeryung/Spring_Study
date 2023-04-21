package com.smile.test_study;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;

public class FindSecondTestExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    // private static final long THRESHOLD = 1000L; // 1초
    private long THRESHOLD;

    public FindSecondTestExtension(long THRESHOLD) {
        this.THRESHOLD = THRESHOLD;
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        ExtensionContext.Store store = getStore(context);
        store.put("START TIME", System.currentTimeMillis());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        Method requiredTestMethod = context.getRequiredTestMethod();
        SecondTest annotation = requiredTestMethod.getAnnotation(SecondTest.class);
        String testMethodName = context.getRequiredTestMethod().getName();
        ExtensionContext.Store store = getStore(context);
        long start_time = store.remove("START TIME", long.class);
        long duration = System.currentTimeMillis() - start_time;
        if (duration > THRESHOLD && annotation == null) {
            System.out.printf("Plz consider mark method [%s] with @SecondTest \n", testMethodName);
        }
    }

    private static ExtensionContext.Store getStore(ExtensionContext context) {
        String testClassName = context.getRequiredTestClass().getName();
        String testMethodName = context.getRequiredTestMethod().getName();
        return context.getStore(ExtensionContext.Namespace.create(testClassName, testMethodName));
    }

}
