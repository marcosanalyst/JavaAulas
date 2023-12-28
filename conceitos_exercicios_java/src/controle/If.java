package controle;

import java.util.Scanner;

public class If { 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double nota = entrada.nextDouble();
		
		// "if" + "(condição)" + "{indentação/resultado}" 
		
		if(nota >= 7.0 && nota <= 10.0) {
			System.out.println("Aluno Aprovado");
		}
		if(nota < 7.0 && nota >=4.5) {
			System.out.println("Aluno em Recuperação!");
		}
		if(nota <4.5 && nota >=0) {
			System.out.println("Aluno Reprovado!");
		}
		
		entrada.close();
		
	}

}
