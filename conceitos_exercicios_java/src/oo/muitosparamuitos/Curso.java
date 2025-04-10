package oo.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	// atributo 
	final String nome;
	
	// Cada curso estará associado a 1 ou mais alunos, então recebei uma lista de alunos!
	final List<Aluno> alunos = new ArrayList<Aluno>();
	
	// construtor de curso
	Curso(String nome){
		this.nome = nome;
	}
	
	// método para adicionar alunos
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this); // relação
		
		/*
		A linha curso.alunos.add(this) assegura que o aluno não apenas adiciona o curso à sua própria lista,
		mas que o curso também registra o aluno em sua lista. Esse espelhamento é o coração da relação 
		"muitos-para-muitos", onde tanto o aluno quanto o curso podem "se ver" mutuamente.
		*/
		
	}

}
