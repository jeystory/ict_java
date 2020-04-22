package com.ict.edu2;

// 부모 클래스 : super, parent
public class Ex01_Super {
	String name = "홍길동";
	int age = 47;
	String addr ="서울";
	private String dog ="멍멍이";	//  상속되지 않음 - 자식 클래스를 사용할 수 없음.
	static int car = 1;
	static final  boolean GENDER = true;
	
	public Ex01_Super() {
		System.out.println("Parent contractor" + this);
	}
	
	public void prn() {
		System.out.println("부모클래스 메소드");
		//System.out.println(this.cat);	// 에러 : 부모는 자신의 멤버가 아닌 자식의 멤버를 사용할수 없다.
	}
	
	public static void prn2() {
		System.out.println("부모클래스 static 메소드");
	}
	

	
	
}
