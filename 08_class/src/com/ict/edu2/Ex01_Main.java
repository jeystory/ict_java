package com.ict.edu2;

public class Ex01_Main {
	public static void main(String[] args) {
		// ��Ӱ��� : �ڽ� Ŭ������ �θ�Ŭ������ ��� �ʵ� �Ǵ� �޼ҵ带 ������� ����ϴ� ��
		//             ���߻���� �� �� ����. => �θ� Ŭ������ �ϳ��� ���� ����
		//				��� Ŭ������ Object Ŭ������ ��� ����(Ŭ������ ��Ӱ��谡 ���� ���� Object Ŭ������ ��� ����)
		
		// �ڽ� Ŭ���� ����
		// �θ� Ŭ������ �����ڰ� ���� �����ǰ� �ڽ� Ŭ������ �����ڰ� ����
		Ex01_Sub test = new Ex01_Sub();
		System.out.println(test);
		
		System.out.println(test.name);
		System.out.println(test.age);

		// �ڽ� Ŭ������ ���� ��� �ʵ�� �θ� Ŭ���� ��� �ʵ带 ���
		System.out.println(test.addr);
		//System.out.println(test.dog); // ���� - ��� ����� private ����� ����� �� ����
		test.play();
	}
}
