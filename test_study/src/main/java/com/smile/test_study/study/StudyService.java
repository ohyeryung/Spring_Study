package com.smile.test_study.study;

import com.smile.test_study.domain.Member;
import com.smile.test_study.domain.Study;
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
       study.setOwner(member.orElseThrow(
               () -> new IllegalArgumentException("Member doesn't exist for id : '" + memberId + "'" )
       ));
       Study newStudy = repository.save(study);
       memberService.notify(newStudy);
    }

    public void openStudy(Study study) {
        study.open();
        Study openedStudy = repository.save(study);
        memberService.notify(openedStudy);
    }

}
