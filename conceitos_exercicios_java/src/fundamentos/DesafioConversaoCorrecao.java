package fundamentos;

import java.util.Scanner;

public class DesafioConversaoCorrecao { 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		String nome = entrada.nextLine();
		
		System.out.println("Informe o primeiro salário: ");
		String valor1 = entrada.nextLine().replace(",","."); 
		
		System.out.println("\nInforme o segundo salário: ");
		String valor2 = entrada.nextLine().replace(",",".");
		
		System.out.println("\nInforme o terceiro salário: ");
		String valor3 = entrada.nextLine().replace(",",".");
		
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3; 
		System.out.println(" O " + nome + " tem a média de R$: " + media  );
				
		entrada.close();
		
		
	}

}
