package com.ict.edu7;

public class Ex04_Main {
	public static void main(String[] args) {
		// Local ���� Ŭ���� �ܵ����� ��ü ���� X 
		// In_Ex04 test = new In_Ex04();
		
		// ��� ���� Ŭ���� ������ε� ��ü ���� �Ұ���
		//Ex04.In_Ex04 test1 = new Ex04().new In_Ex04();
		
		// Local �ܺ� Ŭ���� �޼ҵ�ȿ� ���� -> �ܺ� Ŭ���� �޼ҵ带 �����ؾ� ���� ������ �ȴ�.
		Ex04 test = new Ex04();
		test.play();
		System.out.println("bye");
	}
}
