package com.example.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.model.ConsultExam;

public interface ConsultExamRepository extends GenericRepository<ConsultExam, Integer>{
	
	@Modifying
	@Query(value="INSERT INTO consult_exam(id_consult, id_exam) VALUES(:idConsult, :idExam)", nativeQuery = true)
	Integer saveExam(@Param("idConsult") Integer idConsult, @Param("idExam") Integer idExam);
	
}
