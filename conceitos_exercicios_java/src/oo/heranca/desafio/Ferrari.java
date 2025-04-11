package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	@Override // validação se o método existe da classe pai
	void acelerar() {
		velocidadeAtual += 15;
		return ;
	}

}


