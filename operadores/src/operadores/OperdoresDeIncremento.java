package operadores;

public class OperdoresDeIncremento {

	public static void main(String[] args) {
		
		int var = 1;
		System.out.println("Aplicando o operador pós incremento: "+ var++);
		System.out.println("Após a aplicação do operador pós incremento: "+ var);

		int var2 = 1;
		
		System.out.println("Aplicando o operador pré incremento: "+ ++var2);
		System.out.println("Após a aplicação do operador pré incremento: "+ var2);
		
		int var3 = 1;
		
		System.out.println("Aplicando o operador pós decremento: "+ var3--);
		System.out.println("Após a aplicação do operador pós decremento: "+ var3);
		
		int var4 = 1;
		
		System.out.println("Aplicando o operador pré decremento: "+ --var4);
		System.out.println("Após a aplicação do operador pós decremento: "+ var4);
		
		
	}

}
