package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor, cópia do valor definido na memória
					  // (Tipo primitivo)	
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,2024);
		Data d2 = d1; // atribuição por referência (Objeto)
				
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2027;
		
		// as duas variáveis serão impactadas, pois é o mesmo endereço
		// de memória
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		voltarDataParaValorPadrao(d2);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		// neste caso não gerará impacto, c continuará a valer 5
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	} 	  
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
