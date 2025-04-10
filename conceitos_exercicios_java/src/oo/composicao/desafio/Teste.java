package oo.composicao.desafio;

public class Teste {
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Carderno", 10.00, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000.00), 1);
		
		Cliente cliente = new Cliente("Marcos Silva");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
		
	}

}
