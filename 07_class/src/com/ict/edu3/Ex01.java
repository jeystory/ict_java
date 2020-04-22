package com.ict.edu3;

public class Ex01 {
	// 생성자 : 객체를 생성할 때 자동으로 한번 호출
	// 목적 : 멤버 필드의 초기화
	// - 생성자 이름은 클래스 이름과 같음
	// -  반환형이 없는 메소드와 같다.
	// 오버로딩이 가능(생성자가 여러개 존재할 수 있다)
	// 클래스에 생성자를 만들지 않으면 기본 생성자로 객체를 생성
	// 클래스에 생성자를 만들면 반드시 만들어진 생성자로 객체 생성을 해야한다.
	// 기본생성자 : 클래스 이름() => 인자가 없는 생성자

	private String name = "일지매";
	private int age = 24;
	private String addr = "충청도";
	
	// 기본 생성자 - 멤버 필드 초기화
	public Ex01() {
	
		System.out.println("기본 생성자");
		name = "둘리";
		age = 1002 ;
		addr = "남극";
	}
	
	// 멤버를 갖는 생성자 : source 메뉴에서 자동으로 코드를 만들 수 있음
	public Ex01(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
