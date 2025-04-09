package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {
	public static void main(String[] args) {
										// <> posso deixar vazio, o java sabe que estou lidando com String 
	//	Set<String> listaAprovados = new HashSet<String>(); // <String> defini que obrigatoriamente devo adicionar apenas Strings!!
		// lista.add(1.2); // erro de compilação: The method add(String) in the type Set<String> is not applicable for the arguments (double)
		// a lista só aceitará valores String
	
		
		SortedSet<String> listaAprovados = new TreeSet<String>(); // ordenação por ordem de sessão
		listaAprovados.add("1.2 teste");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		listaAprovados.add("Marcos");
		
		// set não respeita ordenação! Não imprimirá em ordem. Porém, posso usar o SortedSet e TreeSet para respeitar a ordem
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<Integer>(); // ordenação por ordem de sessão
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(4);
		
		for(int n: nums) {
			System.out.println(n); // trará organizado: 1,2,3,4
		}
	}

}
