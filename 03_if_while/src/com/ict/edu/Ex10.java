package com.ict.edu;

public class Ex10 {
	/*
	 * break-label �� continue-label
	 * break-label: label�� ������ �ݺ����� (���)�� Ż��. 
	 * continue-label : label�� ������ �ݺ���(���)�� ���๮�� �����ϰ� ����ȸ���� ����
	 */
	
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j =" + j);
			}
		}
		System.out.println("============");
		
		// j �� 4�� �� break;
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 4)	break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// i�� 2�϶� break
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// label ǥ�� , label ǥ�� ���������� �ݵ�� for�� while���� ����
		// j �� 4�� ��
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 4)	break esc;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// i�� 2�϶� break
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i == 2)	break esc;
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		System.out.println("============");
		
		// continue
		esc:
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(j == 4) continue esc;
				System.out.println("i = " + i + ", j =" + j);
			}
		}
		System.out.println("============");
		
	}
}
