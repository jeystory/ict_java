package com.ict.edu6;

public class TestMain {
	public static void main(String[] args) {
		Protoss p = new Protoss("����");
		Zerg z = new Zerg("���۸�");
		
		int sel = 1;
		
		switch(sel) {
			case 1:		p.decEnergy(10);	break;
			case 2:		p.decEnergy(50);	break;
			default:	break;
		}
		System.out.println(p.name + " : " + p.energy);
		System.out.println(z.name + " : " + z.energy);
	}
	
}
