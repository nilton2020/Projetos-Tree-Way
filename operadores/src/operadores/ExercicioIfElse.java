package operadores;

import java.util.Scanner;

public class ExercicioIfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double nota1 , nota2 , nota3 , nota4;
		System.out.println("Nota1: ");
		nota1 = input.nextDouble();
		System.out.println("Nota2: ");
		nota2 = input.nextDouble();
		System.out.println("Nota3: ");
		nota3 = input.nextDouble();
		System.out.println("Nota4: ");
		nota4 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >=6 ) {
			System.out.println("APROVADO");
		}else if(media < 6 && media >= 5) {
			System.out.println("Recupera��o");
		}else if(media <= 5) {
			System.out.println("Reprovado");
		}
		
		System.out.println("A m�dia �: "+ media);
		
		


	}

}
