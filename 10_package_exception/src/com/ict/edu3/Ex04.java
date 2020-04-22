package com.ict.edu3;

import java.util.Scanner;

public class Ex04 {

	public void setData(String msg) throws NumberFormatException {
		
		/*
		 try {
			if (msg.length() >= 1) {
				String str = msg.substring(0, 1); // msg의 첫글자만 출력
				prnData(str);
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력");
		}
		*/
		if (msg.length() >= 1) {
			String str = msg.substring(0, 1); // msg의 첫글자만 출력
			prnData(str);
		}
	
	}

	//예외양도(예외전가) : 해당 메소드를 호출한 지점으로 예외 객체를 전달
	public void prnData(String str) throws NumberFormatException {
		//예외 처리
		/*
		try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + " 단");
			for (int i = 0; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력");
		}
		*/
		int dan = Integer.parseInt(str);
		System.out.println(dan + " 단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

	// JVM이 main 메소드 호출 : throws 하지 않는 것이 바람직함.
	public static void main(String[] args) {
		try {
			Ex04 test = new Ex04();
			Scanner scan = new Scanner(System.in);

			System.out.println("정수 입력 : ");
			String msg = scan.next();
			test.setData(msg);

		} catch (Exception e) {
			System.out.println("첫글자는 무조건 숫자로 입력");
		}
	
		System.out.println("bye");
	}

}
