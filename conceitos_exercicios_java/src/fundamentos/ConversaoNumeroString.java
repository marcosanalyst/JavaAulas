package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		// após a conversão posso me beneficiar da Notação Ponto!
		
		System.out.println(num1.toString().length());
		
		// outra forma
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());

		
		/* Double.toString()
		 * Float.toString()
		 * Long.toString()
		 * Short.toString()		
		 */
		
		
	}

}
