package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		end_pg:
		while(true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			String str = "";
			if(num % 2 == 0) 	str = "¦��";
			else				str = "Ȧ��";
			System.out.println(num + "�� " + str + "�Դϴ�.");
			
			while(true) {
				System.out.println("��� �ұ��?(Y/N) ");
				str = scan.next();
				
				if(str.equals("N") || str.equals("n"))	break end_pg;
				else if(str.contentEquals("Y") || str.contentEquals("y"))	continue end_pg;	//break;
				else continue;
			}
		}
	}
}
