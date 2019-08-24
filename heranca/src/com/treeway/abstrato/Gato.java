package com.treeway.abstrato;

public class Gato extends Animal {

	public Gato() {
		super("Miauuu, miauuu");
	}

	@Override
	public void fazerRuido() {
		System.out.println("Miar= " + this.getRu�do());
	}

	@Override
	public void come() {
		System.out.println("Come rato");
	}
	
}
