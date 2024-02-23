package classe;

public class MiniDesafio {
	
	int a = 3; // não pode mexer
	static int b = 8;
	
	public static void main(String[] args) {
		
		MiniDesafio p = new MiniDesafio(); // criei uma instância do tipo p
		
		// a partir da instância "p" consigo acessar o "a"
		System.out.println(p.a);
		
		System.out.println(b);
		//acessando sem instância, pois utilizei o static
		
		
	}

}
