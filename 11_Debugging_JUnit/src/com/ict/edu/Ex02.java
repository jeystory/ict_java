package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public void setData(String msg) throws NumberFormatException {
		if (msg.length() >= 1) {
			String str = msg.substring(0, 1);
			prnData(str);
		}
	}

	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + " 단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

	public static void main(String[] args) {
		try {
			Ex02 test = new Ex02();
			Scanner sc = new Scanner(System.in);
			System.out.print("정수입력 : ");
			String msg = sc.next();
			System.out.println(msg);
			test.setData(msg);
			int k = 10 + Integer.parseInt(msg.substring(0, 1));
			int sum = 145 + k ; 
		} catch (Exception e) {
			System.out.println("첫글자는 무조건 숫자로 입력하세요");
		}

		System.out.println("수고 하셨습니다.");
	}
}

