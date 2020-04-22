package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// 객체 만들기전에 static 호출 가능
		// 클래스이름. 멤버필드 (or .멤버 메소드)
		
		//static이라도 private은 접근할 수 있다
		System.out.println(Ex06.GENDER);
		//System.out.println(Ex06.lang);
		
		//객체 생성후 접근
		Ex06 test = new Ex06();
		
		System.out.println(test.name);
		//System.out.println(test.age);	// private 멤버필드는 다른 클래스에서 접근 불가
		System.out.println(test.GENDER);
		System.out.println(Ex06.GENDER);
		
		// 메소드를 이용해서 정보 받기 : getter();
		int age = test.getAge();
		System.out.println(age);
		
		System.out.println(test.getLang());
		System.out.println("+++++++++++++++++++++++++");
		
		test.setName("호순이");
		test.setAge(2);
		System.out.println(test.name);
		System.out.println(test.getAge());
		
	}
}
