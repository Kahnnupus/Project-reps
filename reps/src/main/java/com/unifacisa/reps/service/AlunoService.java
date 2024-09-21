package com.unifacisa.reps.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unifacisa.reps.entity.Aluno;
import com.unifacisa.reps.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<Aluno> listarAlunos(){
		return alunoRepository.findAll();
	}
	
	public Aluno save(Aluno aluno){
		return alunoRepository.save(aluno);
	}
	

}
