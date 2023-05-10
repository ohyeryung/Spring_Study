package com.smile.test_study.study;

import com.smile.test_study.domian.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {
}
