package com.ict.edu2;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Ex01 coffee = new Ex01();

		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		System.out.println(coffee.getSu());

		coffee.setName("Ŀ��");
		coffee.setPrice(800);
		coffee.setSu(100);

		System.out.println(coffee.getName());
		System.out.println(coffee.getPrice());
		System.out.println(coffee.getSu());

		Ex01 ion = new Ex01();
		ion.setName("�̿�");
		ion.setPrice(1500);
		ion.setSu(100);

		System.out.println(ion.getName());
		System.out.println(ion.getPrice());
		System.out.println(ion.getSu());

		Ex01 juice = new Ex01();
		juice.setName("�����ֽ�");
		juice.setPrice(1000);
		juice.setSu(100);

		System.out.println(juice.getName());
		System.out.println(juice.getPrice());
		System.out.println(juice.getSu());

		Ex01 coke = new Ex01();
		coke.setName("�ݶ�");
		coke.setPrice(1200);
		coke.setSu(100);

		System.out.println(coke.getName());
		System.out.println(coke.getPrice());
		System.out.println(coke.getSu());

		Ex01[] arr = { coffee, ion, juice, coke };

		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �������ּ��� : ");
		int input = scan.nextInt();

		if (input < 800) {
			System.out.println("�ݾ��� �����մϴ�.");
		} else {
			/*
			System.out.println("Ŀ��\t�̿�\t�꽺\t�ݶ�");
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					System.out.print("O\t");
				} else {
					System.out.print("X\t");
				}
			}*/
			
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
