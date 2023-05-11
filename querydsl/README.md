## Querydsl 공부하는 Repository입니다.
### 참고하는 강의 : 인프런 "실전! Querydsl"

#### 공부한 내용 요약

✔️ version
: 
    
    java 11
    Springboot 2.7.4
    querydsl 5.0.0


✔️ build.gradle 설정
: 

    buildscript {
        ext {
            queryDslVersion = "5.0.0"
            }
    }

    plugins {
        id 'java'
        id 'org.springframework.boot' version '2.7.4'
        id 'io.spring.dependency-management' version '1.1.0'
        // querydsl 추가
        id 'com.ewerk.gradle.plugins.querydsl' version '1.0.10'
    }

    dependencies {
    
        // querydsl 추가
        implementation "com.querydsl:querydsl-jpa:${queryDslVersion}"
        implementation "com.querydsl:querydsl-apt:${queryDslVersion}"
    
    }

    //querydsl 추가 시작
    def querydslDir = "$buildDir/generated/querydsl"
    querydsl {
        jpa = true
        querydslSourcesDir = querydslDir
    }
    sourceSets {
        main.java.srcDir querydslDir
    }
    configurations {
        querydsl.extendsFrom compileClasspath
    }
    compileQuerydsl {
        options.annotationProcessorPath = configurations.querydsl
    }
    //querydsl 추가 끝

<br>

✔️ Q class 인스턴스 사용
    
    QMember qMember = new QMember("m"); //별칭 직접 지정 
    QMember qMember = QMember.member; //기본 인스턴스 사용

<br>

✔️ static import와 함께 사용

    import static study.querydsl.entity.QMember.*;
   
    @Test
    public void startQuerydsl3() {
        //member1 찾기
        Member findMember = queryFactory
        .select(member)
        .from(member)
        .where(member.username.eq("member1"))
        .fetchOne();

        assertThat(findMember.getUsername()).isEqualTo("member1");

    }

<br>

✔️ 결과 조회

- <code>fetch()</code> : 리스트 조회, 데이터 없으면 빈 리스트 반환 
- <code>fetchOne()</code> : 단 건 조회 
  - 결과가 없으면 : <code>null</code>
  - 결과가 둘 이상이면 : <code>com.querydsl.core.NonUniqueResultException</code> 
- <code>fetchFirst()</code> : <code>limit(1).fetchOne()</code>
- <code>fetchResults()</code> : 페이징 정보 포함, total count 쿼리 추가 실행, 현재는 <code>deprecated 상태</code> (2023.05 기준) 
- <code>fetchCount()</code> : count 쿼리로 변경해서 count 수 조회

<br>

✔️ 서브 쿼리(Sub Query) 사용 예시 (where절, select절 모두 사용 가능)

    /**
     * 나이가 가장 많은 회원 조회
     */

    @Test
    public void subQuery() throws Exception {
      QMember memberSub = new QMember("memberSub");
      List<Member> result = queryFactory
                  .selectFrom(member) // select + from 함께사용 가능
                  .where(member.age.eq(
                      JPAExpressions
                            .select(memberSub.age.max())
                            .from(memberSub)
                  )) 
                  .fetch();

      assertThat(result).extracting("age")
                .containsExactly(40);

    }


✔️ 서브 쿼리 사용 예시 (select절)

    List<Tuple> fetch = queryFactory
          .select(member.username,
                JPAExpressions
                .select(memberSub.age.avg())
                .from(memberSub)
          ).from(member)
          .fetch();

    for (Tuple tuple : fetch) {
        System.out.println("username = " + tuple.get(member.username));
        System.out.println("age = " +
      tuple.get(JPAExpressions.select(memberSub.age.avg())
            .from(memberSub)));
    }