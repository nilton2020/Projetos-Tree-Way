package Eranca01;

public class Aviao extends Veiculo{

	public Aviao(String cor, int ano, String identificacao) {
		super(cor, ano, identificacao);
	}

	public Aviao() {
		
	}

	@Override
	public void mover() {
		System.out.println("Voar");
	}
}
