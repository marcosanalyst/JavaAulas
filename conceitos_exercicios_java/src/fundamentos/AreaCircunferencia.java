package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		// tipo de variável + nome da variável + valor da variável
		double raio = 3.4;
		
		// não posso atribuir um novo valor ao pi, por isso uso o "final double"
		final double PI = 3.14159;
		
		// formula da circunferência 
		// pi * raio * raio
		
		// constante geralmente usamos letra mauscula
		System.out.println("Área = " + PI * raio * raio + "m²");
		
	}

}
