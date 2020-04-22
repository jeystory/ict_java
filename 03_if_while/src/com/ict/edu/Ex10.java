package com.ict.edu;

public class Ex10 {
	/*
	 * break-label 과 continue-label
	 * break-label: label이 지정한 반복문을 (블록)을 탈출. 
	 * continue-label : label이 지정한 반복문(블록)의 수행문을 포기하고 다음회차로 진행
	 */
	
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j =" + j);
			}
		}
		System.out.println("============");
		
		// j 가 4일 때 break;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 4)	break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// i가 2일때 break
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// label 표시 , label 표시 다음에서는 반드시 for나 while문만 가능
		// j 가 4일 때
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 4)	break esc;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// i가 2일때 break
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break esc;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// continue
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 4) continue esc;
				System.out.println("i = " + i + ", j =" + j);
			}
		}
		System.out.println("============");
		
	}
}
