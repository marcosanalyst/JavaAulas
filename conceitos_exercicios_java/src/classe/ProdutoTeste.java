package classe;

public class ProdutoTeste {
	
	// não preciso importar minha classe Produto, pois estão no mesmo pacote
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		// aqui o JAVA já inferiu o tipo da var como Produto!
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 980.00;
		p2.desconto = 0.27;
		
		Produto p3 = new Produto();
		p3.nome = "Monitor";
		p3.preco = 700.00;
		p3.desconto = 0.15;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		
		
		// nome do produto direto no construtor 
		Produto p4 = new Produto("Tablet");
		
		//p5 com 3 parâmetros
		// nomeInicial, precoInicial, descontoInicial
		// posso criar um novo produto de diversas formas!
		Produto p5 = new Produto("Headset Gamer", 800.00,0.90);
		
		
		double precoFinal1 = p1.preco *(1 - p1.desconto);
		double precoFinal2 = p2.preco *(1 - p1.desconto);
		
		// refatorando com p3
		
		double precoFinal3 = p3.precoComDesconto();
		
		
		double mediaCarrinho = ((precoFinal1 + precoFinal2 + precoFinal3) / 3);
		
		
		
		
		// Média do carrinho de compra
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
		
	}

}
