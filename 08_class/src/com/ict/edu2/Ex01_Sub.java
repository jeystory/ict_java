package com.ict.edu2;

// �ڽ� Ŭ���� : sub, child
// �ڽ� Ŭ�������� ��Ӱ��踦 �δ´�(�ڽ� extends �θ�)
//��Ӱ��� : �ڽ� Ŭ������ �θ�Ŭ������ ��� �ʵ� �Ǵ� �޼ҵ带 ������� ����ϴ� ��
//             ���߻���� �� �� ����. => �θ� Ŭ������ �ϳ��� ���� ����
//				��� Ŭ������ Object Ŭ������ ��� ����(Ŭ������ ��Ӱ��谡 ���� ���� Object Ŭ������ ��� ����)
public class Ex01_Sub extends Ex01_Super{
	String name = "ȫ����";
	int age = 15;
	String cat = "�����";

	public Ex01_Sub() {
		// �θ� Ŭ���� ������ ȣ���ϴ� ���� ����(������ ù��°�ٿ� �����ؾ���)
		System.out.println("child constructor" + this);
	}
	
	public void play() {
		String name = "ȫ�α�";
		System.out.println(name);			// ����(��������)
		System.out.println(this.name);		// �ڽ�(��������)
		System.out.println(super.name);	// �θ�
		//  �ڽ� Ŭ������ �θ� Ŭ������ ����� ����� �� �ִ�.
		System.out.println(super.addr);
		System.out.println(this.addr);
		System.out.println(addr);
		
		//System.out.println(dog);	// ���� - private ���
		
	}
}
