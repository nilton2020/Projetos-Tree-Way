package Eranca01;

public class TestaPolimorfismo {
	public static void main(String[] args) {

		Aviao aviao = new Aviao();
		Carro carro = new Carro();
		Barco barco = new Barco();

		testarChamadaHeranca(aviao);
		testarChamadaHeranca(carro);
		testarChamadaHeranca(barco);
		

	}

	public static void testarChamadaHeranca(Veiculo veiculo) {
		if (veiculo instanceof Carro) {
			System.out.println("O metodo mover esta sendo chamado a partir da classe " + veiculo.getClass().getSimpleName());
			veiculo.mover();
		} else {
			System.out.println("Chamada inválida");
		}
	}
}