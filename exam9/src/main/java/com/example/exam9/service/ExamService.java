package com.example.exam9.service;

import com.example.exam9.entity.ExamProjectEntity;

import java.util.List;

public interface ExamService {
    Integer getMaxRequests();
    ExamProjectEntity saveEntity(ExamProjectEntity project);
    List<ExamProjectEntity> getAllReports();
}
