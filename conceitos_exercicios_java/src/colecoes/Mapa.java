package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// estrutura CHAVE e VALOR
public class Mapa {
	public static void main(String[] args) {
		//Map<K, V> K: Key, V: Value
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		// não usa add, usa put
		
		usuarios.put(1, "Roberto"); // put adiciona e também pode atualizar
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // vai retornar todas as chaves: [1, 2, 3, 4] 
		
		System.out.println(usuarios.values()); // vai retornar todos os valores:  [Roberto, Ricardo, Rafaela, Rebeca]

		System.out.println(usuarios.entrySet()); // chave e valor ao mesmo tempo:  [1=Roberto, 2=Ricardo, 3=Rafaela, 4=Rebeca]
		
		System.out.println(usuarios.containsKey(4)); // true
		System.out.println(usuarios.containsKey("Roberto")); // true
		
		System.out.println(usuarios.get(2)); // Ricardo
		System.out.println(usuarios.remove(2));
		System.out.println(usuarios.remove(4, "Gui")); // remoção por chave e valor, porém dará falso pois o valor "Gui" não é compatívil com a Key 4.
		
		// percorrer elementos de um MAP
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
	}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		// percorrer os dois ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
		
	}
	
}
