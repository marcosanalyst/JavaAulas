package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		
		// dentro do RANGE
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// Tipos numéricos reais com ponto flutuante
		
		float salario = 11_440.50F;
		double vendasAcumuladas = 2_991_000_007.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caracter 
		char status = 'A'; // Ativo
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		
		System.out.println(numerosDeVoos / 2 );
		
		// Pontos acumulados
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " : ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
		
		
		
		
		
		
	}

}
