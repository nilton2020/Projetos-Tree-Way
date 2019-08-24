package operadores;

import java.util.Scanner;

public class RestoDaDiv {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double num1;
					
		System.out.println("***Programa ler número digitado e retornar o valor ímpar ou par*****");
		System.out.println("Digite o número:");
		
		num1 = input.nextDouble();
		
					
		if(num1 % 2 == 0) {
			
			System.out.println("O número digitado é PAR");
			
		}else {
			System.out.println("O número digitado é ÍMPAR");
		}
		
		
	}

}
