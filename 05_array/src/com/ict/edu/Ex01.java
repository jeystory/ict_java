package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 변수 : 하나의 데이터를 저장하는 기억공간
		// 배열 : 같은 자료형의 데이터들을 한곳에 모아둔 묶음
		//      반드시 같은 자료형만 저장
		//      생성할 때 크기를 반드시 지정. 지정된 크기는 변경 불가능.
		//      출력 : 배열안의 존재하는 데이터의 출력은 보통 for문을 사용.
		  
		
		// 배열의 생성 순서 : 선언 -> 생성 -> 데이터 저장
		// 1. 선언 : 자료형[] 변수이름; 또는 자료형 변수이름[];
		int su[];
		
		// 2. 생성 : su = new 자료형[배열의 크기 = 방의 수]
		//    생성 : 이름 = new 자료형[배열의 길이(크기)]
		// 배열의 주소가 배열의 이름을 이용해서 저장된다.
		su = new int[4];
		
		// 3. 데이터 저장 : 배열이름 [방번호 = 인덱스 = 0부터 시작] = 데이터;
		su[0] = 10;
		su[1] = 20;
		su[2] = 'c';
		su[3] = 40;
		//su[4] = 50;	// run-time 오류 - 배열의 범위를 넘어서기 때문에
		
		// su에는 배열의 주소가 있다.
		System.out.println(su);
		
		// 배열이름.length : 배열의 크기
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		System.out.println("==========================" );
		//개선된 for문(foreach) : 주로 배열에 많이 사용
		for (int x : su) {
			System.out.println(x);
		}
	}
	
	
}
