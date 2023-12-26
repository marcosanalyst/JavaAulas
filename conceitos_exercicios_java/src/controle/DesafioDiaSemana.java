package controle;

import java.util.Scanner;

public class DesafioDiaSemana { 
	public static void main(String[] args) {
		
		// Criar Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia da semana: ");
		
		String nomeDigitado = entrada.next();
		
		// lembrar que comparação de Strings não usa "=="
		if(nomeDigitado.equalsIgnoreCase("domingo")){
			System.out.println(1);		}
		
		else if(nomeDigitado.equalsIgnoreCase("segunda")){
			System.out.println(2);
		}
		else if(nomeDigitado.equalsIgnoreCase("terça") 
				|| nomeDigitado.equalsIgnoreCase("terca")){
			System.out.println(3);
		}
		else if(nomeDigitado.equalsIgnoreCase("quarta")){
			System.out.println(4);
		}
		else if(nomeDigitado.equalsIgnoreCase("quinta")){
			System.out.println(5);
		}
		else if(nomeDigitado.equalsIgnoreCase("sexta")){
			System.out.println(6);
		}
		else if(nomeDigitado.equalsIgnoreCase("sábado") || 
				nomeDigitado.equalsIgnoreCase("sabado")){
			System.out.println(7);
		}
				
		else{System.out.println("Dia inválido!");}
		
		entrada.close();
	}

}
