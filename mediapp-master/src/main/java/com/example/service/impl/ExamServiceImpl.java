package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Exam;
import com.example.repository.ExamRepository;
import com.example.repository.GenericRepository;
import com.example.service.ExamService;

@Service
public class ExamServiceImpl extends GenericServiceImpl<Exam, Integer> implements ExamService{

	@Autowired
	private ExamRepository examRepository;

	@Override
	protected GenericRepository<Exam, Integer> getRepository() {
		return examRepository;
	}
}
