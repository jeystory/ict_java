package com.ict.edu7;

// 열거형 : 상수를 하나의 객체로 인식. 여러개의 상수 객체들을 한곳에 모아 둔 하나의 묶음(객체)
public class EnumEx1 {
	
	static final int JAVA = 200;
	
	public enum Lesson{
		//static final 
		JAVA, JSP, SPRING, ANDROID
	}
	
	
	public static void main(String[] args) {
		Lesson le = Lesson.JAVA;
		System.out.println("le : " + le);
		System.out.println("JAVA : " + Lesson.JAVA);	//JAVA : 객체
		System.out.println("JAVA : " + JAVA);				//200 : 값(데이터)
		System.out.println("jsp : " + Lesson.JSP);
		
		System.out.println("=========");
		Lesson[] items = Lesson.values();
		System.out.println("길이" + items.length);
		
		//ordinal() : 실제 저장된 정수값 구하기
		for (Lesson k : items) {
			System.out.println(k + " : " + k.ordinal());
		}
	}
}
