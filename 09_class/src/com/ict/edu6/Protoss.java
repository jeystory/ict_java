package com.ict.edu6;

public class Protoss implements Unit{
	String name;
	int energy;
	
	public Protoss(String name) {
		this.name = name;
		this.energy = 200;
	}
	
	@Override
	public void decEnergy(int energy) {
		this.energy = energy;
		
	}

}
