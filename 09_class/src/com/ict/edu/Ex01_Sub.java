package com.ict.edu;

public class Ex01_Sub extends Ex01_Super{

	String name = "차두리";
	int age = 23;
	String car ="붕붕";
	
	public Ex01_Sub() {
		//this();	// 생성자 자신이 다른 생성자를 호출 반드시 첫째줄에 사용
		this("희동이");
		System.out.println("자식 클래스 생성자");
	}
	
	public Ex01_Sub(String name) {
		super("고길동");	// 부모 클래스의 생성자 - 반드시 생성자의 첫째줄에 사용
		this.name = name;
	}
	
	public void play() {
		String name = "둘리";
		System.out.println(name);	//지역변수
		System.out.println(this.name);	//전역변수
		System.out.println(super.name);	//부모변수
		
		// 전역과 부모에만 있는 경우
		System.out.println(age);	//전역
		System.out.println(this.age);	//전역
		System.out.println(super.age);	// 부모
		
		// 부모에게만 있는 경우
		System.out.println(addr);				//부모
		System.out.println(this.addr);		// 부모
		System.out.println(super.addr);	// 부모
		
		// 자식에게만 있는 경우
		System.out.println(car);			//전역
		System.out.println(this.car);		// 전역
		//System.out.println(super.car);	// 부모
	}
	
}
