package com.smile.test_study;

public class Study {

    private StudyStatus status;

    private int limit;

    public Study(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("참석 인원은 0을 초과해야 한다.");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return this.status;
    }

    public int getLimit() {
        return limit;
    }
}
