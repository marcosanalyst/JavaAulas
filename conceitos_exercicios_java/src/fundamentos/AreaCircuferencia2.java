package fundamentos;

public class AreaCircuferencia2 {
	
	public static void main(String[] args) {
		
		
		double raio = 5;
		double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.println(area);
		
		// Atribuindo novo valor a variável
		
		raio = 15;
		area = pi * raio * raio;
		System.out.println(area);
		
		
		// Atribuindo novo valor para o raio
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Área = " + area + "m²");
		
	}

}
