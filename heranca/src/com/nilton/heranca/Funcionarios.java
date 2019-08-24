package com.nilton.heranca;

public abstract class Funcionarios {
	private String nome;
	private int numeroDeMatricula;
	
	public abstract void exibirDados();  {
		System.out.println(" Funcionário " + nome + " Tem a matricula " + getNumeroDeMatricula());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}
	
//	public void exibirDados() {
//		System.out.println(" Funcionário " + nome + " Tem a matricula " + getNumeroDeMatricula());
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public int getNumeroDeMatricula() {
//		return numeroDeMatricula;
//	}
//
//	public void setNumeroDeMatricula(int numeroDeMatricula) {
//		this.numeroDeMatricula = numeroDeMatricula;
//	}
}
