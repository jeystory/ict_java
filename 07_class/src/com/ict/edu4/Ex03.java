package com.ict.edu4;

public class Ex03 {
	String name ="ȫ�浿";
	int age = 37;
	
	// �⺻ ������
	public Ex03() {
		//this();	//�����ڸ� ���ϴ� �����
		// �����ڰ� �ٸ� �����ڸ� ȣ���� �� ����Ҽ� ����
		// �ݵ�� �������� ù��° �ٿ� ����ؾ� ��.
		this("�����");
	}

	public Ex03(String name) {
		this(1004);
		this.name = name;
		//this("�����", 24);	// ���� - �ݵ�� �������� �� ù°�ٿ� ��ġ�ؾ���
	}
	
	public Ex03(int age) {
		this.age = age;
	}
	
	public Ex03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
