package com.ict.edu2;

// 추상 클래스 : 추상메소드를 하나이상 가지고 있는 클래스를 말한다.
//           일반클래스가 가지고 있는 모든 멤버들을 가질수 있다.(변수,상수,메소드)
//           반드시 abstract 예약어를   붙여야 한다.
public abstract class Ex01 {
	 int su1 = 10 ;
	 static int su2 = 20 ;
	 final int SU3 = 30;
	 static final int SU4 = 40 ;
	 
	 public void play() {
		 su1++;
		 su2++;
		 // SU3++;  // final은 상수를 뜻한다.
		 // SU4++;  // 상수는 값변경을 할 수 없다.
	 }
	 
	 public static void play2() {
		 int k1 = 100;
		 // 지역변수는 static을 사용 할 수 없다.
		 // static int k2 = 200 ;
		 System.out.println(k1);
		 
		 // 전역변수에서는 static만 가져올수있다.
		 // System.out.println(su1);
		 System.out.println(su2);
		 // System.out.println(SU3);
		 System.out.println(SU4);
		 
	 }
	 
	// 추상메소드 : body가 없는 메소드, {실행내용}이 없는 메소드 
	//            반드시 메소드와 클래스에게 abstract 예약어를 붙여야 한다.
	public abstract void play3();
	
	public abstract int play4();
	
}








