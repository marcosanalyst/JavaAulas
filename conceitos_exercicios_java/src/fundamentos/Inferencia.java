package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		// não preciso informar o tipo, o JAVA vai inferir pelo valor que eu coloquei
		
		var b = 5.5;
		System.out.println(b);
		
		var c = "Texto qualquer";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d;
		d = 123.65;
		System.out.println(d);
		
		boolean e;
		e = true;
		System.out.println(e);
		
		
		
	}

}
