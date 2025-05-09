package arrays;
// Foreach = "para cada", forma mais simples de fazer um loop
public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4}; // declarei o Array
		
		// for clássico
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		// foreach simplificado
		for(double nota: notas) {
			System.out.print(nota + " ");;
		}
		
	}

}
