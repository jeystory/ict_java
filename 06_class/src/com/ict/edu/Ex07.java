package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		
		System.out.println("main -1");
		// static �޼ҵ� ��밡��. Ŭ���� �̸�.�޼ҵ�()
		// �޼ҵ尡 ������ ������ ȣ���� �������� ȸ��
		Ex06.sub();	// �޼ҵ� ȣ��
		System.out.println("main -2");
		String str = Ex06.div();	// String���� ��ȯ���� ����
		System.out.println(str);
		System.out.println("main -3");
		
	}
}
