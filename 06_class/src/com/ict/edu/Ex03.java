package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 객체 생성 전
		// static은 객체 생성전에 미리 만들어진다. 
		// 호출 : 클래스이름.멤버 필드, 클래스이름.멤버메소드();
		System.out.println(Ex02.eng);
		System.out.println(Ex02.COMPUTER);
		
		// 객체 생성
		// 클래스 이름 참조변수 = new 생성자();
		
		// Ex02를 객체로 만들자
		// 현재 Ex02 생성자가 없으로므로 기본생성자로 객체를 만든다.
		// 기본 생성자란 클래스 이름();
		Ex02 test = new Ex02();
		// 멤버필드, 멤버 메소드에 접근스하는 방법 : 참조변수.멤버필드, 참조변수.멤버메소드()
		System.out.println(test);
		System.out.println(test.name);
		System.out.println(test.kor);
		System.out.println(test.MATH);
		System.out.println(test.eng);
		System.out.println(test.COMPUTER);
		
	}
}
