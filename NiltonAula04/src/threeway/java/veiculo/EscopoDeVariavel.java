package threeway.java.veiculo;

public class EscopoDeVariavel {

	public static void main(String[] args) {
		int var1 = 10;
		int var2;

		if (var1 < 100) {
			var2 = 20;
		} else {
			var2 = 21;
		}

		// Acaesso a var 1 � permitodo, ent�o n�o h� erro de compila��o.
		System.out.println("valor de var1 = " + var1);

		// Acesso a var2 n�o � permitido, ent�o erro de compila��o ser� gerado.
		System.out.println("valor de var2 = " + var2);
	}

}
