package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// ��ü ��������� static ȣ�� ����
		// Ŭ�����̸�. ����ʵ� (or .��� �޼ҵ�)
		
		//static�̶� private�� ������ �� �ִ�
		System.out.println(Ex06.GENDER);
		//System.out.println(Ex06.lang);
		
		//��ü ������ ����
		Ex06 test = new Ex06();
		
		System.out.println(test.name);
		//System.out.println(test.age);	// private ����ʵ�� �ٸ� Ŭ�������� ���� �Ұ�
		System.out.println(test.GENDER);
		System.out.println(Ex06.GENDER);
		
		// �޼ҵ带 �̿��ؼ� ���� �ޱ� : getter();
		int age = test.getAge();
		System.out.println(age);
		
		System.out.println(test.getLang());
		System.out.println("+++++++++++++++++++++++++");
		
		test.setName("ȣ����");
		test.setAge(2);
		System.out.println(test.name);
		System.out.println(test.getAge());
		
	}
}
