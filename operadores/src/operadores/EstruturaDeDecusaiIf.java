package operadores;

import java.util.Scanner;

public class EstruturaDeDecusaiIf {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual � a sua idade? ");
		
		idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade");
		} else {
			System.out.println("Voc� � menor de idade");
			}
		
		}
		
		
	}


