package com.ict.edu4;

public class Ex07 {
	/*
	// static 초기화
	static{
		  수행문
	}
	*/
	int n1 = 100;
	static int n2 = 200;
	
	// static 초기화
	static {
		n2 = 100;
		n3 = 200;
		n4 = 100;
	}
	
	static int n3 = 100;
	static int n4;	// 값을 먼저 주고 나중에 선언해도 OK
	
	public static void main(String[] args) {
		System.out.println(n2);	 	//100
		System.out.println(n3);		//100
		System.out.println(n4);		//100
	}
}
