package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		end_pg:
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = scan.nextInt();
			String str = "";
			if(num % 2 == 0) 	str = "짝수";
			else				str = "홀수";
			System.out.println(num + "은 " + str + "입니다.");
			
			while(true) {
				System.out.println("계속 할까요?(Y/N) ");
				str = scan.next();
				
				if(str.equals("N") || str.equals("n"))	break end_pg;
				else if(str.contentEquals("Y") || str.contentEquals("y"))	continue end_pg;	//break;
				else continue;
			}
		}
	}
}
