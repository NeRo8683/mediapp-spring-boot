package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Patient;
import com.example.repository.GenericRepository;
import com.example.repository.PatientRepository;
import com.example.service.PatientService;

@Service
public class PatientServiceImpl extends GenericServiceImpl<Patient, Integer> implements PatientService{

	@Autowired
	private PatientRepository patientRepository;

	@Override
	protected GenericRepository<Patient, Integer> getRepository() {
		return patientRepository;
	}

}
