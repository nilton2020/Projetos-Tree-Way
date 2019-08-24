package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {

	public static void main(String[] args) {
		Map<Long, String> example0 = new HashMap<Long, String>();
		example0.put(1234567878968875L, new String("V1"));

		Map<String, String> example = new HashMap<String, String>();
		// Vamos adicionar alguns valores na nossa lista
		example.put("K1", "V1");
		example.put("K2", "V2");
		example.put("K3", "V3");
		example.put("K4", "V4");
		example.put("K5", "V5---");
		example.put("K5", "V5ss");

		String KeyToSearch = "K1";
		if (example.containsKey(KeyToSearch)) {
			System.out.println("Valor da Chave" + KeyToSearch + " = " + example.get(KeyToSearch));
		} else {
			System.out.println("Chave não existe");
		}
		
		
		/*
		 * O método "KeySet()" retorna um set com todas as chaves do 
		 * nosso HashMap, e tendo o Set com todas as Chaves, 
		 * podemos facilmente pegar 
		 * os valores que desejamos 
		 */
		
		for (String key : example.keySet()) {
			// Capturamos o valor a partir da chave 
			String value = example.get(key);
			System.out.println(key + " = " + value);
		}
		

	}

}
