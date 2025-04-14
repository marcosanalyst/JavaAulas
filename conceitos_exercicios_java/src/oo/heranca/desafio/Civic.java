package oo.heranca.desafio;

public class Civic extends Carro{
	
	Civic(){
		super(212); // velocidade máxima atribuida
	}
	
	
	@Override
	void acelerar() {
		velocidadeAtual += 10;
		return ;
	}

}


