package threeway.java.veiculo;

public class PassagemPorParametro {

	public static void main(String[] args) {
		int i = 10;
		//exibe o valor de i
		System.out.println(i);
		
		// chama o metodo teste
		// envia i para o m�todo teste
		test(i);
		// exibe o valor de i n�o identificado 
		System.out.println(i);
	}
	
	public static void test(int j) {
		// muda o valor do argumento
		j = 33;
	}
}
