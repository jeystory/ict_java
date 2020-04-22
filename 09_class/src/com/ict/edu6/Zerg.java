package com.ict.edu6;

public class Zerg implements Unit{
	String name;
	int energy;
	
	public Zerg(String name) {
		this.name = name;
		this.energy = 500;
	}
	
	@Override
	public void decEnergy(int energy) {
		this.energy -= energy;
		
	}

}
