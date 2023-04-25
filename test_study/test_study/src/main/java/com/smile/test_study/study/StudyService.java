package com.smile.test_study.study;

import com.smile.test_study.domian.Member;
import com.smile.test_study.domian.Study;
import com.smile.test_study.member.MemberService;

import java.util.Optional;

public class StudyService {

    private final MemberService memberService;

    private final StudyRepository repository;

    public StudyService(MemberService memberService, StudyRepository repository) {
        assert memberService != null;
        assert repository != null;
        this.memberService = memberService;
        this.repository = repository;
    }

    public void creatNewStudy(Long memberId, Study study) {
       Optional<Member> member = memberService.findById(memberId);
       if (member.isEmpty()) {
           throw new IllegalArgumentException("Member doesn't exist for id: '" + memberId);
       }
       study.setOwner(member.get());
        repository.save(study);
    }
}
