package com.nilton.heranca;

public class TestaHeranca {

	public static void main(String[] args) {
		Funcionarios programador = new Funcionarios();
		Funcionarios GerenteProjetos = new Funcionarios();
		programador.setNome("João");
		programador.setNumeroDeMatricula(123456);
		
		chamarMetodoPolimorfico(programador);
	}
	
	private static void chamarMetodoPolimorfico(Funcionarios func) {
		func.exibirDados();
	
	}
	
}
