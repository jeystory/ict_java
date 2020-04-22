package com.ict.edu2;

public class Ex04 {
	// 오버로딩 : 하나의 클래스안에 같은 이름을 가진 메소드가 여러개 존재하는 것
	//              단, 인자의 자료형이나 갯수 또는 순서가 달라야 한다.
					
	
	public void getLength(boolean n) {
		String str = String.valueOf(n);
		getLength(str);
	}
	
	public void getLength(char n) {
		String str = String.valueOf(n);
		getLength(str);
	}
	
	public void getLength(int n) {
		String str = String.valueOf(n);
		getLength(str);
	}
	
	public void getLength(double n) {
		String str = String.valueOf(n);
		getLength(str);
	}
	
	public void getLength(String  n) {
		System.out.println("입력값 : " + n);
		System.out.println("입력값의 길이 : " +  n.length());
	}
}
