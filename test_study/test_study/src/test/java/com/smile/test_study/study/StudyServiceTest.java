package com.smile.test_study.study;

import com.smile.test_study.domian.Member;
import com.smile.test_study.domian.Study;
import com.smile.test_study.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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

    @Test
    void createStudy() {
        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);

        Member member = new Member();
        member.setId(1L);
        member.setEmail("yeryung@email.com");

        Study study = new Study(5, "spring study");

        // TODO memberService 객체에 findById 메소드를 1L 값으로 호출하면 Optional.of(member) 객체를 리턴하도록 Stubbing
        when(memberService.findById(1L)).thenReturn(Optional.of(member));

        Optional<Member> findById = memberService.findById(1L);
        assertEquals("yeryung@email.com", findById.get().getEmail());

        // TODO studyRepository 객체에 save 메소드를 study 객체로 호출하면 study 객체 그대로 리턴하도록 Stubbing

        when(studyRepository.save(study)).thenReturn(study);
        assertEquals(5, study.getLimit());

        studyService.creatNewStudy(1L, study);
        assertEquals(member, study.getOwner());
    }

}