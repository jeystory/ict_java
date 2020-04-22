package com.ict.edu;

public class Ex07 {
	/*
	while문
	for문과 같은 반복문
	for문은 기본적으로 횟수의 의해서 반복 실행
	while은 기본적으로 조건의 의해서 반복 실행
	** while의 끝부분을 만나면 무조건 조건식을 간다.
	
	< 방법 1 >
	초기식
	while(조건식){
		조건식이 참일 떄 실행문 or 문들;
		증감식;
	}
	< 방법 2 >
	초기식
	while(true){
		if(빠져나갈 조건이 참일 때)	break;
		조건식이 거짓일 때 실행문 or 문들;
		증감식;
	}
	*/
	
	public static void main(String[] args) {
	
		int i = 1;
		
		System.out.println("1-10 찍기 1======================");
		// 0-10 찍기 1
		while (i < 11) {
			System.out.println(i++);
		}
		System.out.println("1-10 찍기 2====================");
		// 0-10 찍기 2
		i = 1;
		while(true) {
			if(i > 10)	break;
			System.out.println(i++);
		}
		
		System.out.println("짝수 1=======================");
		//짝수
		i = 0;
		while(i <= 10) {
				if(i% 2 == 0)	System.out.println(i);
				i++;
		}
		
		System.out.println("짝수 2=======================");
		i = 0;
		while(true) {
			if(i > 10 )	break;
			
			if(i%2 == 0)	System.out.println(i);
			i++;
		}
				
		// 0~50까지 7의 배수
		System.out.println("0~50 7의 배수 2=======================");
		i = 0;
		while( i <= 50) {
			if(i%7 == 0)	System.out.println(i);
			i++;
		}
		System.out.println("0~50 7의 배수 2=======================");
		i = 0;
		while(true) {
			if( i > 50)	break;
			if(i%7 == 0)	System.out.println(i);
			i++;
		}
		
		
		// a-g까지 출력
		System.out.println("a - g 1=====================");
		char c = 'a';
		while(c <= 'g')	{
			System.out.println(c++);
		}
		
		System.out.println("a - g 2 =====================");
		c = 'a';
		while(true)	{
			if(c > 'g')	break;
			System.out.println(c++);
		}
		
		// 5단출력
		System.out.println(" 5단 출력 1");
		i = 1;
		while (i < 10) {
			System.out.println("5 *" +i + " = " + (5*i++));
		}
		System.out.println("===========================");
		
		System.out.println(" 5단 출력 1");
		i = 1;
		while (true) {
			if(i > 9 )	break;
			System.out.println("5 *" +i + " = " + (5*i++));	
		}
		System.out.println("===========================");
			
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		System.out.println("=== 0 0 0 0 찍기 1====================");
		i = 0;
		while(i<3) {
			System.out.println("0 0 0 0");
			i++;
		}
		
		System.out.println("=== 0 0 0 0 찍기 2====================");
		i = 0;
		while(true) {
			if(i > 3)	break;	
			System.out.println("0 0 0 0");
			i++;
		}
				
				
		// 누적합
		System.out.println("누적합 1===================");
		int sum = 0;
		i = 1;
		while( i <= 10) {
			sum += i++;
		}
		System.out.println(sum);
		System.out.println("누적합 2==================");
			
		sum = 0;
		i = 1;
		while(true) {
			if(i > 10)	break;
			sum += i++;
		}
		System.out.println(sum);
		
				
		// 짝/홀수 누적합
		System.out.println("짝/홀수 누적합 1==================");
		int odd_sum = 0, even_sum = 0;
		i = 1;
		while ( i <= 10) {
			if(i % 2 == 0)	even_sum += i++;
			else			odd_sum += i++; 
			
		}
		System.out.println("odd sum " + odd_sum);
		System.out.println("even sum " + even_sum);
		
		System.out.println("짝/홀수 누적합 2===============");
		odd_sum = 0;
		even_sum = 0;
		i = 1;
		while ( true ) {
			if(i > 10)	break;
			if(i % 2 == 0)	even_sum += i++;
			else			odd_sum += i++; 			
		}
				
		System.out.println("odd sum " + odd_sum);
		System.out.println("even sum " + even_sum);
		System.out.println("===========================");
				
		// 7! (7*6*5*4*3*2*1)
		System.out.println(" 7!  1===========");
		sum = 1;
		i = 7;
		while ( i > 0) {
			sum *= i--;	
		}
		System.out.println(sum);
		System.out.println(" 7!  2============");
		
		sum = 1;
		i = 7;
		while ( true) {
			if(i < 1)	break;
			sum *= i--;	
		}
		System.out.println(sum);
		System.out.println("===========================");
		
	}
}
