package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 이름, 국,영,수 받아서 총점, 평균, 학점
		esc:
		while (true) {
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.println("수학 :");
			int math = scan.nextInt();

			int sum = kor + eng + math;
			double avg = (int) (sum / 3.0 * 10) / 10.0;

			String grade = "";
			if (avg >= 90)
				grade = "A";
			else if (avg >= 80)
				grade = "B";
			else if (avg >= 70)
				grade = "C";
			else
				grade = "F";

			System.out.println("이름 : " + name);
			System.out.println("평균 : " + avg);
			System.out.println("총점 : " + sum);
			System.out.println("학점 : " + grade);
			
			while (true) {
				System.out.print("계속할까요? (Y/N)");
				String str = scan.next();

				if (str.equals("Y") || str.equals("y"))
					continue esc;
				else if (str.equals("N") || str.equals("n"))
					break esc;
				else {
					System.out.println("잘못된 입력");
				}
			}
		}
		System.out.println("bye bye");
	}
}
