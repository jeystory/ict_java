package com.ict.edu;

public class Ex08 {
	int k1 = 10;
	int k2 = 20;
	int sum =0;
	// 메소드 이름([인자]) : 외부의 정보를 받아서 메소드를 사용하기 위해서는 인자가 필요
	//								내부의 정보를 가지고 메소드를 사용하기 위해서는 인자가 필요없다
	public void add() {
		sum = k1+k2;
		System.out.println(sum);
	}
	
	public void sub(int su) {
		sum = k1+su;
		System.out.println(sum);
	}
	
	public int mul() {
		return k1+k2;
		
	}
	
	public double div(double d2) {
		return k1+d2;
	}
}
