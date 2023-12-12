package fundamentos;

import java.util.Scanner;

public class ConsoleScanner {
	public static void main(String[] args) {
		
		System.out.print("Hi");
		System.out.println("\nHello");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("%d %d %d %d %d %d", 5, 9, 28, 44, 49, 57);
		
		// posso usar %n ou \n para quebra de linha
		System.out.printf("%nSalário: %.2f",4800.7777);
		
		// tipo  + nome da variável = recebe novo valor 
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("\nDigite o seu nome: ");
		String nome = entradaTeclado.nextLine();
		
		System.out.println("\nDigite o seu sobrenome");
		String sobrenome = entradaTeclado.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		// ATENÇÃO! nextInt (pois pegarei número inteiro e não string) 
		int  idade = entradaTeclado.nextInt();
		
		
		System.out.printf("%s %s tem %d anos!", nome, sobrenome, idade);
		
		// fechar o Scanner
		
		entradaTeclado.close();
		
		
		
		
		
	}
}
