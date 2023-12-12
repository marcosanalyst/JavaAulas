package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		// Qual o index da variável na posição X?
		System.out.println("Olá pessoal".charAt(0));
		System.out.println("Olá pessoal".charAt(1));
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("B"));
		System.out.println(s.startsWith("b"));
		System.out.println(s.toLowerCase().startsWith("B"));
		System.out.println(s.toUpperCase().startsWith("b"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Marcos";
		var sobrenome = "Silva";
		var idade = 31;
		var salario = 7333.8997;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade 
				+ "\nSalário: " + salario);		
		
		// melhor maneira String de Formatação
		
		// simplificando
		System.out.printf("%s %s %d %f", nome, sobrenome, idade, salario);
		
		// completo
		System.out.printf("\n\n O Senhor(a) %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		
		// outra forma
		String frase = String.format("\n\n O Senhor(a) %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		//
		
		String maisUmaFrase = "\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade 
				+ "\nSalário: " + salario;
		
		System.out.println(maisUmaFrase);
		
		System.out.println("Frase qualquer.".contains("qualquer"));
		
				
		
	}

}
