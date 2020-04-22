package com.ict.edu4;

public class Ex02 {
	public static void main(String[] args) {
		// 객체 생성전에 사용 가능 (static)
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.su3);
		System.out.println(Ex01.su4);
		
		// 값 변경이 안된다. (final)
		/*
		System.out.println(Ex01.su1++);
		System.out.println(Ex01.su2++);
		System.out.println(Ex01.su3++);
		System.out.println(Ex01.su4++);
		*/
	}
}
