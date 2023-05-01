## Querydsl 공부하는 Repository입니다.
### 참고하는 강의 : 인프런 "실전! Querydsl"

#### 공부한 내용 요약

✔️ version
: 
    
    java 11
    Springboot 2.7.4
    querydsl 5.0.0


✔️ build.gradle 
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

