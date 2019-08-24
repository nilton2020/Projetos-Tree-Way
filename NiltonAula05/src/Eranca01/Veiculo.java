package Eranca01;

public class Veiculo {
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	
	// (1)Atributos - Variaveis.
	private String cor;
	private int ano;
	private String identificacao;
	private String teste;
	
	// (2)Construtor
	public Veiculo( String cor, int ano, String identificacao) {
		
		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
		System.out.println("Criando objeto Veiculo");
	}
	
	// (3) Métodos
	public void mover() {
		System.out.println("Veiculo se movendo");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
}


