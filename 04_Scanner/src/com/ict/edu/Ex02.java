package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// k1�� �Է� �޾Ƽ� 60 �̻��̸� �հ� , �ƴϸ� ���հ�
		System.out.print("���� �Է� : " );
		int k1 = scan.nextInt();
		String str = "";
		if (k1 >= 60) {
			str = "�հ�";
		} else {
			str = "���հ�";
		}
		System.out.println("��� : " + str);
		
		// ���ڸ� �Է¹޾Ƽ� Ȧ������ ¦������ �Ǻ�����	
		str = "";
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		if(num1 % 2 == 0)	str = "¦��";
		else				str = "Ȧ��";
		System.out.println("�Է��� ���� : " + num1 + "�� " + str + "�Դϴ�.");
		
		// ����ó�� 
		str = "";
		System.out.print(" ���� �Է��ϼ��� : ");
		String str1 = scan.next();
		
		switch(str1) {
			case "�ѱ�":	
				str = "����";		break;
			case "�߱�":
				str = "����¡";	break;
			case "�Ϻ�":
				str = "����";		break;
			default:	
				str = "������ ����";
		}
		System.out.println(str1 + "������ ������ "  + str);
	}
}
