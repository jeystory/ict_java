package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		esc: while (true) {
			System.out.print("�Ա� �ݾ� :");
			int input = scan.nextInt();
			System.out.print("�޴� �Է� (1. �����ī, 2. �����, 3. �Ƹ޸�ī��, 4. �����ֽ� : ");
			int menu = scan.nextInt();
			int amount = 2;
			int price = 0;
			String coffee = "";
			switch (menu) {
				case 1:
					price = 3500;
					coffee = "�����ī";
					break;
				case 2:
					price = 4000;
					coffee = "�����";
					break;
				case 3:
					price = 3000;
					coffee = "�Ƹ޸�ī��";
					break;
				case 4:
					price = 3500;
					coffee = "�����ֽ�";
					break;
				default:
					System.out.println("���� �޴��Դϴ�.");
					continue esc;
			}

			if (price != 0) {
				int total = (int) (price * amount * 1.1);
				int change = input - total;
				System.out.println("������ �� : " + input);
				System.out.println("���� : " + coffee);
				System.out.println("���� ���� : " + price);
				System.out.println("�������ؾ� �� �׼� : " + total);
				System.out.println("�ܵ��� : " + change);
			}

			while (true) {
				System.out.print("����ұ��? (Y/N)");
				String str = scan.next();
				/*
				if (str.equals("Y") || str.equals("y"))
					continue esc;
				else if (str.equals("N") || str.equals("n"))
					break esc;
				else {
					System.out.println("�߸��� �Է�");
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
						System.out.println("�߸��� �Է�");
				}
			}
		}
		System.out.println("bye bye");

	}
}
