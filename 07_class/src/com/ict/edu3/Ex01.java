package com.ict.edu3;

public class Ex01 {
	// ������ : ��ü�� ������ �� �ڵ����� �ѹ� ȣ��
	// ���� : ��� �ʵ��� �ʱ�ȭ
	// - ������ �̸��� Ŭ���� �̸��� ����
	// -  ��ȯ���� ���� �޼ҵ�� ����.
	// �����ε��� ����(�����ڰ� ������ ������ �� �ִ�)
	// Ŭ������ �����ڸ� ������ ������ �⺻ �����ڷ� ��ü�� ����
	// Ŭ������ �����ڸ� ����� �ݵ�� ������� �����ڷ� ��ü ������ �ؾ��Ѵ�.
	// �⺻������ : Ŭ���� �̸�() => ���ڰ� ���� ������

	private String name = "������";
	private int age = 24;
	private String addr = "��û��";
	
	// �⺻ ������ - ��� �ʵ� �ʱ�ȭ
	public Ex01() {
	
		System.out.println("�⺻ ������");
		name = "�Ѹ�";
		age = 1002 ;
		addr = "����";
	}
	
	// ����� ���� ������ : source �޴����� �ڵ����� �ڵ带 ���� �� ����
	public Ex01(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
