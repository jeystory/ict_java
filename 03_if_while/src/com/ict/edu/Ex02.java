package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		/*
		if ~ else~ : ���׿����ڿ� ���� ���ǽ��� ���� ��, ������ �� ������ ���� ������ ������ ����.
		if(���ǽ�) {
			���϶� ���� ���� or �����...	
		} 
		else {
			if�� ���ǽ��� ������ �� ���� ���� or �����....
		}
		*/
		
		// int k1�� 60 �̻��̸� �հ� �ƴϸ� ���հ�
		int k1 = 50;
		String str;
		if (k1 >= 60) {
			str = "�հ�";
		}else {
			str = "���հ�";
		} 
		System.out.println("��� : " + str);
		
		// int k2�� Ȧ������ ¦������
		int k2 = 29;
		
		
		if(k2 % 2 == 1) {
			str = "Ȧ��";
		} else {
			str = "¦��";
		}
		System.out.println("��� : " + str);
		
		// char k3�� �빮������ �ƴ���
		char k3 = 'C';
		
		if(k3 >= 'A' && k3 <= 'Z') {
			str = "�빮��";
		}else {
			str = "�빮�� �ƴ�";
		}
		System.out.println("��� : " + str);
		
		// int k4�� 1 or 3�̸� ����. �ƴϸ� ����
		int k4 = 3;
	
		if(k4 == 1 || k4 == 3) {
			str = "����";
		} else {
			str = "����";
		}
		System.out.println("��� : " + str);
		
		// �μ��� ū�� ���
		int k5 = 15, k6 = 10;
		int res= 0;
		if(k5 > k6) {
			res = k5;
		} else {
			res = k6;
		}
		System.out.println("��� : " + res);
		
		boolean isKorean = true;
		
		if(isKorean) {		//if(isKorean == true)
			str = "�ѱ�����Դϴ�.";
		} else {
			str = "�ѱ� ����� �ƴմϴ�.";
		}
		System.out.println("��� : " + str);
		
	}
}
