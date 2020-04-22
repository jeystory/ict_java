package com.ict.edu;

public class Ex01_Super {
	String name = "차범근";
	int age = 45;
	String addr = "서울시 마포구";
	
	public Ex01_Super() {
		System.out.println("부모클래스 기본 생성자");
	}
	
	public Ex01_Super(String name) {
		this();
		this.name = name;
		System.out.println("부모클래스  생성자");
	}
}
