package com.unifacisa.reps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unifacisa.reps.entity.Aluno;

@Repository 
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	
	
}
