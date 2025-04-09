package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>(); // método aceita todo tipo de fila
		
		// add e offer -> adicionam elementos na fila
		fila.add("Ana"); //lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia"); //retorna falso caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek -> retornará NULO se a fila estiver vazia
		// element -> retornará execeção NoSuchElementException, não tem esse elemento na fila
		System.out.println(fila.peek()); // retorna o primeiro elemento da fila
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna o primeiro elemento da fila
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.poll(); // retorna o primeiro elemento da fila já removendo!
		// fila.contains("x elemento");
		
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // se chamar remove com a fila vazia, gerará uma exceção
		System.out.println(fila.poll()); // se tiver vazia retorna falso 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
	}
}
