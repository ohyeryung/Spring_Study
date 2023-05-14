package com.example.spring_jpa;

import com.example.spring_jpa.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@SpringBootTest
@Transactional
public class MemberJpaTest {

    @PersistenceContext
    EntityManager em;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void memberEnroll() {
        Member member = new Member(1L, "yeryung");
        memberRepository.save(member);

        // member 엔티티의 id를 기준으로 중복 체크
        Member existingMember = em.find(Member.class, member.getId());

        // 이미 영속성 컨텍스트에 존재하는 경우, 해당 엔티티를 분리(detach)한다.
        if (existingMember != null) {
            em.detach(existingMember);
        }

        // 영속성 컨텍스트에 새로운 member 엔티티를 병합(merge)한다.
        em.merge(member);

    }

}
