package Eranca01;

public class Carro extends Veiculo {
	// (1)Atributos - Váriaveis
	private String modelo;

	// (2)Construtor
	public Carro( String cor, int ano, String placaIdentificacao, String modelo) {
		
		super(cor, ano, placaIdentificacao);
		this.modelo = modelo;
		
		System.out.println("Criando objeto carro");
	}	
		
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		System.out.println("Correr");
	}
}
