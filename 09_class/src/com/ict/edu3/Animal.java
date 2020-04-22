package com.ict.edu3;

public abstract class Animal {
	int eyes = 2;
	int legs = 4;
	
	public void like() {
		System.out.println("sleeping");
	}
	
	// 추상 메소드
	public abstract void sound();
}
