package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			String str = "";
			if(num % 2 == 0) 	str = "¦��";
			else				str = "Ȧ��";
			System.out.println(num + "�� " + str + "�Դϴ�.");
			
			
			System.out.println("��� �ұ��?(Y/N) ");
			str = scan.next();
				
			if(str.equals("N") || str.equals("n"))	break ;
			else if(str.contentEquals("Y") || str.contentEquals("y"))	continue;
			else System.out.println("�߸��� �Է�");			
		}
	}
}
