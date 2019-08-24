package threeway.java.veiculo;

public class testaCarro {

	public static void main(String[] args) {

		CarroA gol = new CarroA();
		System.out.println(gol.ligado);

		gol.ligado = true;

		System.out.println(gol.ligar());
		System.out.println(gol.ligado);

		CarroA Punto = new CarroA("NKF-1234");

		System.out.println(Punto.placa);

		CarroA golf = new CarroA("Golf", "DEF-1234");

		System.out.println(golf.modelo +  " => Placa => " + golf.placa);
		
		CarroA fiesta = new CarroA("Fiesta", "Azul Celeste", 2018, "TAF-4567" );
		
		System.out.println(fiesta.modelo + " | **Cor** => " + fiesta.cor + " | **Ano** => " + fiesta.ano + " | **Placa** => " + fiesta.placa);
	}
}
