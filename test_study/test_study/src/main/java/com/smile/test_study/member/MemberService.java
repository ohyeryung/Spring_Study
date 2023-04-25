package com.smile.test_study.member;

import com.smile.test_study.domian.Member;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId);
    void validate(Long memberId);
}
