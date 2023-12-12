package fundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho terça  (V ou F)
		// Trabalho na quinta (V ou F)
		
		/* se apenas 1 trabalho der certo vai comprar a tv de 32
		 *  se os dois trabalhos derem certo vai comprar a tv de 50
		 *  nos dois casos, eles vão comprar sorteve
		 *  porém se não trabalhar nenhum dia não tomarão sorvete
		 */
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50? " + comprouTv50);
		System.out.println("Comprou TV 32? " + comprouTv32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		
		System.out.println("Mais saudável? " + maisSaudavel);

		
		
	}

}
