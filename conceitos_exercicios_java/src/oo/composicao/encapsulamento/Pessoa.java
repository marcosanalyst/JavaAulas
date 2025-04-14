package oo.composicao.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	// construtor
	public Pessoa(int idade, String nome) {
		setNome(nome);
		setIdade(idade);
	}
	
	// Getter método que lê!
	// lerIdade ==> getIdade
	public int getIdade() {
		return idade;
	}
	
	// Setter método que altera!
	// alterarIdade ==> setIdade
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade); // valor negativo passa a ser positivo
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Olá tenho " + getIdade() + " anos e meu nome é"
				+ getNome() + "!";}
		

}
