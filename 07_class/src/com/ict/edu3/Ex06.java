package com.ict.edu3;

import java.util.Scanner;

import com.ict.edu2.Ex01;

public class Ex06 {
	public static void main(String[] args) {
		Ex05 coffee = new Ex05();

		coffee.setName("Ŀ��");
		coffee.setPrice(800);
		coffee.setSu(100);

		
		Ex05 ion = new Ex05("�̿�", 1500, 100);
		Ex05 juice = new Ex05("�����ֽ�", 1000, 100);
		Ex05 coke = new Ex05("�ݶ�", 1200, 100);
	
		Ex05[] arr = { coffee, ion, juice, coke };

		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �������ּ��� : ");
		int input = scan.nextInt();

		if (input < 800) {
			System.out.println("�ݾ��� �����մϴ�.");
		} else {
						
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					System.out.print(arr[i].getName() + "\t");
				}
			}
			
			int output = 0;
			System.out.println();
			System.out.println("�����ϼ���--> ");
			String str = scan.next();
			for (int i = 0; i < arr.length;i++) {
				if(arr[i].getName().equals(str)) {
					output = input - arr[i].getPrice();
					arr[i].setSu(arr[i].getSu() - 1);
					
					System.out.println("�ܵ��� : " + output);
					System.err.println("������ :  " + arr[i].getSu());
					break;
				}
			}		
		}
	}
}
