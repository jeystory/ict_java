package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		/*
		if ~ else~ : 삼항연산자와 같이 조건식이 참일 때, 거짓일 때 각각의 실행 문장을 가지고 있음.
		if(조건식) {
			참일때 실행 문장 or 문장들...	
		} 
		else {
			if의 조건식이 거짓일 때 실행 문장 or 문장들....
		}
		*/
		
		// int k1이 60 이상이면 합격 아니면 불합격
		int k1 = 50;
		String str;
		if (k1 >= 60) {
			str = "합격";
		}else {
			str = "불합격";
		} 
		System.out.println("결과 : " + str);
		
		// int k2가 홀수인지 짝수인지
		int k2 = 29;
		
		
		if(k2 % 2 == 1) {
			str = "홀수";
		} else {
			str = "짝수";
		}
		System.out.println("결과 : " + str);
		
		// char k3가 대문자인지 아닌지
		char k3 = 'C';
		
		if(k3 >= 'A' && k3 <= 'Z') {
			str = "대문자";
		}else {
			str = "대문자 아님";
		}
		System.out.println("결과 : " + str);
		
		// int k4가 1 or 3이면 남자. 아니면 여자
		int k4 = 3;
	
		if(k4 == 1 || k4 == 3) {
			str = "남자";
		} else {
			str = "여자";
		}
		System.out.println("결과 : " + str);
		
		// 두수중 큰수 출력
		int k5 = 15, k6 = 10;
		int res= 0;
		if(k5 > k6) {
			res = k5;
		} else {
			res = k6;
		}
		System.out.println("결과 : " + res);
		
		boolean isKorean = true;
		
		if(isKorean) {		//if(isKorean == true)
			str = "한국사람입니다.";
		} else {
			str = "한국 사람이 아닙니다.";
		}
		System.out.println("결과 : " + str);
		
	}
}
