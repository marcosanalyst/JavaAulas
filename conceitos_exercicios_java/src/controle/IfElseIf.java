package controle;

import java.util.Scanner;

public class IfElseIf { 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota >10 || nota <0) {
			System.out.println("Nota inválida");
		} else if(nota >= 9.0) {
			System.out.println("Conceito A!");
		} else if (nota >= 7.0) {
			System.out.println("Conceito B!");
		} else if (nota >= 5.0) {
			System.out.println("Conceito C!");
		} else if (nota >= 3.0) {
			System.out.println("Conceito D!");
		} else if (nota <= 3.0) {
			System.out.println("Conceito E!");
		}			else {
			System.out.println("Conceito inválido!");
		}
		
		entrada.close();
	}

}

/* Estrutura adotada
 * 
 * if(condição) {}
 * else if(condicação) {}
 * else if(condicação) {}
 * else if(condicação) {}
 * else if(condicação) {}
 * else{}
 *  
 */
