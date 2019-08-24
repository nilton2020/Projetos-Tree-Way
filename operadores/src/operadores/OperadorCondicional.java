package operadores;

import java.util.Scanner;

public class OperadorCondicional {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int maior = 18;
		int idade;
		String resultado;
		System.out.println("Qual é a sua idade? ");
		idade = input.nextInt();
		
		System.out.println(idade >= maior ? "Maior de Idade":"Menor de Idade");
		resultado = idade >=maior ? "Maior de Idade":"Menor de Idade";
		
		System.out.println(resultado);
		
		
		
	}

}
