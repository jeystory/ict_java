package com.ict.edu3;



public class Ex01_Super {
	String name = "������";
	int age = 57;
	String addr = "����� ������";

	// final 
	// final ���� : ���(�� ���� X)
	// final �޼ҵ� : overriding X( �޼ҵ� ���� �Ұ�)
	// final Ŭ���� : ��ӺҰ�(�ش� Ŭ������ �θ� Ŭ������ ����� ����)
	// �޼ҵ忡 final�� �ٴ� ��� :  [���� ������] final ��ȯ�� �θ�Ŭ���� �޼ҵ�() 
	// ��Ӱ��迡�� �θ� �޼ҵ带 �״�� �����ͼ� �����ؼ� ����Ҽ� ���� ��
	// ��밡���ϳ� �θ�Ŭ������ �޼ҵ带 �����ͼ� �����ϴ� ���� �Ұ��� 
	// �ڽ� Ŭ������ ����� �����ϳ� ������(����)�� �Ҽ� ����. 
	public final void  job() {
		System.out.println("�౸ ����");
	}
	
	public  void hobby() {
		System.out.println("���ǰ���");
	}
	
	public  void plya() {
		System.out.println("����");
	}
}
