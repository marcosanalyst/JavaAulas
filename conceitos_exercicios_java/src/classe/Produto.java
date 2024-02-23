package classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	// Método preço com desconto
	
	// tipo + nome do método + (parâmetros
	// neste caso não precisa pois os dados já estão no objeto)
	
	// Nenhum parâmetro
	Produto(){
		
	}
	
	// 1 parâmetro
	Produto(String nomeInicial) {
		nome = nomeInicial;
		
	}
	// 2 parâmetros
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	// 3 parâmetros
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	
	
	
	double precoComDesconto(){
		return preco * (1 - desconto);
		
	}
}
