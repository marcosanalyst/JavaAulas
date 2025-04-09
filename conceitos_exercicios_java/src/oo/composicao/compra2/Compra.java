package oo.composicao.compra2;

import java.util.ArrayList;

public class Compra {
	// RELAÇÃO BIDIRECIONAL
	// homogênea, só posso adicionar itens dentro desta lista
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	//
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	// este método chamou o de cima
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	// criar um método para saber o valor total da compra
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens)
			total += item.quantidade * item.preco;
		return total;
	}

}
