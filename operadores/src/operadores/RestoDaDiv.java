package operadores;

import java.util.Scanner;

public class RestoDaDiv {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double num1;
					
		System.out.println("***Programa ler n�mero digitado e retornar o valor �mpar ou par*****");
		System.out.println("Digite o n�mero:");
		
		num1 = input.nextDouble();
		
					
		if(num1 % 2 == 0) {
			
			System.out.println("O n�mero digitado � PAR");
			
		}else {
			System.out.println("O n�mero digitado � �MPAR");
		}
		
		
	}

}
