package com.treeway.abstrato;

public abstract class Animal {
	private String ru�do; //Atributo da classe abstrata
	
	public Animal( String ru�do) { //construtor
		this.ru�do = ru�do;
	}
	public abstract void fazerRuido(); //m�todos abstratos
	public abstract void come();
	
	// get e set
	public String getRu�do() {
		return ru�do;
	}
	public void setRu�do(String ru�do) {
		this.ru�do = ru�do;
	}


}
