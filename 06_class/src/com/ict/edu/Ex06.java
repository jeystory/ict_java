package com.ict.edu;

public class Ex06 {
	
	// ��� �޼ҵ� : ��� , ����
	// �޼ҵ� ���� :  [��������][�޼ҵ�����] ��ȯ�� �޼ҵ��̸�([���ڵ�]){ ���๮�� }
	// �޼ҵ� ����  : ��ȯ�� -  void : return; ���� ����. ��ȯ���� ����.
	//					           -  �ڷ����� : �ݵ�� return  �����(�ڷ�����)
	//                - static O  ��ü �������� ��밡��
	//					- static X ��ü �����ϰ� ���
	public void add() {
		System.out.println("add - 1");
		System.out.println("add method");
		System.out.println("add-2");
		//return;
	}
	public static void sub() {
		System.out.println("sub -1");
		System.out.println("sub method");
		System.out.println("sub -2 ");
		//return;
	}
	
	public int mul1() {return 0;	}
	public double mul2() {return 0.0;	}
	public double mul3() {return 0;	}
	
	public static String div() {return "���ѹα�";}
}
