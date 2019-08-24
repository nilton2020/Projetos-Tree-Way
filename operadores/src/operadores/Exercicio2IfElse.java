package operadores;

import java.util.Scanner;

public class Exercicio2IfElse {

	public static void main(String[] args) {
		int num1 , num2 , num3;
		Scanner input = new Scanner(System.in);
		System.out.println("1º NÚMERO: ");
		num1 = input.nextInt();
		System.out.println("2º NÚMERO: ");
		num2 = input.nextInt();
		System.out.println("3º NÚMERO: ");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " num1 é o maior número ");
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2 + " num2 é o maior número ");
		}else {
			System.out.println(num3 + " num3 é o maior número ");
		}

	}

}
