package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		// Math.pow(a,b) = primeiro número (baixo), segundo número (alto - elevação)
	
		double a = 6*(3 + 2);
		a = Math.pow(a, 2);
				
		double b = 3*2;
		
		double c = a/b;
		
		// - 
		
		double d = (1-5) * (2-7) /2;
		d = Math.pow(d, 2);
		
		double superior = c - d;
		superior = Math.pow(superior, 3);
		
		double inferior = Math.pow(10, 3);
		
		double resultadoFinal = superior / inferior;
		
		System.out.println(resultadoFinal);
			
			// correto :)		  
	}

}
