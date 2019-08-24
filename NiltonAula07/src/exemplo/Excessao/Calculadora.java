package exemplo.Excessao;

public class Calculadora {

	public static void main(String[] args) {

		double nota1 = 5.0;
		double nota2 = 3.0;

		try {
			System.out.println(Calculadora.calculaMedia(nota1, nota2));
		} catch (MediaInsuficienteException e) {
			e.printStackTrace();
			System.out.println("tratamento de erro: ");
			System.out.println(e.getMessage());
		}
	}

	private static Double calculaMedia(Double x, double y) throws MediaInsuficienteException {
		Double media = ( x + y ) / 2;
		if (media < 6) {
			throw new MediaInsuficienteException();
		}
		return media;
	}
}
