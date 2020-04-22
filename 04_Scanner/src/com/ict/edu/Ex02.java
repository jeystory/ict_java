package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// k1을 입력 받아서 60 이상이면 합격 , 아니면 불합격
		System.out.print("점수 입력 : " );
		int k1 = scan.nextInt();
		String str = "";
		if (k1 >= 60) {
			str = "합격";
		} else {
			str = "불합격";
		}
		System.out.println("결과 : " + str);
		
		// 숫자를 입력받아서 홀수인지 짝수인지 판별하자	
		str = "";
		System.out.print("숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		if(num1 % 2 == 0)	str = "짝수";
		else				str = "홀수";
		System.out.println("입력한 숫자 : " + num1 + "는 " + str + "입니다.");
		
		// 문자처리 
		str = "";
		System.out.print(" 나라를 입력하세요 : ");
		String str1 = scan.next();
		
		switch(str1) {
			case "한국":	
				str = "서울";		break;
			case "중국":
				str = "베이징";	break;
			case "일본":
				str = "도쿄";		break;
			default:	
				str = "데이터 없음";
		}
		System.out.println(str1 + "나라의 수도는 "  + str);
	}
}
