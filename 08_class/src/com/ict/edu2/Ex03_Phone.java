package com.ict.edu2;

public class Ex03_Phone {
	
	public Ex03_Phone(String name) {
		System.out.println(name + "의 부모 클래스 :  Phone 생성");
	}
	
	public void call() {
		System.out.println("전화를 걸고 받아요");
	}
	
	public void text() {
		System.out.println("문자를 주고 받아요");
	}

}
