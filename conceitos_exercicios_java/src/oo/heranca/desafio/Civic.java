package oo.heranca.desafio;

public class Civic extends Carro{
	
	public Civic(){
		super(212); // velocidade máxima atribuida
	}
	
	
	@Override
	public void acelerar() {
		velocidadeAtual += 10;
		return ;
	}

}


