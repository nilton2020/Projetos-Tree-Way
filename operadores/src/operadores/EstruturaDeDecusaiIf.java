package operadores;

import java.util.Scanner;

public class EstruturaDeDecusaiIf {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é a sua idade? ");
		
		idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
			}
		
		}
		
		
	}


