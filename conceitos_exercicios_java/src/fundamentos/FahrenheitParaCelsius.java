package fundamentos;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {

		// primeira resposta
		double F = 86;
		double a = (F - 32);
		double b = 5.0 / 9.0;

		double c = ((a) * (b));

		System.out.println("O valor em Graus Celsius é: " + c);

		// segunda resposta mais fácil e lógica

		double F2 = 86;
		double formula = (F2 - 32) * 5.0 / 9.0;

		double resultado = formula;

		System.out.println(resultado);

		// terceira resposta

		// final double isso porque o valor não muda de double p/ inteiro

		double fahrenheit = 86;

		final double fator = 5.0 / 9.0;
		final double ajuste = 32;
		double celsius = (fahrenheit - ajuste) * fator;

		System.out.println(celsius);

	}

}
