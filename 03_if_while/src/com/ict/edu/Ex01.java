package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		/* 
		 * �ܼ� if ��: ���ǽ��� ���϶��� ����, �����̸� if�� ���� ����: if(���ǽ�) { ���๮���.. }
		 * ���ǽ� : boolean, ������, �񱳿���
		 * 
		 */

		// int k1�� 60 �̻��̸� �հ�
		int k1 = 50;
		String str = "�ʱⰪ";
		if (k1 >= 60) {
			str = "�հ�";
		}
		System.out.println("��� : " + str);

		// int k1�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
		k1 = 50;
		str = "���հ�";
		if (k1 >= 60) {
			str = "�հ�";
		} 
		
		System.out.println("��� : " + str);
		
		// int k2�� Ȧ������ ¦������
		int k2 = 29;
		
		str = "¦��";
		if(k2 % 2 == 1)	str = "Ȧ��";
		System.out.println("��� : " + str);
		
		// char k3�� �빮������ �ƴ���
		char k3 = 'C';
		str = "�빮�� �ƴ�";
		if(k3 >= 'A' && k3 <= 'Z')	str = "�빮��";
		System.out.println("��� : " + str);
		
		// int k4�� 1 or 3�̸� ����. �ƴϸ� ����
		int k4 = 3;
		
		str = "����";
		if(k4 == 1 || k4 == 3)	str = "����";
		System.out.println("��� : " + str);
		
		// �μ��� ū�� ���
		int k5 = 15, k6 = 10;
		int res = k6;
		if(k5 > k6)	res = k5;
		System.out.println("��� : " + res);
		
		boolean isKorean = true;
		if(isKorean) {
			System.out.println("�ѱ�����Դϴ�.");
		}
	}
}
