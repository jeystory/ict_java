package com.ict.edu7;

public class Ex04_Main {
	public static void main(String[] args) {
		// Local 내부 클래스 단독으로 객체 생성 X 
		// In_Ex04 test = new In_Ex04();
		
		// 멤버 내부 클래스 방법으로도 객체 생성 불가능
		//Ex04.In_Ex04 test1 = new Ex04().new In_Ex04();
		
		// Local 외부 클래스 메소드안에 존재 -> 외부 클래스 메소드를 실행해야 생성 조건이 된다.
		Ex04 test = new Ex04();
		test.play();
		System.out.println("bye");
	}
}
