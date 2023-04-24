package com.smile.test_study.member;

import com.smile.test_study.domian.Member;

public interface MemberService {
    Member findById(Long memberId);
}
