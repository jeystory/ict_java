package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �̸�, ��,��,�� �޾Ƽ� ����, ���, ����
		esc:
		while (true) {
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			int kor = scan.nextInt();
			System.out.print("���� : ");
			int eng = scan.nextInt();
			System.out.println("���� :");
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

			System.out.println("�̸� : " + name);
			System.out.println("��� : " + avg);
			System.out.println("���� : " + sum);
			System.out.println("���� : " + grade);
			
			while (true) {
				System.out.print("����ұ��? (Y/N)");
				String str = scan.next();

				if (str.equals("Y") || str.equals("y"))
					continue esc;
				else if (str.equals("N") || str.equals("n"))
					break esc;
				else {
					System.out.println("�߸��� �Է�");
				}
			}
		}
		System.out.println("bye bye");
	}
}
