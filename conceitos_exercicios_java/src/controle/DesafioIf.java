package controle;

public class DesafioIf {
	public static void main(String[] args) {
		
		// Descobrir o que será impresso
		// Onde está o bug do código?
		
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de Honra!");
			System.out.println("Parabéns você é fera!!");
		}
		
		/*
		 * O erro acima está na linha 11 no ";"
		 * mesmo se a variável estiver com o valor abaixo da condição
		 * a sentença será executada de forma errada.
		 * Para corrigir basta remover o o ";"
		 * 
		 * Comand + Shift + F (formatação do código, 
		 * ela nos dará uma dica do problema.
		 * )
		 */
		
	}

}
