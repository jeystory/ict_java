package com.ict.edu4;

// static�� Ŭ������ ��� X. ��� �ʵ峪 �޼ҵ忡�� ��� O.
public class Ex05 {
	// �ν��Ͻ� ������ ��ü�� ������� ������ �׻� �ʱⰪ�� ������ ����
	// static ������ ��ü ������ ������� ���� ������ �����Ƿ� ���� Ŭ������ �̿��� ��ü���� �������� �Բ� ����Ѵ�.
	int su1 = 10;			// �ν��Ͻ� ����
	static int su2 = 10;	// static ����, Ŭ���� ����
	
	public Ex05() {
			su1++;
			su2++;
	}
	
	public void sum(int k1, int k2) {
		// ���������δ� static�� ����� �� ����.
		//static double pi= 3.14;	// ����
		System.out.println("��� : " + (k1+k2));
	}
	
	// static �޼ҵ�
	public static void sub() {
		//System.out.println(su1);		// �ν��Ͻ� ���� ����� �� ����
		// ���������δ� static�� ����� �� ����.
		//static double pi= 3.14;		// ����
		System.out.println(su2);
		// static �޼ҵ�� ���� static ������ ��밡��
	}
	
	
}
