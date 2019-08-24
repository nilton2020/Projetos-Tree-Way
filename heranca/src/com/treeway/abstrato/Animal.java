package com.treeway.abstrato;

public abstract class Animal {
	private String ruído; //Atributo da classe abstrata
	
	public Animal( String ruído) { //construtor
		this.ruído = ruído;
	}
	public abstract void fazerRuido(); //métodos abstratos
	public abstract void come();
	
	// get e set
	public String getRuído() {
		return ruído;
	}
	public void setRuído(String ruído) {
		this.ruído = ruído;
	}


}
