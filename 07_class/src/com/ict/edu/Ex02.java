package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 받아서  => Ex02
		// 총점, 평균, 학점, 순위를 구하고 정렬 후 출력하시오 => Ex03
		Scanner sc = new Scanner(System.in);
		Ex03 test = new Ex03();
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름 : ");
		    name[i] = sc.next();	
			System.out.print("국어 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학 : ");
			math[i] = sc.nextInt();
		}
		test.sum(name, kor, eng, math);
	}
}
