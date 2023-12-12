package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");      //T
		
		String s1 = new String("2");
		System.out.println("2" == s1);       //F
		System.out.println("2".equals(s1));  //T
		
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // F
		System.out.println("2".equals(s2.trim())); // T
		
		
		entrada.close();
		
		
	}

}
