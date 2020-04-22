package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		/* 
		 * 단순 if 문: 조건식이 참일때만 실행, 거짓이면 if문 무시 형식: if(조건식) { 실행문장들.. }
		 * 조건식 : boolean, 논리연산, 비교연산
		 * 
		 */

		// int k1이 60 이상이면 합격
		int k1 = 50;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);

		// int k1이 60 이상이면 합격 아니면 불합격
		k1 = 50;
		str = "불합격";
		if (k1 >= 60) {
			str = "합격";
		} 
		
		System.out.println("결과 : " + str);
		
		// int k2가 홀수인지 짝수인지
		int k2 = 29;
		
		str = "짝수";
		if(k2 % 2 == 1)	str = "홀수";
		System.out.println("결과 : " + str);
		
		// char k3가 대문자인지 아닌지
		char k3 = 'C';
		str = "대문자 아님";
		if(k3 >= 'A' && k3 <= 'Z')	str = "대문자";
		System.out.println("결과 : " + str);
		
		// int k4가 1 or 3이면 남자. 아니면 여자
		int k4 = 3;
		
		str = "여자";
		if(k4 == 1 || k4 == 3)	str = "남자";
		System.out.println("결과 : " + str);
		
		// 두수중 큰수 출력
		int k5 = 15, k6 = 10;
		int res = k6;
		if(k5 > k6)	res = k5;
		System.out.println("결과 : " + res);
		
		boolean isKorean = true;
		if(isKorean) {
			System.out.println("한국사람입니다.");
		}
	}
}
