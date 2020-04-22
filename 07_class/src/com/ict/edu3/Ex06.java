package com.ict.edu3;

import java.util.Scanner;

import com.ict.edu2.Ex01;

public class Ex06 {
	public static void main(String[] args) {
		Ex05 coffee = new Ex05();

		coffee.setName("커피");
		coffee.setPrice(800);
		coffee.setSu(100);

		
		Ex05 ion = new Ex05("이온", 1500, 100);
		Ex05 juice = new Ex05("과일주스", 1000, 100);
		Ex05 coke = new Ex05("콜라", 1200, 100);
	
		Ex05[] arr = { coffee, ion, juice, coke };

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 투입해주세요 : ");
		int input = scan.nextInt();

		if (input < 800) {
			System.out.println("금액이 부족합니다.");
		} else {
						
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					System.out.print(arr[i].getName() + "\t");
				}
			}
			
			int output = 0;
			System.out.println();
			System.out.println("선택하세요--> ");
			String str = scan.next();
			for (int i = 0; i < arr.length;i++) {
				if(arr[i].getName().equals(str)) {
					output = input - arr[i].getPrice();
					arr[i].setSu(arr[i].getSu() - 1);
					
					System.out.println("잔돈은 : " + output);
					System.err.println("수량은 :  " + arr[i].getSu());
					break;
				}
			}		
		}
	}
}
