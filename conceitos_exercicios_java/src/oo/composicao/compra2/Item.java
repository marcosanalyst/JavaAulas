package oo.composicao.compra2;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	Compra compra; // Um item pode ter uma Compra associada
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	

}
