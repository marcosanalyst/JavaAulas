package oo.composicao.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();
	void testeAcessos() {
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
//		System.out.println(esposa.segredo); // não consigo acessar, porque é algo privado!
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}

}
