package pacote;

import java.util.Scanner;

public class Caracter1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha m para masculino f para feminino");

		String sexo = scan.nextLine();
		try {
			selecionaSexo(sexo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void selecionaSexo(String sexo) throws Exception {
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("masculino");
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else {
			throw new Exception("Sexo inválido!");
		}
	}
}
