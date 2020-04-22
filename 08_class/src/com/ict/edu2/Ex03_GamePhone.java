package com.ict.edu2;

public class Ex03_GamePhone extends Ex03_Phone {
	
	public Ex03_GamePhone(String name) {
		super(name);
		System.out.println(name + "Phone 생성");
	}
	
	public void playGame() {
		System.out.println("게임을 해요");
	}
}
