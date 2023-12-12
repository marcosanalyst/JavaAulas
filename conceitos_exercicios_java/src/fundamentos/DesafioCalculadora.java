package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora { 
	public static void main(String[] args) {
		
		// ler numero1
		// ler numero2
		// informar qual a operação
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		String operacao = entrada.next();
		
		// Lógica
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%f %s %f = %f", num1, operacao, num2, resultado);
		
		entrada.close();
	
			
	}

}
