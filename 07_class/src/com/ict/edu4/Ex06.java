package com.ict.edu4;

public class Ex06 {
	//int num1 = 10; //에러
	static int num2 = 20;
	
	public static void main(String[] args) {
		int num1 = 10;	//사용
		//static int num2 = 20;	// static 지역변수 사용불가
		
		Ex05 t1 = new Ex05();
		System.out.println(t1.su1);	//11
		System.out.println(Ex05.su2);	//11
		
		Ex05 t2 = new Ex05();
		System.out.println(t2.su1);	//11
		System.out.println(t2.su2);	//12
		
		Ex05 t3 = new Ex05();
		System.out.println(t3.su1);	//11
		System.out.println(t3.su2);	//13
		
		
	}
}
