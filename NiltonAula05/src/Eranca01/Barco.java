package Eranca01;

public class Barco extends Veiculo {


	public Barco(String cor, int ano, String identificacao) {
		super(cor, ano, identificacao);
	}

	public Barco() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		System.out.println("Navegar");
		
	}
	
}
