package com.ict.edu3;

import com.ict.edu3.Ex01_Super;

public class Ex01_Sub extends Ex01_Super {
	String name = "���θ�";
	int age = 35;
	
	public void home() {
		System.out.println(addr);
	}
	
	// ��Ӱ��迡�� �θ� �޼ҵ带 �״�� �����ͼ� �����ؼ� ���
	// overriding (�������̵�) : �θ� Ŭ������ �޼ҵ带 ����.
	public void hobby() {
		System.out.println("����");
	}

	// �޼ҵ忡 final�� �ٴ� ��� :  [���� ������] final ��ȯ�� �θ�Ŭ���� �޼ҵ�() 
	// ��Ӱ��迡�� �θ� �޼ҵ带 �״�� �����ͼ� �����ؼ� ����Ҽ� ���� ��
	// ��밡���ϳ� �θ�Ŭ������ �޼ҵ带 �����ͼ� �����ϴ� ���� �Ұ��� 

	
	
}
