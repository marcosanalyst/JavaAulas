package controle;

import java.util.Iterator;

public class Break {
	public static void main(String[] args) {
		
		// for NORMAL
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		} 
		
		// for com BREAK p/ exemplificar o uso do break 
		
		for (int j = 0; j < 10; j++) {
			
			if(j == 5) {
				break;
			}
			System.out.println(j);
		}
			System.out.println("Fim!");
	}

}
