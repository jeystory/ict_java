package com.ict.edu4;

public class Ex01 {
	String name ="ȫ�浿";
	int age = 18;
	String addr ="��û��";
	
	
	public Ex01() {
		// this : ��ü ���ο��� �ڽ��� ��Ī�� �� �� ����ϴ� �����. 
		// this : ��ü ���ο��� ��ü �ڽ��� �ڽ��� ����Ű�� �����
		System.out.println("�⺻ ������ (this ) : " + this);
		
	}

	public Ex01(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// 1. �������� name�� �ܺ� Ŭ���������� test.name���� ���� . ���ο����� this.name���� ����
	// 2. �������� name�� ��ü ������ ���������� �������� name�� �ش� �޼ҵ带 ȣ���� �� ����
	// => this.name �� �������� name�� �ǹ�.
	public void setName(String  name) {
		this.name = name;
	}
}
