package com.ict.edu3;

import java.util.Scanner;

public class Ex04 {

	public void setData(String msg) throws NumberFormatException {
		
		/*
		 try {
			if (msg.length() >= 1) {
				String str = msg.substring(0, 1); // msg�� ù���ڸ� ���
				prnData(str);
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է�");
		}
		*/
		if (msg.length() >= 1) {
			String str = msg.substring(0, 1); // msg�� ù���ڸ� ���
			prnData(str);
		}
	
	}

	//���ܾ絵(��������) : �ش� �޼ҵ带 ȣ���� �������� ���� ��ü�� ����
	public void prnData(String str) throws NumberFormatException {
		//���� ó��
		/*
		try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + " ��");
			for (int i = 0; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		} catch (Exception e) {
			System.out.println("���ڸ� �Է�");
		}
		*/
		int dan = Integer.parseInt(str);
		System.out.println(dan + " ��");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

	// JVM�� main �޼ҵ� ȣ�� : throws ���� �ʴ� ���� �ٶ�����.
	public static void main(String[] args) {
		try {
			Ex04 test = new Ex04();
			Scanner scan = new Scanner(System.in);

			System.out.println("���� �Է� : ");
			String msg = scan.next();
			test.setData(msg);

		} catch (Exception e) {
			System.out.println("ù���ڴ� ������ ���ڷ� �Է�");
		}
	
		System.out.println("bye");
	}

}
