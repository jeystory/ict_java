package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// API�� ������ shift + F2
		// java.lang �̿��� Ŭ������ import����� ��
		// �ڵ� import ��� : ctrl + shift + O or ctrl + space
		
		// Ű���忡 �Է��� ������ scan ������ ����
		
		Scanner scan = new Scanner(System.in);
				
		// ���� ������ ���ڿ�(String)�� ó���� �� : scan.next(); or scan.nextLine(); ��밡��
		// �ѱ��ڶ� char ó���� �� ���� ������ -> ���� ������ char �� ó���� �� : String�� char�� �����ؾ� �ȴ�.
		System.out.print("����� �̸� : ");
		String name = scan.next();	// ������� �ϸ� �ȵ� - ������� ���� �����͸� ó������
		//String name = scan.nextLine();	// ������� ���� - ����ᵵ ���������� �����͸� �޾Ƽ� ó�� ����
		System.out.println("����� �̸� : " + name + "�Դϴ�.");
		
		// ���� ������ ������(int)�� ó���� �� : scan.nextInt();
		// ���� - ���ڿ��� �����Ͱ� ������ ����ó�� �߻�
		System.out.print("����� ���� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� : " + (age + 1) + "�� �Դϴ�.");
		
		System.out.print("����� ���� : ");
		String age2 = scan.next();	// 24 �� �Է��ϸ�
		System.out.println("����� ���̴� : " + (age2 + 1) + "�� �Դϴ�.");	//241 �� ���
		
		// ���� ������ double �� ó���� �� : scan.nextDouble();
		System.out.print("����� Ű�� : ");
		double height = scan.nextDouble();
		System.out.println("����� Ű�� : " + (height + 1) + " �Դϴ�.");
		
		
		System.out.print("����� Ű�� : ");
		String height2 = scan.next();
		System.out.println("����� Ű�� : " + (height2 + 1) + " �Դϴ�.");
		
		// ���� ������ boolean �� ó���� �� : scan.nextBoolean();
		System.out.print("����� �����Դϱ� ? (true/false) ");
		boolean gender = scan.nextBoolean();
		System.out.println("����� : " + gender + " �Դϴ�.");	
		
		if(gender) {
			System.out.println("����� �����Դϴ�.");
		}else {
			System.out.println("����� �����Դϴ�.");
		}

		System.out.print("����� �����Դϱ� ? (true/false) ");
		String gender2 = scan.next();
		System.out.println("����� : " + gender2 + " �Դϴ�.");		

	}
}
