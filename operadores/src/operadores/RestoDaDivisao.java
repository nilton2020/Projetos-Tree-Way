package operadores;

import java.util.Scanner;

public class RestoDaDivisao {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float num1 , num2, resultado;
		System.out.println("Informe primeiro n�mero: ");
		num1 = input.nextFloat();
		System.out.println("Informe segundo n�mero: ");
		num2 = input.nextFloat();
		resultado = num1 % num2;
		System.out.println("O resto da divis�o �: "+ resultado);
	}

}

