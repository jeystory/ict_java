package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// 변수 : 하나의 데이터를 저장하는 기억공간
		// 배열 : 같은 자료형의 데이터들을 한곳에 모아둔 묶음
		//      반드시 같은 자료형만 저장
		//      생성할 때 크기를 반드시 지정. 지정된 크기는 변경 불가능.
		//      출력 : 배열안의 존재하는 데이터의 출력은 보통 for문을 사용.
		  
		
		// 배열의 생성 순서 : 선언 -> 생성 -> 데이터 저장
		
		// 선언과 생성을 한번에
		char[] ch = new char[4];	//0-65535
		// 데이터저장
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 97;
		
		for (char c : ch) {
			System.out.println(c);
		}
		
		System.out.println("===============");
		
		// 선언과 생성 데이터 저장을 한번에
		String[] str = {"java", "jsp", "spring", "android"};
		
		for (String string : str) {
			System.out.println(string);
		}
		
	}
}
