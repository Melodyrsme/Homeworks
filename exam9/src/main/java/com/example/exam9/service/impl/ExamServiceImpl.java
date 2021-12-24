package com.example.exam9.service.impl;

import com.example.exam9.entity.ExamProjectEntity;
import com.example.exam9.repository.ExamRepository;
import com.example.exam9.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExamServiceImpl implements ExamService {
    final ExamRepository examRepository;

    @Override
    public Integer getMaxRequests() {
        return examRepository.findAll().size();
    }

    @Override
    public ExamProjectEntity saveEntity(ExamProjectEntity project) {
        return examRepository.save(project);
    }

    @Override
    public List<ExamProjectEntity> getAllReports() {
        return examRepository.findAll();
    }
}
