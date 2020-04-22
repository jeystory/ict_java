package com.ict.edu;

import java.util.Random;

public class Ex07_Random {
	public static void main(String[] args) {
		// 난수 발생하는 방법 : Math.random(), Random 클래스
		// 1. Random 클래스 : 객체를 생성 해서 사용
		Random ran = new Random();
		
		// 각종 자료형을 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형 : " + ran.nextBoolean());
		System.out.println("int 형 : " + ran.nextInt());
		System.out.println("long형 : " + ran.nextLong());
		System.out.println("float형 : " + ran.nextFloat());
		System.out.println("double형 : " + ran.nextDouble());	// 0.0 <= X < 1.0
		
		// 특정 범위를 지정해서 난수 발생 할 수 있다.
		// nextInt(int 범위) : 0 ~ 범위 전 까지 난수 발생 
		System.out.println("범위 지정 int : " + ran.nextInt(6));  // 0-5까지
		System.out.println("범위 지정 double : " + (int)(ran.nextDouble()*6));  // 0-5까지
		
	}
}
