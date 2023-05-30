package com.smile.test_study.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Study {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private StudyStatus status = StudyStatus.DRAFT;
    private int limitCnt;
    private String name;
    private LocalDateTime openedDateTime;
    @ManyToOne
    private Member owner;

    public Study(int limit, String name) {
        this.limitCnt = limit;
        this.name = name;
    }

    public Study(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("참석 인원은 0을 초과해야 한다.");
        }
        this.limitCnt = limit;
    }

    public void open() {
        this.openedDateTime = LocalDateTime.now();
        this.status = StudyStatus.OPENED;
    }
}
