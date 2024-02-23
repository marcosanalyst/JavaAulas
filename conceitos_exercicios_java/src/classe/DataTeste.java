package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		// tipo da variável + nome da variável = atribuição da var
		Data d1 = new Data();
		
		// chama o construtor		
		d1.dia = 5;
		d1.mês = 3;
		d1.ano = 1999;
		
		
		var d2 = new Data();
		d2.dia = 9;
		d2.mês = 10;
		d2.ano = 2024;
		
		// refatorando com d3
		
		Data d3 = new Data();
		d3.dia = 8;
		d3.mês = 12;
		d3.ano = 1966;
		
			
		// testando construtor com três parâmetros
		
		Data d4 = new Data(1,1,1970);
		
		System.out.printf("%d/%d/%d\n", d1.dia,d1.mês,d1.ano);
		
		System.out.printf("%d/%d/%d\n", d2.dia,d2.mês,d2.ano);
		
		//refatorada
		System.out.println(d3.obterDataFormatada());
	}

}
