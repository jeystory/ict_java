package com.ict.edu;

public class Ex09 {
	/*
	 * break와 continue : 기본적으로 if문과 함께 사용.
	 * break : 해당 반복 블록을 탈출할 때 사용하는 예약어
	 * continue : continue문 이하 수행문을 포기하고 다음 회차로 진행하는 예약어
	 *  		for 문은 증감식, while 문은 조건식
	 */

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		// i가 6일 때 break
		for (int i = 0; i < 11; i++) {
			if(i == 6)	break;
			System.out.println(i);
		}
		System.out.println("===========");
		
		// i가 6일 때 continue
		for (int i = 0; i < 11; i++) {
			if(i == 6)	continue;
			System.out.println(i);
		}
		System.out.println("===========");
		
		int i = 1;
		while(i < 11) {
			if(i == 6)	break;
			System.out.println(i);
			i++;
		}
		
		System.out.println("===========");
		
		/* 무한루프 - 계속 6만 반복
		i = 1;
		while(i < 11) {
			
			if(i == 6)	continue;
			System.out.println(i);
			i++;
		}
		*/
		
		// 1-10 짝수 출력
		for (int j = 0; j <11; j++) {
			// 짝수일때
			if(j%2 == 0)	System.out.println(j);
		}
		
		for (int j = 0; j <11; j++) {
			// 짝수일때
			if(j%2 == 1)	continue;
			System.out.println(j);
		}
		
		
		
	}
}
