package Eranca01;

public class ReferenciasPolimorficas {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Carro("Cinza", 2012, "NWP-2552", "Gol");
		veiculo.mover();                   // Tem que correr.
		veiculo = new Aviao("prata", 2013, "NWP-2552");
		veiculo.mover();                   // Tem que voar.
		veiculo = new Barco("Branco", 2008, "NWP-2552");
		veiculo.mover();                   // Tem que navegar.
		
	}
}
