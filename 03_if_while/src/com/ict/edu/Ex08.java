package com.ict.edu;

public class Ex08 {

	/* do ~ while�� : ��ó�� �ĺ�
	 * �ʱ��;
	 * do {
	 * 		���๮..;
	 * 		���๮..;
	 * 		������;
	 * } while(���ǽ�);	// ���ǽ��� ���϶� �ݺ��� ó�� ���๮���� ���ư���. �����̸�  �ݺ��� ����
	 *  
	 */
	
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10 );
		
		//5�� ���
		i = 1;
		do {
			System.out.println("5 * " + i + " = " + (5*i));
			i++;
		} while (i < 10);
	}
	
}
