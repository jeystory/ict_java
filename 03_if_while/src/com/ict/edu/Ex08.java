package com.ict.edu;

public class Ex08 {

	/* do ~ while문 : 선처리 후비교
	 * 초기식;
	 * do {
	 * 		수행문..;
	 * 		수행문..;
	 * 		증감식;
	 * } while(조건식);	// 조건식이 참일때 반복문 처음 수행문으로 돌아간다. 거짓이면  반복문 종료
	 *  
	 */
	
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10 );
		
		//5단 출력
		i = 1;
		do {
			System.out.println("5 * " + i + " = " + (5*i));
			i++;
		} while (i < 10);
	}
	
}
