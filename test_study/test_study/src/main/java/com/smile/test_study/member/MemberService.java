package com.smile.test_study.member;

import com.smile.test_study.domian.Member;
import com.smile.test_study.domian.Study;

import java.util.Optional;

public interface MemberService {
    Optional<Member> findById(Long memberId);
    void validate(Long memberId);

    void notify(Study newStudy);

    void notify(Member member);
}
