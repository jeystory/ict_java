package com.ict.edu;

public class Ex05 {
	/*
	for문: 정해진 조건을 만족할 때 반복 실행하는 제어문
	형식 : 	for(초기식;조건식;증감식) {
			조건식이 만족할 때 실행할 문장 or 문장들;	
		}
	** 조건식 => boolean형 (논리연산, 비교연산)
		조건식이 참일 때 실행, 거짓이면 for문을 실행하지 않음
	** for문의 끝을 만나면 무조건 증감식으로 jump
	** for문에서 선언된 변수 for문에서만 사용. 즉, for문 밖에서는 사용불가
	   ===>  {} 안에서 만들어진 변수는 {} 밖에서 사용할 수 없다.
	*/
	
	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			System.out.println(i + " 안녕하세요.");
			
		}
		
		// 0-10 출력
		for (int i = 0; i <11; i++) {
			System.out.println(i);
		}
		//0-10 짝수만 출력
		for (int i = 0; i <11; i++) {
			if(i%2 == 0)	System.out.println(i);
		}
		
		/*
		for (int i = 0; i <11; i+=2) {
			System.out.println(i);
		}
		*/
		
		// 0~50까지 7의 배수
		for (int i = 0; i < 51 ; i++) {
			if(i%7 == 0)	System.out.println(i);
		}
		
		// a-g까지 출력
		for (char c = 'a'; c < 'h'; c++) {
			System.out.println(c);
		}
		
		// 5단출력
		System.out.println(" 5단 출력");
		for (int i = 1; i < 10; i++) {
			System.out.println("5 *" +i + " = " + (5*i));
			
		}
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				if(j % 2 == 0) System.out.print("0");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// 누적합
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		// 짝수 누적합
		int odd_sum = 0, even_sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0)	even_sum += i;
			else			odd_sum += i; 
		}
		
		System.out.println("odd sum " + odd_sum);
		System.out.println("even sum " + even_sum);
		
		// 7! (7*6*5*4*3*2*1)
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum *= i;	
		}
		System.out.println(sum);
		
	}
}
