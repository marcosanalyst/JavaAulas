package oo.composicao.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(45, "Mario");
		p1.setIdade(31);// ALTERAR o valor da variável
		
		System.out.println(p1.getIdade()); // LER o valor da variável
		System.out.println(p1);// toString
	}

}
