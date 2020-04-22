package com.ict.edu7;

//2. Local 내부 클래스
public class Ex04 {
	int su1 = 10;
	
	public Ex04() {
		System.out.println("외부 클래스 생성자" + this);
	}
	
	public void sound() {
		System.out.println("외부 클래스 일반 메소드");
	}
	
	public void play() {
		int number = 2019;
		System.out.println("외부 클래스 일반 메소드 1");
		
		class In_Ex04{
			int k1 = 100;
			public In_Ex04() {
				System.out.println("내부 클래스 생성자 : " + this);
			}
			
			public void prn() {
				System.out.println(su1);
				System.out.println(number);
				System.out.println(k1);
			}
		} // local class end
		In_Ex04 ex = new In_Ex04();
		ex.prn();
		System.out.println("외부 클래스 일반 메소드 2");
	}// end of play()
}
