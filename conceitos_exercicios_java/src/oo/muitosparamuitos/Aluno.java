package oo.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	// atributo 
	String nome;
	
	// Cada aluno estará associado a 1 ou mais cursos, então recebei uma lista de cursos!
	final List<Curso> cursos = new ArrayList<Curso>();
	
	// construtor de aluno
	Aluno(String nome){
		this.nome = nome;
	}
	// método para adicionar cursos
	void adicionarCurso(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this); // relação
		
	}
	
	/*
	A linha curso.alunos.add(this) assegura que o aluno não apenas adiciona o curso à sua própria lista,
	mas que o curso também registra o aluno em sua lista. Esse espelhamento é o coração da relação 
	"muitos-para-muitos", onde tanto o aluno quanto o curso podem "se ver" mutuamente.
	*/
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
	public String toString( ) {
		return nome;
	}
	

}
