package operadores;
import java.util.Scanner;
public class OperadoresRelacionais {

	public static void main(String[] args) {
		int var1 , var2;
		boolean resultado;
		Scanner input = new Scanner (System.in);
		System.out.println("*************Programa imprimir na tela o resultado da rela��o ou compara��o entre dois n�meros*************");
		System.out.println("Favor digite o primeiro n�mero: ");
		var1 = input.nextInt();
		System.out.println("Favor digite o segundo  n�mero: ");
		var2 = input.nextInt();
		resultado = var1 > var2;
		System.out.println("O primeiro n�mero digitado � maior que o segundo n�mero digitado? "+resultado);
		
		resultado = var1 >= var2;
		System.out.println("O primeiro n�mero digitado � maior ou igual ao segundo n�mero digitado? "+resultado);
		
		resultado = var1 < var2;
		System.out.println("O primeiro n�mero digitado � menor ao segundo n�mero digitado? "+resultado);
	
		resultado = var1 <= var2;
		System.out.println("O primeiro n�mero digitado � menor ou igual ao segundo n�mero digitado? "+resultado);
		
		resultado = var1 == var2;
		System.out.println("O primeiro n�mero digitado � igual ao segundo n�mero digitado? "+resultado);
		
		resultado = var1 != var2;
		System.out.println("O primeiro n�mero digitado � diferente ao segundo n�mero digitado? "+resultado);
	}

}
