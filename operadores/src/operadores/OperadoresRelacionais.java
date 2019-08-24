package operadores;
import java.util.Scanner;
public class OperadoresRelacionais {

	public static void main(String[] args) {
		int var1 , var2;
		boolean resultado;
		Scanner input = new Scanner (System.in);
		System.out.println("*************Programa imprimir na tela o resultado da relação ou comparação entre dois números*************");
		System.out.println("Favor digite o primeiro número: ");
		var1 = input.nextInt();
		System.out.println("Favor digite o segundo  número: ");
		var2 = input.nextInt();
		resultado = var1 > var2;
		System.out.println("O primeiro número digitado é maior que o segundo número digitado? "+resultado);
		
		resultado = var1 >= var2;
		System.out.println("O primeiro número digitado é maior ou igual ao segundo número digitado? "+resultado);
		
		resultado = var1 < var2;
		System.out.println("O primeiro número digitado é menor ao segundo número digitado? "+resultado);
	
		resultado = var1 <= var2;
		System.out.println("O primeiro número digitado é menor ou igual ao segundo número digitado? "+resultado);
		
		resultado = var1 == var2;
		System.out.println("O primeiro número digitado é igual ao segundo número digitado? "+resultado);
		
		resultado = var1 != var2;
		System.out.println("O primeiro número digitado é diferente ao segundo número digitado? "+resultado);
	}

}
