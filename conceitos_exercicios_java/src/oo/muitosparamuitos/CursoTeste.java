package oo.muitosparamuitos;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		
		Curso curso1 = new Curso("JAVA");
		Curso curso2 = new Curso("WEB");
		Curso curso3 = new Curso("REACT");
		
		// relacionamento entre os objetos
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		// trazendo os alunos 
		for(Aluno aluno: curso3.alunos) {
			System.out.println("estou matriculado no curso: " + curso3.nome);
			System.out.println("... e o meu nome é " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("JAVA");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}
	


}
