package com.ict.edu;

public class Ex07 {
	/*
	while��
	for���� ���� �ݺ���
	for���� �⺻������ Ƚ���� ���ؼ� �ݺ� ����
	while�� �⺻������ ������ ���ؼ� �ݺ� ����
	** while�� ���κ��� ������ ������ ���ǽ��� ����.
	
	< ��� 1 >
	�ʱ��
	while(���ǽ�){
		���ǽ��� ���� �� ���๮ or ����;
		������;
	}
	< ��� 2 >
	�ʱ��
	while(true){
		if(�������� ������ ���� ��)	break;
		���ǽ��� ������ �� ���๮ or ����;
		������;
	}
	*/
	
	public static void main(String[] args) {
	
		int i = 1;
		
		System.out.println("1-10 ��� 1======================");
		// 0-10 ��� 1
		while (i < 11) {
			System.out.println(i++);
		}
		System.out.println("1-10 ��� 2====================");
		// 0-10 ��� 2
		i = 1;
		while(true) {
			if(i > 10)	break;
			System.out.println(i++);
		}
		
		System.out.println("¦�� 1=======================");
		//¦��
		i = 0;
		while(i <= 10) {
				if(i% 2 == 0)	System.out.println(i);
				i++;
		}
		
		System.out.println("¦�� 2=======================");
		i = 0;
		while(true) {
			if(i > 10 )	break;
			
			if(i%2 == 0)	System.out.println(i);
			i++;
		}
				
		// 0~50���� 7�� ���
		System.out.println("0~50 7�� ��� 2=======================");
		i = 0;
		while( i <= 50) {
			if(i%7 == 0)	System.out.println(i);
			i++;
		}
		System.out.println("0~50 7�� ��� 2=======================");
		i = 0;
		while(true) {
			if( i > 50)	break;
			if(i%7 == 0)	System.out.println(i);
			i++;
		}
		
		
		// a-g���� ���
		System.out.println("a - g 1=====================");
		char c = 'a';
		while(c <= 'g')	{
			System.out.println(c++);
		}
		
		System.out.println("a - g 2 =====================");
		c = 'a';
		while(true)	{
			if(c > 'g')	break;
			System.out.println(c++);
		}
		
		// 5�����
		System.out.println(" 5�� ��� 1");
		i = 1;
		while (i < 10) {
			System.out.println("5 *" +i + " = " + (5*i++));
		}
		System.out.println("===========================");
		
		System.out.println(" 5�� ��� 1");
		i = 1;
		while (true) {
			if(i > 9 )	break;
			System.out.println("5 *" +i + " = " + (5*i++));	
		}
		System.out.println("===========================");
			
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		System.out.println("=== 0 0 0 0 ��� 1====================");
		i = 0;
		while(i<3) {
			System.out.println("0 0 0 0");
			i++;
		}
		
		System.out.println("=== 0 0 0 0 ��� 2====================");
		i = 0;
		while(true) {
			if(i > 3)	break;	
			System.out.println("0 0 0 0");
			i++;
		}
				
				
		// ������
		System.out.println("������ 1===================");
		int sum = 0;
		i = 1;
		while( i <= 10) {
			sum += i++;
		}
		System.out.println(sum);
		System.out.println("������ 2==================");
			
		sum = 0;
		i = 1;
		while(true) {
			if(i > 10)	break;
			sum += i++;
		}
		System.out.println(sum);
		
				
		// ¦/Ȧ�� ������
		System.out.println("¦/Ȧ�� ������ 1==================");
		int odd_sum = 0, even_sum = 0;
		i = 1;
		while ( i <= 10) {
			if(i % 2 == 0)	even_sum += i++;
			else			odd_sum += i++; 
			
		}
		System.out.println("odd sum " + odd_sum);
		System.out.println("even sum " + even_sum);
		
		System.out.println("¦/Ȧ�� ������ 2===============");
		odd_sum = 0;
		even_sum = 0;
		i = 1;
		while ( true ) {
			if(i > 10)	break;
			if(i % 2 == 0)	even_sum += i++;
			else			odd_sum += i++; 			
		}
				
		System.out.println("odd sum " + odd_sum);
		System.out.println("even sum " + even_sum);
		System.out.println("===========================");
				
		// 7! (7*6*5*4*3*2*1)
		System.out.println(" 7!  1===========");
		sum = 1;
		i = 7;
		while ( i > 0) {
			sum *= i--;	
		}
		System.out.println(sum);
		System.out.println(" 7!  2============");
		
		sum = 1;
		i = 7;
		while ( true) {
			if(i < 1)	break;
			sum *= i--;	
		}
		System.out.println(sum);
		System.out.println("===========================");
		
	}
}
