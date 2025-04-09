package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		// aceita heterogêneos: pode armazenar elementos de diferentes tipos.
		conjunto.add(1.2); // fará o casting! double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String não precisa de conversão
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		// O valores primitivos são convertidos automaticamente em um objeto da classe wrapper
		
		
		System.out.println("O tamanho do conjunto é: " + conjunto.size()); // 5
		
		conjunto.add("Teste"); // não adicionará o elemento, pois ele é repetido
		conjunto.add('x'); 	   // não adicionará o elemento, pois ele é repetido
		System.out.println("O tamanho do conjunto é: " + conjunto.size()); // 5
		
		System.out.println(conjunto.remove("teste")); // false, elemento não existe
		System.out.println(conjunto.remove("Teste")); // true, elemento existe
		System.out.println(conjunto.remove('x'));     // true, elemento existe
		
		System.out.println("O tamanho do conjunto é: " + conjunto.size()); // 4
		
		System.out.println(conjunto.contains('x')); // false, não contém, porque foi removido
		System.out.println(conjunto.contains(1)); // true, contém
		System.out.println(conjunto.contains(true)); // true, contém
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums); // [1, 2, 3]
		System.out.println(conjunto); // [1.2, 1, true]
		
		// posso adicionar todos ao mesmo conjunto
		// conjunto.addAll(nums); // adicionando tudo que é em "nums" para "conjunto", união entre dois conjunto
		conjunto.retainAll(nums);// intercecção [1]
		System.out.println(conjunto); // [1.2, 1, 2, 3, true]
		
		conjunto.clear(); // limpar todo o conjunto
		System.out.println(conjunto); // [] vazio		
		
		
	}

}
