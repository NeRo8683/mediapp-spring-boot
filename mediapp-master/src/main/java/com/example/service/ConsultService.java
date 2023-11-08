package com.example.service;

import java.util.List;

import com.example.model.Consult;
import com.example.model.Exam;

public interface ConsultService extends GenericService<Consult, Integer> {
	
	Consult saveTransactional(Consult consult, List<Exam> exams);
	
}
