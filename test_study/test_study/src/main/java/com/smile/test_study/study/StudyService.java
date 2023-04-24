package com.smile.test_study.study;

import com.smile.test_study.domian.Member;
import com.smile.test_study.domian.Study;
import com.smile.test_study.member.MemberService;

public class StudyService {

    private final MemberService memberService;

    private final StudyRepository repository;

    public StudyService(MemberService memberService, StudyRepository repository) {
        assert memberService != null;
        assert repository != null;
        this.memberService = memberService;
        this.repository = repository;
    }

    public Study creatNewStudy(Long memberId, Study study) {
       Member member = memberService.findById(memberId);
       if (member == null) {
           throw new IllegalArgumentException("Member doesn't exist for id: '" + memberId);
       }
       study.setOwnerId(memberId);
       return repository.save(study);
    }
}
