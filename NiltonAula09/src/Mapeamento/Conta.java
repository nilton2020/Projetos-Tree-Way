package Mapeamento;

public class Conta {
	Cliente conta;
	int numero;
	int identificador;

	public Cliente getConta() {
		return conta;
	}

	public void setConta(Cliente conta) {
		this.conta = conta;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
}
