package classe;

public class ValorNull {
	
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.contains("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if(d1 != null) {
			d1.mês = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Ooii" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat(":/ :) :( "));
		}
		
	}
}
