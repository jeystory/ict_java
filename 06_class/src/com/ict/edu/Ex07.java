package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("main -1");
		// static 메소드 사용가능. 클래스 이름.메소드()
		// 메소드가 끝나면 본인을 호출한 지점으로 회귀
		Ex06.sub();	// 메소드 호출
		System.out.println("main -2");
		String str = Ex06.div();	// String형의 반환값이 존재
		System.out.println(str);
		System.out.println("main -3");
		
	}
}
