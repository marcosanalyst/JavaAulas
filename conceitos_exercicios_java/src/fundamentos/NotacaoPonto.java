package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Boa noite X";
		s = s.replace("X","Senhor(a)");
		s = s.toUpperCase();
		s= s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Marcos".toUpperCase());
		
		String y = "Bom dia K"
				.replace("K", "visitante!")
				.toUpperCase()
				.concat("! :) ");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "." ! 
		
		
	}

}
