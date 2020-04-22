package com.ict.edu;

public class Ex06 {
	
	// 멤버 메소드 : 기능 , 동작
	// 메소드 구성 :  [접근제한][메소드종류] 반환형 메소드이름([인자들]){ 실행문들 }
	// 메소드 유형  : 반환형 -  void : return; 생략 가능. 반환값이 없음.
	//					           -  자료형들 : 반드시 return  결과값(자료형들)
	//                - static O  객체 생성없이 사용가능
	//					- static X 객체 생성하고 사용
	public void add() {
		System.out.println("add - 1");
		System.out.println("add method");
		System.out.println("add-2");
		//return;
	}
	public static void sub() {
		System.out.println("sub -1");
		System.out.println("sub method");
		System.out.println("sub -2 ");
		//return;
	}
	
	public int mul1() {return 0;	}
	public double mul2() {return 0.0;	}
	public double mul3() {return 0;	}
	
	public static String div() {return "대한민국";}
}
