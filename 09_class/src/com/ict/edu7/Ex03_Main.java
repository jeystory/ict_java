package com.ict.edu7;

import com.ict.edu7.Ex03.In_Ex04;

public class Ex03_Main {
	public static void main(String[] args) {
		// 1. Member 내부 클래스 : 외부 클래스 생성없이 혼자서 객체를 생성할 수 없음
		// 	In_Ex01 test = new In_Ex01();	// 에러
		// 외부 클래스를 만들어서 내부 클래스를 생성
		Ex03 test = new Ex03();
		Ex03.In_Ex03 in_test = test.new In_Ex03();	// 외부객체.new 내부객체 생성자();
		System.out.println("=======================");
		Ex03.In_Ex03 in_test2 =  new Ex03().new In_Ex03();
		System.out.println("=======================");
		
		in_test.prn();
		
		// 3. static 내부 클래스
		// static 이므로 그냥 불러서 사용가능
		System.out.println(In_Ex04.a3);
		System.out.println(In_Ex04.a4);
		In_Ex04.go2();
		
		// *** static 내부 클래스는 단독으로 객체 생성 가능
		Ex03.In_Ex04 in_test03 = new In_Ex04();
		System.out.println(in_test03.a1);
		System.out.println(in_test03.a2);
		System.out.println(in_test03.a3);
		System.out.println(in_test03.a4);
		//System.out.println(in_test03.a5); // 에러
		in_test03.go();
	}
}
