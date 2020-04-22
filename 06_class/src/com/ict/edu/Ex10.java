package com.ict.edu;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print(" 숫자 1 :");
		int i = scan.nextInt();
		System.out.print(" 숫자 2  : ");
		int j = scan.nextInt();
		System.out.print(" 연산자(+,-,*,/) : ");
		String str_op = scan.next();

		int res = 0;
		Ex09 test = new Ex09();
		switch (str_op) {
			case "+":
				res = test.add(i,j);
				System.out.println(i + str_op + j + " = " + res);
				break;
			case "-":
				test.sub(i,j);
				break;
			case "*":
				res = test.mul(i,j);
				System.out.println(i + str_op + j + " = " + res);
				break;
			case "/":
				test.div(i,j);
				break;
			default:
				System.out.println("연산자를 잘못 입력했습니다.");
				break;
		}		
	}
}
