package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		List<String> listaString = new ArrayList<String>();

		// Checa o tamanho
		System.out.println(listaString + ", size = " + listaString.size());

		// Adiciona itens ao ArrayList
		listaString.add("Contrato");
		listaString.add("Documento");
		listaString.add("Nota Fiscal");
		listaString.add("Nota Comercial");
		listaString.add("Preço");
		listaString.add("Caracteristica");

		System.out.println(listaString + ", size =" + listaString.size());

		// Remove item, usa equals e hastCode
		listaString.remove("Documento");

		System.out.println(listaString + ", size =" + listaString.size());

		// Checa se a lista contem o elemento especiicado
		Boolean contem = listaString.contains("Nota Fiscal");
		System.out.println("A lista contem Nota Fiscal = " + contem);

//		for (String string : listaString) {
//			System.out.println(string);
//		}
		listaString.forEach((str) -> System.out.println(str));
	}
}
