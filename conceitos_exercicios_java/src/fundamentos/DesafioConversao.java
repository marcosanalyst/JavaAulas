package fundamentos;

import java.util.Scanner;

public class DesafioConversao { 
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Salário primeiro mês: ");
		double salario1 = entrada.nextDouble();
		
		System.out.println("Salário segundo mês: ");
		double salario2 = entrada.nextDouble();
		
		System.out.println("Salário terceiro mês: ");
		double salario3 = entrada.nextDouble();
		
		double totalSalarios = salario1 + salario2 + salario3; 
		double media = (totalSalarios)/3 ;
		
		System.out.println("Valor recebidos nos 3 últimos meses: R$ " + totalSalarios);
		System.out.println("Média de salário: R$ " + media);
		
				
		entrada.close();
		
	
}

}
