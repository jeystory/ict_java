package com.ict.edu4;

public class Ex02 {
	public static void main(String[] args) {
		String str = "Java Programming";
	
		char ch = '0';
		
		String msg = str.substring(2,4);
		System.out.println(msg);
		int nCount =0;
		for (int i = 2; i < str.length(); i++) {
			ch = str.charAt(i);		
			// substring(i, i+1)�� �Ἥ �ϴ� ����� ����
			if(ch == 'r')	nCount++;
		}
		System.out.println("r�� ���� : " + nCount);
		
	}
}
