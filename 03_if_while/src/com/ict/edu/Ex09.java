package com.ict.edu;

public class Ex09 {
	/*
	 * break�� continue : �⺻������ if���� �Բ� ���.
	 * break : �ش� �ݺ� ����� Ż���� �� ����ϴ� �����
	 * continue : continue�� ���� ���๮�� �����ϰ� ���� ȸ���� �����ϴ� �����
	 *  		for ���� ������, while ���� ���ǽ�
	 */

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		// i�� 6�� �� break
		for (int i = 0; i < 11; i++) {
			if(i == 6)	break;
			System.out.println(i);
		}
		System.out.println("===========");
		
		// i�� 6�� �� continue
		for (int i = 0; i < 11; i++) {
			if(i == 6)	continue;
			System.out.println(i);
		}
		System.out.println("===========");
		
		int i = 1;
		while(i < 11) {
			if(i == 6)	break;
			System.out.println(i);
			i++;
		}
		
		System.out.println("===========");
		
		/* ���ѷ��� - ��� 6�� �ݺ�
		i = 1;
		while(i < 11) {
			
			if(i == 6)	continue;
			System.out.println(i);
			i++;
		}
		*/
		
		// 1-10 ¦�� ���
		for (int j = 0; j <11; j++) {
			// ¦���϶�
			if(j%2 == 0)	System.out.println(j);
		}
		
		for (int j = 0; j <11; j++) {
			// ¦���϶�
			if(j%2 == 1)	continue;
			System.out.println(j);
		}
		
		
		
	}
}
