package com.example.spring_jpa.repository;

import com.example.spring_jpa.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
