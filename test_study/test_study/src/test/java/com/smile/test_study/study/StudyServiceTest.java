package com.smile.test_study.study;

import com.smile.test_study.domian.Member;
import com.smile.test_study.domian.Study;
import com.smile.test_study.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

     @Mock // 단순히 @Mock 애노테이션만으로는 객체 생성 불가, 이 애노테이션을 처리해줄 extenstion 추가 필요!
     MemberService memberService;
     @Mock
     StudyRepository studyRepository;

    @Test
    void createStudyService() {

        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);

        // mock 객체 만드는 방법 1 Mockito.mock 안에 사용하고자 하는 인터페이스 주입
        // MemberService memberService = mock(MemberService.class);
        // StudyRepository studyRepository = mock(StudyRepository.class);

        Member member = new Member();
        member.setId(1L);
        member.setEmail("yeryung@email.com");

        when(memberService.findById(any()))
                .thenReturn(Optional.of(member))
                .thenThrow(new RuntimeException())
                .thenReturn(null);

        Optional<Member> findById = memberService.findById(1L);
        assertEquals("yeryung@email.com", findById.get().getEmail());

        assertThrows(RuntimeException.class, () -> memberService.findById(2L));

        assertNull(memberService.findById(3L));

    }

    @DisplayName("BDD Style test")
    @Test
    void createAnotherStudy() {
        // Given
        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);

        Member member = new Member();
        member.setId(1L);
        member.setEmail("yeryung@email.com");

        Study study = new Study(5, "spring study");

        when(memberService.findById(1L)).thenReturn(Optional.of(member));
        when(studyRepository.save(study)).thenReturn(study);

        given(memberService.findById(1L)).willReturn(Optional.of(member));
        given(studyRepository.save(study)).willReturn(study);

        // When
        studyService.creatNewStudy(1L, study);

        // Then
        assertEquals(member, study.getOwner());
        then(memberService).should(times(1)).notify(study);
        then(memberService).shouldHaveNoMoreInteractions();
    }

    @DisplayName("다른 사용자가 볼 수 있도록 스터디를 공개한다.")
    @Test
    void openStudy() {
        // Given
        StudyService studyService = new StudyService(memberService, studyRepository);
        Study study = new Study(10, "더 자바, 테스트");
        // TODO studyRepository Mock 객체의 save 메소드를호출 시 study를 리턴하도록 만들기.
        given(studyRepository.save(study)).willReturn(study);

        // When
        studyService.openStudy(study);

        // Then
        // TODO study의 status가 OPENED로 변경됐는지 확인
        assertEquals(StudyStatus.OPENED, study.getStatus());
        // TODO study의 openedDataTime이 null이 아닌지 확인
        assertNotNull(study.getOpenedDateTime());
        // TODO memberService의 notify(study)가 호출 됐는지 확인.
        then(memberService).should(times(1)).notify(study);

    }

}