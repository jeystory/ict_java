package com.ict.edu;

public class Ex01_Sub extends Ex01_Super{

	String name = "���θ�";
	int age = 23;
	String car ="�غ�";
	
	public Ex01_Sub() {
		//this();	// ������ �ڽ��� �ٸ� �����ڸ� ȣ�� �ݵ�� ù°�ٿ� ���
		this("����");
		System.out.println("�ڽ� Ŭ���� ������");
	}
	
	public Ex01_Sub(String name) {
		super("��浿");	// �θ� Ŭ������ ������ - �ݵ�� �������� ù°�ٿ� ���
		this.name = name;
	}
	
	public void play() {
		String name = "�Ѹ�";
		System.out.println(name);	//��������
		System.out.println(this.name);	//��������
		System.out.println(super.name);	//�θ𺯼�
		
		// ������ �θ𿡸� �ִ� ���
		System.out.println(age);	//����
		System.out.println(this.age);	//����
		System.out.println(super.age);	// �θ�
		
		// �θ𿡰Ը� �ִ� ���
		System.out.println(addr);				//�θ�
		System.out.println(this.addr);		// �θ�
		System.out.println(super.addr);	// �θ�
		
		// �ڽĿ��Ը� �ִ� ���
		System.out.println(car);			//����
		System.out.println(this.car);		// ����
		//System.out.println(super.car);	// �θ�
	}
	
}
