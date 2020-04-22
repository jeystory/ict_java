package com.ict.edu2;

// 자식 클래스 : sub, child
// 자식 클래스에서 상속관계를 맺는다(자식 extends 부모)
//상속관계 : 자식 클래스가 부모클래스의 멤버 필드 또는 메소드를 마음대로 사용하는 것
//             다중상속을 할 수 없음. => 부모 클래스는 하나만 존재 가능
//				모든 클래스는 Object 클래스를 상속 받음(클래스가 상속관계가 없는 경우는 Object 클래스를 상속 받음)
public class Ex01_Sub extends Ex01_Super{
	String name = "홍반장";
	int age = 15;
	String cat = "고양이";

	public Ex01_Sub() {
		// 부모 클래스 생성자 호출하는 것이 생략(무조건 첫번째줄에 존재해야함)
		System.out.println("child constructor" + this);
	}
	
	public void play() {
		String name = "홍두깨";
		System.out.println(name);			// 인자(지역변수)
		System.out.println(this.name);		// 자식(전역변수)
		System.out.println(super.name);	// 부모
		//  자식 클래스는 부모 클래스의 멤버를 사용할 수 있다.
		System.out.println(super.addr);
		System.out.println(this.addr);
		System.out.println(addr);
		
		//System.out.println(dog);	// 에러 - private 멤버
		
	}
}
