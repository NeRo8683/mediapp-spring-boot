package com.example.service;

import java.util.List;

public interface GenericService<T, ID>{
	
	T save(T t);
	T update(T t);
	List<T> findAll();
	T findById(ID id);
	void delete(ID id);
	
	
}
