package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// ���� : �ϳ��� �����͸� �����ϴ� ������
		// �迭 : ���� �ڷ����� �����͵��� �Ѱ��� ��Ƶ� ����
		//      �ݵ�� ���� �ڷ����� ����
		//      ������ �� ũ�⸦ �ݵ�� ����. ������ ũ��� ���� �Ұ���.
		//      ��� : �迭���� �����ϴ� �������� ����� ���� for���� ���.
		  
		
		// �迭�� ���� ���� : ���� -> ���� -> ������ ����
		
		// ����� ������ �ѹ���
		char[] ch = new char[4];	//0-65535
		// ����������
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 97;
		
		for (char c : ch) {
			System.out.println(c);
		}
		
		System.out.println("===============");
		
		// ����� ���� ������ ������ �ѹ���
		String[] str = {"java", "jsp", "spring", "android"};
		
		for (String string : str) {
			System.out.println(string);
		}
		
	}
}
