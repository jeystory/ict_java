package com.ict.edu2;

// extends :��� �ʵ�, �޼ҵ��� Ȯ��(�θ��� ��� �ʵ�, �޼ҵ� ��밡��)
public class Ex03_DCPhone extends Ex03_Phone {
	public Ex03_DCPhone(String name) {
		super(name);
		System.out.println(name + "Phone ����");
	}
	public void takePicture() {
		System.out.println("������ ����");
	}

}
