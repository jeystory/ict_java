package com.ict.edu3;

public abstract class Animal {
	int eyes = 2;
	int legs = 4;
	
	public void like() {
		System.out.println("sleeping");
	}
	
	// �߻� �޼ҵ�
	public abstract void sound();
}
