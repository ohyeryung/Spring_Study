package com.smile.test_study.member;

import com.smile.test_study.domain.Member;
import com.smile.test_study.domain.Study;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId);
    void validate(Long memberId);

    void notify(Study newStudy);

    void notify(Member member);
}
