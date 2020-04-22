package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			String str = "";
			if(num % 2 == 0) 	str = "짝수";
			else				str = "홀수";
			System.out.println(num + "은 " + str + "입니다.");
			
			
			System.out.println("계속 할까요?(Y/N) ");
			str = scan.next();
				
			if(str.equals("N") || str.equals("n"))	break ;
			else if(str.contentEquals("Y") || str.contentEquals("y"))	continue;
			else System.out.println("잘못된 입력");			
		}
	}
}
