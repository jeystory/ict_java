package com.ict.edu4;

// static은 클래스에 사용 X. 멤버 필드나 메소드에서 사용 O.
public class Ex05 {
	// 인스턴스 변수는 객체가 만들어질 때마다 항상 초기값을 가지고 생성
	// static 변수는 객체 생성과 상관없이 값을 가지고 있으므로 같은 클래스를 이용한 객체들이 공용으로 함께 사용한다.
	int su1 = 10;			// 인스턴스 변수
	static int su2 = 10;	// static 변수, 클래스 변수
	
	public Ex05() {
			su1++;
			su2++;
	}
	
	public void sum(int k1, int k2) {
		// 지역변수로는 static을 사용할 수 없다.
		//static double pi= 3.14;	// 에러
		System.out.println("결과 : " + (k1+k2));
	}
	
	// static 메소드
	public static void sub() {
		//System.out.println(su1);		// 인스턴스 변수 사용할 수 없음
		// 지역변수로는 static을 사용할 수 없다.
		//static double pi= 3.14;		// 에러
		System.out.println(su2);
		// static 메소드는 전역 static 변수만 사용가능
	}
	
	
}
