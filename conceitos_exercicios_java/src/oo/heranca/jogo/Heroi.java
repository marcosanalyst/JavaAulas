package oo.heranca.jogo;
// Heroi vai receber código para reuso a partir do mecânismo de Herança
public class Heroi extends Jogador{
	
	// sobrescrevendo o comportamento
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
	
		return ataque1 || ataque2 || ataque3;
		}
		
	}


