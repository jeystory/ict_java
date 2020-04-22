package com.ict.edu3;

import com.ict.edu3.Ex01_Super;

public class Ex01_Sub extends Ex01_Super {
	String name = "차두리";
	int age = 35;
	
	public void home() {
		System.out.println(addr);
	}
	
	// 상속관계에서 부모 메소드를 그대로 가져와서 변경해서 사용
	// overriding (오버라이딩) : 부모 클래스의 메소드를 숨김.
	public void hobby() {
		System.out.println("독서");
	}

	// 메소드에 final이 붙는 경우 :  [접근 권한자] final 반환형 부모클래스 메소드() 
	// 상속관계에서 부모 메소드를 그대로 가져와서 변경해서 사용할수 없는 것
	// 사용가능하나 부모클래스의 메소드를 가져와서 변경하는 것은 불가능 

	
	
}
