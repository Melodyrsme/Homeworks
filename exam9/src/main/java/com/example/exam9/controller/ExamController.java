package com.example.exam9.controller;

import com.example.exam9.entity.ExamProjectEntity;
import com.example.exam9.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ExamController {
    final ExamService examService;

    @PostMapping("/counter")
    public ExamProjectEntity saveEntity(ExamProjectEntity entity){
        return examService.saveEntity(entity);
    }

    @GetMapping("/report")
    public List<ExamProjectEntity> getAllReport(){
        return examService.getAllReports();
    }

    @GetMapping("/counter")
    public Integer getMaxRequests(){
        return examService.getMaxRequests();
    }
}
