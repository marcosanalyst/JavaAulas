package oo.heranca.jogo.teste;

import oo.heranca.jogo.Direcao;
import oo.heranca.jogo.Heroi;
import oo.heranca.jogo.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi(10,11); // valor de x e y
				
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
	}

}
