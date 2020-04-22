package com.ict.edu;

public class Ex01_StringEquals {
	public static void main(String[] args) {
		String s1 = "ICT ���簳�߿�";
		String s2 = "ICT ���簳�߿�";
		
		// ����
		// '==' �� �ǹ̴� �⺻ �ڷ����� ���� '�����Ͱ� ����?'�� �ǹ̰� �ִ�.
		// String ��ü�� ���� '�ּҰ� ����?' �� �ǹ̰� �ִ�.
		// �⺻ �ڷ���ó�� String ��ü�� ���鶧 ������ ������ ������ ���� ������ ������ �����͸� �Բ� ����Ѵ�.
		// String������ �����Ͱ� ���ٴ� �ǹ̷� '==' �� ������� �ʴ´�.
		
		if(s1 == s2)	System.out.println("����");	//����
		else				System.out.println("�ٸ���");
		
		String s3 = new String("ICT ���簳�߿�");
		if(s1 == s3)	System.out.println("����");
		else				System.out.println("�ٸ���");	// �ٸ���
		
		if(s2 == s3)	System.out.println("����");
		else				System.out.println("�ٸ���");	// �ٸ���
		
		// String ���� '������ ����?'�� equals, equalsIgnoreCase�� ���
		
		if(s1.equals(s2))	System.out.println("����");	//����
		else				System.out.println("�ٸ���");
		
		if(s1.equals(s3))	System.out.println("����");
		else				System.out.println("�ٸ���");	// �ٸ���
		
		if(s2.equals(s3))	System.out.println("����");
		else				System.out.println("�ٸ���");	// �ٸ���
		
		
	}
	
}
