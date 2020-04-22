package com.ict.edu2;

public class Ex01_Main {
	public static void main(String[] args) {
		// 상속관계 : 자식 클래스가 부모클래스의 멤버 필드 또는 메소드를 마음대로 사용하는 것
		//             다중상속을 할 수 없음. => 부모 클래스는 하나만 존재 가능
		//				모든 클래스는 Object 클래스를 상속 받음(클래스가 상속관계가 없는 경우는 Object 클래스를 상속 받음)
		
		// 자식 클래스 생성
		// 부모 클래스의 생성자가 먼저 생성되고 자식 클래스의 생성자가 생성
		Ex01_Sub test = new Ex01_Sub();
		System.out.println(test);
		
		System.out.println(test.name);
		System.out.println(test.age);

		// 자식 클래스에 없는 멤버 필드는 부모 클래스 멤버 필드를 사용
		System.out.println(test.addr);
		//System.out.println(test.dog); // 에러 - 상속 관계라도 private 멤버는 사용할 수 없음
		test.play();
	}
}
