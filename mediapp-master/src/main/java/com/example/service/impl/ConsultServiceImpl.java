package com.example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Consult;
import com.example.model.Exam;
import com.example.repository.ConsultExamRepository;
import com.example.repository.ConsultRepository;
import com.example.repository.GenericRepository;
import com.example.service.ConsultService;

@Service
public class ConsultServiceImpl extends GenericServiceImpl<Consult, Integer> implements ConsultService{

	@Autowired
	private ConsultRepository consultRepository;
	
	@Autowired 
	ConsultExamRepository consultExamRepository;

	@Override
	protected GenericRepository<Consult, Integer> getRepository() {
		return consultRepository;
	}

	@Transactional
	@Override
	public Consult saveTransactional(Consult consult, List<Exam> exams) {
		consultRepository.save(consult);
		exams.forEach(exam -> consultExamRepository.saveExam(consult.getIdConsult(), exam.getIdExam()));
		return consult;
	}
}
