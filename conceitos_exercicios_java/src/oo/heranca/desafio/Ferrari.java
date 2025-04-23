package oo.heranca.desafio;
			//implements ==> determinada classe implementa uma classe
public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		super(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(35);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;							
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
		
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
					return 15;
		}
	}
	
//	@Override // validação se o método existe da classe pai
//	public void acelerar() {
//		velocidadeAtual += 15;
//		return ;
//	}

}


