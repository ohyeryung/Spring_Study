package com.smile.test_study.study;

import com.smile.test_study.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

    // @Mock // 단순히 @Mock 애노테이션만으로는 객체 생성 불가, 이 애노테이션을 처리해줄 extenstion 추가 필요!
    // MemberService memberService;
    // @Mock
    // StudyRepository studyRepository;

    @Test
    void createStudyService(@Mock MemberService memberService, @Mock StudyRepository studyRepository) {

        // mock 객체 만드는 방법 1 Mockito.mock 안에 사용하고자 하는 인터페이스 주입
        // MemberService memberService = mock(MemberService.class);
        // StudyRepository studyRepository = mock(StudyRepository.class);

        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);
    }

}