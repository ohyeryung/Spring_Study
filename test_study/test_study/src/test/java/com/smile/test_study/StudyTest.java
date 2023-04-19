package com.smile.test_study;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @FirstTest
    @DisplayName("스터디 만들기 📖")
    void create_Study() {
        Study study = new Study(10);
        assertThat(study.getLimit()).isGreaterThan(0);

//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
//        // assertThrows(어떤 타입의 에러가 발생하는지, 어느 코드를 실행했을 때 발생하는지);
//        assertEquals("참석 인원은 0을 초과해야 한다.", exception.getMessage());

//        Study study = new Study(-10);
//        assertAll(
//                () -> assertNotNull(study),
//                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면" + StudyStatus.DRAFT + "상태다"),
//                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 인원은 0명 초과")
//        );

//        assertNotNull(study);
//        // 만약 메세지가 길어서 아래 처럼 많은 연산을 해야하는 경우, 람다식을 사용하면 실패인 경우에만 코드가 돌아가기 때문에 비용이나 성능면에서 효과적일 수 있다.
//        assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> " 스터디를 처음 만들면" + StudyStatus.DRAFT + "상태다");
//        assertTrue(study.getLimit() > 0, "스터디 최대 참석 인원은 0명 초과 ");
    }

    @SecondTest
    @DisplayName("스터디 만들기2 📚")
    void create_another_study() {
        System.out.println("create1");
    }

    @DisplayName("스터디 만들기")
    @RepeatedTest(value = 5, name = "공부 {displayName}, {currentRepetition}/{totalRepetitions}")
    void repeatTest(RepetitionInfo repetitionInfo) {
        System.out.println("Repeat Test " + repetitionInfo.getCurrentRepetition() + "/" + repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("오늘의 날씨")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @ValueSource(strings = { "The", "weather", "is", "getting", "warmer." })
    void parameterizedTest(String message) {
        System.out.println("message = " + message);
    }


    // test가 실행되기 전 한 번만 실행됨 (함수가 static이어야 하고 return 타입이 있으면 안됨!)
    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    // test가 실행되고 난 후에 한 번 실행됨 (함수가 static이어야 하고 return 타입이 있으면 안됨!)
    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    // 모든 test가 실행되기 이전에 한 번씩 호출 (굳이 static이 필요하지 않음)
    @BeforeEach
    void beforeEach() {
        System.out.println("before Each");
    }

    // 모든 test가 실행되고 난 후 한 번씩 호출
    @AfterEach
    void afterEach() {
        System.out.println("after Each");
    }


}