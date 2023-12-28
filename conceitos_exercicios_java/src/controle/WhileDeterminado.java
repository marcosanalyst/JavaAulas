package controle;

public class WhileDeterminado {
	public static void main(String[] args) {
		
		// variável
		int contador = 0;
			   // expressão	
		while (contador <=10) {
			System.out.println("Bom dia!");
			contador ++; // incremento
		}
		
		int contador2 = 0;
		
		while (contador2 <10) {
			System.out.println("Boa tarde.");
			contador2 +=2; // incremento de dois em dois
		}
		
		int contador3 = 0;
		
		while (contador3 <=20) {
			System.out.printf("i = %d\n", contador3);
			contador3 +=5;
		}
	}
	
}
