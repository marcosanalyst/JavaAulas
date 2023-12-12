package fundamentos;

public class ConversaoTipoPrimitivoNumerico { 
	public static void main(String[] args) {
		
		// IMPORTANTE LEMBRAR QUE O JAVA NÃO AVALIAR O VALOR ELE AVALIA O TIPO!!
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		// padrão conversão implícita
		float b = 1.0F;
		
		// cast, aqui eu específico para o JAVA que pode converter o valor para um float
		float c = (float )2.0;
		System.out.println(c);
		
		// Explo de perda de informação
		
		double d = 1.123456789;
		System.out.println("\n" + d);
		
		float d2 = (float)1.123456789; // conversão explícita (CAST)
		System.out.println(d2);
		
		// + exemplos
		
		int y = 340;
		byte x = (byte) y; // explícita
		System.out.println(x);
	
		double e = 1.9999;
		int f = (int) e; 
		System.out.println(f);
	}

}
