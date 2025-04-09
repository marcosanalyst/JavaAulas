package classe;

import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ex.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ex.com.br";
		
		System.out.println(u1 == u2); // falso, comparação de endereço de memória
		System.out.println(u1.equals(u2)); // falso, equals fará a mesma coisa que ==
		System.out.println(u2.equals(u1)); // falso
		System.out.println(u2.equals(u2)); // verdadeiro
		System.out.println(u1.equals(u1)); // verdadeiro
		
		// resultados acima, antes da implementação do equals
		
	// 	System.out.println(u2.equals(new Date())); // false
		
	}

}
