package com.ict.edu;

public class Ex02_StringFormat {
	public static void main(String[] args) {
		// String 불변적 특징 : String을 한번 만들면 수정할 수 없다.
		String s1 = "I ♡ YOU";
		s1 = s1 + "Korea";
		
		System.out.println(s1);
		System.out.println("=============");
		
		//형식문자
		// %s 문자열 ,%d :정수 ,%f : 실수
		
		String s3 = "ICT 인재 개발원";
		int su1 = 92;
		float su2 = 78995.5789f;
		float su3 = 152395.5789f;
		double su4 = 152395.5789;
		
		System.out.printf("당신의 소속은 %s 소속입니다.\n 당신의 평균은 %d 입니다.\n ", s3, su1 );
		// %.2f : 소숫점 3째짜리에서 반올림해서 둘째자리까지 출력
		System.out.printf("당신의 평균 점수는 %f, %4f, %.2f\n", su2, su2, su2);
		System.out.printf("당신의 평균 점수는 %f, %4f, %.2f\n", su3, su3, su3);
		System.out.printf("당신의 평균 점수는 %f, %4f, %.2f\n", su4, su4, su4);
		System.out.printf("%s\n ", s3 );
		System.out.printf("%5s\n ", s3 );
		System.out.printf("%20s\n ", s3 );
		
		//String.format() : 형식을 지정하고 형식에 맞춰 생성
		System.out.println(String.format("%20s", s3));
	}
}
