package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(){
		super(315);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	@Override // validação se o método existe da classe pai
	void acelerar() {
		velocidadeAtual += 15;
		return ;
	}

}


