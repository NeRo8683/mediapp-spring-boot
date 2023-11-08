package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Specialty;
import com.example.repository.SpecialtyRepository;
import com.example.repository.GenericRepository;
import com.example.service.SpecialtyService;

@Service
public class SpecialtyServiceImpl extends GenericServiceImpl<Specialty, Integer> implements SpecialtyService{

	@Autowired
	private SpecialtyRepository specialtyRepository;

	@Override
	protected GenericRepository<Specialty, Integer> getRepository() {
		return specialtyRepository;
	}
}
