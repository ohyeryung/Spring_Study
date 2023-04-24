package com.smile.test_study.domian;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter @NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long memberId;

    private String email;

}
