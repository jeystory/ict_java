package com.ict.edu;

public class Ex09 {
	
	// 덧셈 - 반환형 인자 있음
	public int add(int i, int j) {
		return i+j;
	}
	
	public void sub(int i, int j) {
		System.out.println(i + "-" + j + " = " +(i-j));
	}
	
	public int mul(int i, int j) {
		return i*j;
	}
	
	public void div(int i, int j) {
		if(j != 0)
			System.out.println(i + "/" + j + " = " +(i/j));
		else 
			System.out.println("0으로 나눌수 없습니다.");
	}
}
