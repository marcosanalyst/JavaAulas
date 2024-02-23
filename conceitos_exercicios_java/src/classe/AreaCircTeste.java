package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		
		AreaCirc a = new AreaCirc(5.6);
		
		System.out.println(a.area());
		
		// Alterando o valor de PI para 
		
		AreaCirc.pi = 3.1415;
		
		System.out.println(AreaCirc.pi);
		
				
	}

}


