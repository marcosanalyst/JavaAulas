package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana"); // posso criar um usuário dessa forma
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // index 3 Bia
		
		System.out.println("Este foi removido >>> " + lista.remove(1)); // remover Carlos
		 // remover pelo Usuario!!
		System.out.println("Foi removido? " + lista.remove(new Usuario("Manu"))); // vai remover e retornar FALSE ou TRUE
		
		System.out.println("Tem o elemento? " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
