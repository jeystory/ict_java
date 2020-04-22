package com.ict.edu3;



public class Ex01_Super {
	String name = "차범근";
	int age = 57;
	String addr = "서울시 마포구";

	// final 
	// final 변수 : 상수(값 변경 X)
	// final 메소드 : overriding X( 메소드 변경 불가)
	// final 클래스 : 상속불가(해당 클래스를 부모 클래스로 만들수 없다)
	// 메소드에 final이 붙는 경우 :  [접근 권한자] final 반환형 부모클래스 메소드() 
	// 상속관계에서 부모 메소드를 그대로 가져와서 변경해서 사용할수 없는 것
	// 사용가능하나 부모클래스의 메소드를 가져와서 변경하는 것은 불가능 
	// 자식 클래스가 사용은 가능하나 재정의(변경)는 할수 없다. 
	public final void  job() {
		System.out.println("축구 선수");
	}
	
	public  void hobby() {
		System.out.println("음악감상");
	}
	
	public  void plya() {
		System.out.println("골프");
	}
}
