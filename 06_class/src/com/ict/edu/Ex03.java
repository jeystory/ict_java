package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// ��ü ���� ��
		// static�� ��ü �������� �̸� ���������. 
		// ȣ�� : Ŭ�����̸�.��� �ʵ�, Ŭ�����̸�.����޼ҵ�();
		System.out.println(Ex02.eng);
		System.out.println(Ex02.COMPUTER);
		
		// ��ü ����
		// Ŭ���� �̸� �������� = new ������();
		
		// Ex02�� ��ü�� ������
		// ���� Ex02 �����ڰ� �����ιǷ� �⺻�����ڷ� ��ü�� �����.
		// �⺻ �����ڶ� Ŭ���� �̸�();
		Ex02 test = new Ex02();
		// ����ʵ�, ��� �޼ҵ忡 ���ٽ��ϴ� ��� : ��������.����ʵ�, ��������.����޼ҵ�()
		System.out.println(test);
		System.out.println(test.name);
		System.out.println(test.kor);
		System.out.println(test.MATH);
		System.out.println(test.eng);
		System.out.println(test.COMPUTER);
		
	}
}
