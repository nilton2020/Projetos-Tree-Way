package operadores;

import java.util.Scanner;

public class CompararString {

	public static void main(String[] args) {
		
		String sexo;
		Scanner input = new Scanner(System.in);
		System.out.println("DIGITE SEU SEXO, SENDO 'M' PARA MASCULINO E 'F' PARA FEMININO");
		sexo = input.next();
						
		if(sexo.equalsIgnoreCase("M")) {
			System.out.println("MASCULINO");
		}else if(sexo.equalsIgnoreCase("F")) {
			System.out.println("FEMININO");
		}else {
			System.out.println("SEXO INVÁLIDO");
		}

	}

}
