package operadores;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float num1 , num2, resultado;
		System.out.println("Informe primeiro número: ");
		num1 = input.nextFloat();
		System.out.println("Informe segundo número: ");
		num2 = input.nextFloat();
		resultado = num1 / num2;
		System.out.println("A divisão é : "+ resultado);

	}

}
