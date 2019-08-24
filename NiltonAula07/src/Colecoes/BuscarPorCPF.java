package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class BuscarPorCPF {
	public String retornarNomePorCPF (String cpf) {
		Map<String, String> cadastro = new HashMap<String, String>();
		cadastro.put("123.123.123-34", "Carlos");
		cadastro.put("321.321.321-56", "João");
		cadastro.put("456.456.456-78", "Martha");
		cadastro.put("678.678.678-90", "Maria");
		cadastro.put("234.234.234-56", "Joana");
		
		if (cadastro.containsKey(cpf)) {
			return "Propietario do CPF" + cpf + " = " + cadastro.get(cpf);
		} else {
			return "CPF não existe";
		}
	}
}
