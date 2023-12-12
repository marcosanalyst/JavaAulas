package fundamentos;

public class Ternario { 
	public static void main(String[] args) {
		
		double media = 4.0;
		
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
						
		                     // O ideal é sempre escrever a condição mais importante!!
		                     // CONDICAÇÃO   ? VERDADEIRO : FALSO 	
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
	}

}
