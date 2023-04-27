## Test Code 공부하는 Repository입니다.
### 참고하는 강의 : 인프런 "더 자바, 애플리케이션을 테스트하는 다양한 방법"

#### 공부한 내용 요약


✔️ mock 객체 만드는 방법

    1. Mockito.mock 안에 사용하고자 하는 인터페이스 주입

        MemberService memberService = mock(MemberService.class);
        StudyRepository studyRepository = mock(StudyRepository.class);

    2. @Mock 애노테이션 사용 (단순히 @Mock 애노테이션만으로는 객체 생성 불가, 이 애노테이션을 처리해줄 extenstion 추가 필요!)
        
        @ExtendWith(MockitoExtension.class)
        class StudyServiceTest {
        
        @Mock
        MemberService memberService;
        @Mock
        StudyRepository studyRepository;

        }

    2-1. 메소드에 직접 @Mock 애노테이션 사용
       
        @ExtendWith(MockitoExtension.class)
        class StudyServiceTest {

            @Test
            void createStudyService(@Mock MemberService memberService,
                                    @Mock StudyRepository studyRepository) {
                StudyService studyService = new StudyService(memberService, studyRepository);
                assertNotNull(studyService);
            }
        }




✔️ verify() 사용 예시

    // 해당 메소드가 몇 번 실행됐는 지 검증 (verify())
    verify(memberService, times(1)).notify(study);

    // 순서대로 검증이 이뤄져야만 test 통과!
    InOrder inOrder = inOrder(memberService);
    inOrder.verify(memberService).notify(study);
    inOrder.verify(memberService).notify(member);

     // 해당 클래스 내에서 앞의 동작 이후 더 이상의 액션이 없어야 한다는 메소드
    verifyNoMoreInteractions(memberService);

✔️ 자주 쓰이는 애노테이션

    @DisplayName() : 테스트의 이름을 지정
