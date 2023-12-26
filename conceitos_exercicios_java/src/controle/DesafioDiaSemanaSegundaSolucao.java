package controle;

import java.util.Scanner;

public class DesafioDiaSemanaSegundaSolucao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva o nome do dia da semana: ");
		
		String diaDigitado = entrada.next();
		
		if("domingo".equalsIgnoreCase(diaDigitado)){
			System.out.println(1);
		}
		else if("domingo".equalsIgnoreCase(diaDigitado)){
			System.out.println(1);
		}
		
		else if("segunda".equalsIgnoreCase(diaDigitado)){
			System.out.println(2);
		}
		
		else if("terça".equalsIgnoreCase(diaDigitado)
				|| "terca".equalsIgnoreCase(diaDigitado))
				{
			System.out.println(3);
		}
		
		else if("quarta".equalsIgnoreCase(diaDigitado)){
			System.out.println(4);
		}
		
		else if("quinta".equalsIgnoreCase(diaDigitado)){
			System.out.println(5);
		}
		
		else if("sexta".equalsIgnoreCase(diaDigitado)){
			System.out.println(6);
		}
		
		else if("sábado".equalsIgnoreCase(diaDigitado) 
				|| "sabado".equalsIgnoreCase(diaDigitado)){
			System.out.println(7);
		}
		
		else {
		System.out.println("Dia inválido!");
		}
		
		
		entrada.close();
	
	}

}
