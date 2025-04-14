package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	public Ferrari(){
		super(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}
	
	@Override // validação se o método existe da classe pai
	public void acelerar() {
		velocidadeAtual += 15;
		return ;
	}

}


