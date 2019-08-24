package operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean var1 = false;
		boolean var2 = false;
		boolean resultado;
		
		resultado = var1 && var2;
		System.out.println("Operador && "+ resultado);
		resultado = var1 & var2;
		System.out.println("Operador & "+ resultado);
		resultado = var1 || var2;
		System.out.println("Operador || "+ resultado);
		resultado = var1 | var2;
		System.out.println("Operador | "+ resultado);
		resultado = var1 ^ var2;
		System.out.println("Operador ^ "+ resultado);
		resultado = ! var2;
		System.out.println("Operador ! "+ resultado);
		
		
		

	}

}
