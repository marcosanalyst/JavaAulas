package oo.composicao.compra;

import java.util.ArrayList;

public class Compra {
	
	// homogênea, só posso adicionar itens dentro desta lista
	// relação 1 para N
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	// criar um método para saber o valor total da compra
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens)
			total += item.quantidade * item.preco;
		return total;
	}

}
