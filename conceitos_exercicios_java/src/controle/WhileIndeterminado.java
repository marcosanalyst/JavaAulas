package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valorDigitado = "";
		
		while(!valorDigitado.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valorDigitado = entrada.nextLine();
		}
		
		entrada.close();
	} 
	

}
