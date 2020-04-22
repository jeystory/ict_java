package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// 다차원 배열: 1차원 배열이 여러개 모인것
		// 고정길이 배열과 가변길이 배열
		// 고정 길이 배열 :1 차원안에 존재하는 배열의 수가 같다.
		// 가변 길이 배열:1차원 안에 존재하는 배열의 수가 다르다.

		// 고정 길이 배열
		char[][] ch = new char[3][2];
		
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		
		// 선언 생성 초기값을 한번에
		String [][] str = {{"java", "자바"},  {"jsp", "자바 서버 페이지"},{"Android", "안드로이드"}};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
		
		
		// 1차원 배열을 만들어서 2차원 배열에 넣기
		int[][] su = new int[2][4];
		int[] num1 = {1,2,3,4};
		int[] num2 = {10,20,30,40};
		
		su[0] = num1;
		su[1] = num2;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
	}
}
