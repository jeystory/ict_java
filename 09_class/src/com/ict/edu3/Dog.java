package com.ict.edu3;

// �߻�Ŭ������ ��ӹ޾ұ� ������ �θ�Ŭ������ �߻�޼ҵ带 �������̵� �ؾ���.
public class Dog extends Animal{

	String name = "�۸���";
	int age = 4;
	
	public void play() {
		System.out.println("��å�ϱ�");
	}
	@Override
	public void sound() {
		System.out.println("��~��~");
	}

}
