package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// 다차원 배열: 1차원 배열이 여러개 모인것
		// 고정길이 배열과 가변길이 배열
		// 고정 길이 배열 :1 차원안에 존재하는 배열의 수가 같다.
		// 가변 길이 배열:1차원 안에 존재하는 배열의 수가 다르다.
		
		// 고정 길이 배열
		//1. 선언 : 자료형[][] 이름;	또는 자료형 이름[][];
		int[][] su;
		
		//2. 생성  : 이름 = new int[1차원 배열의 수][1차원 배열안에 존재하는 배열의 수]
		su = new int[2][3];
		
		//3. 데이터 저장
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;

		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;
		
		// 주소출력하기
		System.out.println(su);	
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		// 내용 출력하기
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}

	}
	
}
