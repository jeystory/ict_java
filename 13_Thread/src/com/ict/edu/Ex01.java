package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// ���� �������� ������ �̸� ȣ��
		System.out.println(Thread.currentThread().getName());
		
		Ex02 t1 = new Ex02();
		Ex03 t2 = new Ex03();
		t1.play();
		t2.play();
		// t1, t2�� thread�� ��� �޾����Ƿ� start(), run() �� ����
		//start() ȣ���ϸ� run() �� ���� �����带 �����ϰ� �۾��� ����
		// ��Ƽ������ :  �����尡 �������� ���� ���ÿ� ����ó��
		t1.start();
		t2.start();
		System.out.println("Bye");
	}
}
