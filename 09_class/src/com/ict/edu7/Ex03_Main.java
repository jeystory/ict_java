package com.ict.edu7;

import com.ict.edu7.Ex03.In_Ex04;

public class Ex03_Main {
	public static void main(String[] args) {
		// 1. Member ���� Ŭ���� : �ܺ� Ŭ���� �������� ȥ�ڼ� ��ü�� ������ �� ����
		// 	In_Ex01 test = new In_Ex01();	// ����
		// �ܺ� Ŭ������ ���� ���� Ŭ������ ����
		Ex03 test = new Ex03();
		Ex03.In_Ex03 in_test = test.new In_Ex03();	// �ܺΰ�ü.new ���ΰ�ü ������();
		System.out.println("=======================");
		Ex03.In_Ex03 in_test2 =  new Ex03().new In_Ex03();
		System.out.println("=======================");
		
		in_test.prn();
		
		// 3. static ���� Ŭ����
		// static �̹Ƿ� �׳� �ҷ��� ��밡��
		System.out.println(In_Ex04.a3);
		System.out.println(In_Ex04.a4);
		In_Ex04.go2();
		
		// *** static ���� Ŭ������ �ܵ����� ��ü ���� ����
		Ex03.In_Ex04 in_test03 = new In_Ex04();
		System.out.println(in_test03.a1);
		System.out.println(in_test03.a2);
		System.out.println(in_test03.a3);
		System.out.println(in_test03.a4);
		//System.out.println(in_test03.a5); // ����
		in_test03.go();
	}
}
