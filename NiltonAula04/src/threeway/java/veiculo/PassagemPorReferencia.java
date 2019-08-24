package threeway.java.veiculo;

public class PassagemPorReferencia {

	public static void main(String[] args) {
		// criar um array de inteiros
		int[] idades = { 10, 11, 12 };
		// exibir os valores de array

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		// chamar o metodo teste e enviar a
		// referencia para o array
		teste(idades);
		// exibir os valores de array
		for (int i = 0; i < idades.length; i++) {
		}
	}
	
	public static void teste (int [] arr) {
		// mudar os valores do array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 50;
		}
	}
}
