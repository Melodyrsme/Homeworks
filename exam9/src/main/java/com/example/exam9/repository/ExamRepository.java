package com.example.exam9.repository;

import com.example.exam9.entity.ExamProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamProjectEntity, Long> {
}
