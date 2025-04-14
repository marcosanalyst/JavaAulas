package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		
		
//		System.out.println(segredo); // não consigo acessar, porque é algo privado!
//		System.out.println(facoDentroDeCasa); // não consigo visualizar, pois está em outro pacote
		System.out.println(formaDeFalar); // devo acessar diretamente, através de herança!!!!
		System.out.println(new Ana().todosSabem);
	}
	

}
