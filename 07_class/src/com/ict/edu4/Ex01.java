package com.ict.edu4;

public class Ex01 {
	String name ="홍길동";
	int age = 18;
	String addr ="충청도";
	
	
	public Ex01() {
		// this : 객체 내부에서 자신을 지칭을 할 때 사용하는 예약어. 
		// this : 객체 내부에서 객체 자신이 자신을 가르키는 예약어
		System.out.println("기본 생성자 (this ) : " + this);
		
	}

	public Ex01(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// 1. 전역변수 name은 외부 클래스에서는 test.name으로 접근 . 내부에서는 this.name으로 접근
	// 2. 전역변수 name은 객체 생성시 생성되지만 지역변수 name은 해당 메소드를 호출할 때 생성
	// => this.name 은 전역변수 name을 의미.
	public void setName(String  name) {
		this.name = name;
	}
}
