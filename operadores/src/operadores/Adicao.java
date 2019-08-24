package operadores;
import java.util.Scanner;
public class Adicao {


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1 , num2, resultado;
		System.out.println("Informe primeiro número: ");
		num1 = input.nextInt();
		System.out.println("Informe segundo número: ");
		num2 = input.nextInt();
		resultado = num1 + num2;
		System.out.println("O resultado da soma é "+ resultado);
		
	}

}
