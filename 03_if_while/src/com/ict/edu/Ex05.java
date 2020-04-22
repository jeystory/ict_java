package com.ict.edu;

public class Ex05 {
	/*
	for��: ������ ������ ������ �� �ݺ� �����ϴ� ���
	���� : 	for(�ʱ��;���ǽ�;������) {
			���ǽ��� ������ �� ������ ���� or �����;	
		}
	** ���ǽ� => boolean�� (������, �񱳿���)
		���ǽ��� ���� �� ����, �����̸� for���� �������� ����
	** for���� ���� ������ ������ ���������� jump
	** for������ ����� ���� for�������� ���. ��, for�� �ۿ����� ���Ұ�
	   ===>  {} �ȿ��� ������� ������ {} �ۿ��� ����� �� ����.
	*/
	
	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			System.out.println(i + " �ȳ��ϼ���.");
			
		}
		
		// 0-10 ���
		for (int i = 0; i <11; i++) {
			System.out.println(i);
		}
		//0-10 ¦���� ���
		for (int i = 0; i <11; i++) {
			if(i%2 == 0)	System.out.println(i);
		}
		
		/*
		for (int i = 0; i <11; i+=2) {
			System.out.println(i);
		}
		*/
		
		// 0~50���� 7�� ���
		for (int i = 0; i < 51 ; i++) {
			if(i%7 == 0)	System.out.println(i);
		}
		
		// a-g���� ���
		for (char c = 'a'; c < 'h'; c++) {
			System.out.println(c);
		}
		
		// 5�����
		System.out.println(" 5�� ���");
		for (int i = 1; i < 10; i++) {
			System.out.println("5 *" +i + " = " + (5*i));
			
		}
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 8; j++) {
				if(j % 2 == 0) System.out.print("0");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
		// ������
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		// ¦�� ������
		int odd_sum = 0, even_sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0)	even_sum += i;
			else			odd_sum += i; 
		}
		
		System.out.println("odd sum " + odd_sum);
		System.out.println("even sum " + even_sum);
		
		// 7! (7*6*5*4*3*2*1)
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum *= i;	
		}
		System.out.println(sum);
		
	}
}
