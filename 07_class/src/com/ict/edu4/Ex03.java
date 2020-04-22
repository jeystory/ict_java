package com.ict.edu4;

public class Ex03 {
	String name ="홍길동";
	int age = 37;
	
	// 기본 생성자
	public Ex03() {
		//this();	//생성자를 뜻하는 예약어
		// 생성자가 다른 생성자를 호출할 때 사용할수 있음
		// 반드시 생성자의 첫번째 줄에 사용해야 함.
		this("손흥민");
	}

	public Ex03(String name) {
		this(1004);
		this.name = name;
		//this("손흥민", 24);	// 에러 - 반드시 생성자의 맨 첫째줄에 위치해야함
	}
	
	public Ex03(int age) {
		this.age = age;
	}
	
	public Ex03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
