package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // neste caso peek vai retornar o último que entrou na pilha!
		System.out.println(livros.element());
		
	//	System.out.println(livros.poll());
	//	System.out.println(livros.poll());
	//	System.out.println(livros.poll());
	//	System.out.println(livros.remove());
		
	//	System.out.println(livros.pop()); // pop também remove!
		
	//	livros.size();
	//	livros.clear();
	//	livros.contains("x livro");
	//	livros.isEmpty();
		
		for(String livro: livros) {
			System.out.println("..." + livro); 
			
		}
				
	}

}
