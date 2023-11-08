package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Medic;
import com.example.repository.GenericRepository;
import com.example.repository.MedicRepository;
import com.example.service.MedicService;

@Service
public class MedicServiceImpl extends GenericServiceImpl<Medic, Integer> implements MedicService{

	@Autowired
	private MedicRepository medicRepository;

	@Override
	protected GenericRepository<Medic, Integer> getRepository() {
		return medicRepository;
	}
}
