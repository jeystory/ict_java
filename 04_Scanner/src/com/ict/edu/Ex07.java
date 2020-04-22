package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			System.out.print("입금 금액 :");
			int input = scan.nextInt();
			System.out.print("메뉴 입력 (1. 까페모카, 2. 까페라떼, 3. 아메리카노, 4. 과일주스 : ");
			int menu = scan.nextInt();
			int amount = 2;
			int price = 0;
			String coffee = "";
			switch (menu) {
				case 1:
					price = 3500;
					coffee = "까페모카";
					break;
				case 2:
					price = 4000;
					coffee = "까페라떼";
					break;
				case 3:
					price = 3000;
					coffee = "아메리카노";
					break;
				case 4:
					price = 3500;
					coffee = "과일주스";
					break;
				default:
					System.out.println("없는 메뉴입니다.");
					continue esc;
			}

			if (price != 0) {
				int total = (int) (price * amount * 1.1);
				int change = input - total;
				System.out.println("지불한 돈 : " + input);
				System.out.println("음료 : " + coffee);
				System.out.println("을료 가격 : " + price);
				System.out.println("총지불해야 할 액수 : " + total);
				System.out.println("잔돈은 : " + change);
			}

			while (true) {
				System.out.print("계속할까요? (Y/N)");
				String str = scan.next();
				/*
				if (str.equals("Y") || str.equals("y"))
					continue esc;
				else if (str.equals("N") || str.equals("n"))
					break esc;
				else {
					System.out.println("잘못된 입력");
				}
				*/
				
				switch (str) {
					case "Y":
					case "y":
						continue esc;
					case "n":
					case "N":	
						break esc;
					default:
						System.out.println("잘못된 입력");
				}
			}
		}
		System.out.println("bye bye");

	}
}
