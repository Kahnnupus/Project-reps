package com.unifacisa.reps.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString // não sei pra q serve isso mt bem
public class Aluno {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private int matricula;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String endereco;
		
	//Exemplo da validação:
	@Column(nullable = false)
	@Min(value = 100, message = "O preço não pode ser abaixo de 100 e/ou nulo")
	private double mensalidade;
	
	

}
	