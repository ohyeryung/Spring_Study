## Test Code 공부하는 Repository입니다.
### 참고하는 강의 : 인프런 "더 자바, 애플리케이션을 테스트하는 다양한 방법"

#### 공부한 내용 요약

- project version

      JDK        JDK 11
      Build      Gradle 7.6.1
      Framework  Spring Boot 2.7.4



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

✔️ stubbing
: : 만들어진 mock 객체의 메소드를 실행했을 때 어떤 리턴 값을 리턴할지를 정의하는 것

    when("메소드가 진행될 조건").thenReturn("리턴할 값");

    when(memberService.findById(1L)).thenReturn(Optional.of(member));
    when(studyRepository.save(study)).thenReturn(study);

✔️ 자주 쓰이는 애노테이션

    @DisplayName() : 테스트의 이름을 지정

<br>

✔️TestContainers 추가

- build.gradle

      testImplementation 'org.testcontainers:testcontainers:1.17.6'
      testImplementation 'org.testcontainers:junit-jupiter:1.18.1'
      // DB를 postgresql로 사용 중이므로 아래 설정을 추가
      testImplementation "org.testcontainers:postgresql:1.18.1"

<br>

✔️ Jmeter 설치 및 실행 명령어

- 설치

      brew install Jmeter

- 실행

      cd /opt/homebrew/bin
      open jmeter


<br>

✔️ ChaosMonkey 추가

- build.gradle

      implementation 'de.codecentric:chaos-monkey-spring-boot:2.1.1'
      implementation 'org.springframework.boot:spring-boot-starter-actuator'

<br>

✔️ ArchUnit 추가

- build.gradle

      testImplementation 'com.tngtech.archunit:archunit:1.0.0'
      testImplementation 'com.tngtech.archunit:archunit-junit5-engine:1.0.0'

<br>
[참고]

✔️ assertEquals()


- 경로

      import static org.junit.jupiter.api.Assertions.assertEquals;

- build.gradle (사용 중인 java 및 gradle 버전에 맞춰 추가!)

      testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'

<br>