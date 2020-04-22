package com.ict.edu;

import java.util.StringTokenizer;

public class Ex04_StringSplitTonkenizer {
	public static void main(String[] args) {
		// ���ڿ� ������ : String.split(), StringTokenizer Ŭ����
		// ������ :
		//			- String.split() : ����� String[] �ε� �迭�� ũ�⸦ ������� ���� �� �ִ�. for�� ���
		// 			- StringTokenizer :�˾Ƽ� �ڵ����� ������. �ʿ���� ���� �ڵ� ����(�߰��� ��������� �κ��� ��� ����). ��ȯ���� �迭�� �ƴ�. for�� ������. while�� ���
		
		String s1 = "  This  is  a  Test";
		String[] arr1 = s1.split(" ");	//[This][is][a][test]
		int j =0;
		for (String k : arr1) {
			System.out.println(j++ + k);
		}
		System.out.println("===========");
		
		String[] arr2 = s1.split(" ", 2);	//[This][is a test]
		for (String x : arr2) {
			System.out.println(x);
		}
		
		StringTokenizer st1 = new StringTokenizer(s1);
		
		while (st1.hasMoreTokens()) {
			String k1 = st1.nextToken();
			System.out.println("k1 : " + k1);
			
		}
		// st1 ������ �������.
	
		st1 = new StringTokenizer(s1);
			
		System.out.println("===========");
		while (st1.hasMoreElements()) {
			String k1 = (String)st1.nextElement();
			System.out.println("k1 : " + k1);
			
		}
		System.out.println("===========");
		
		// StringTokenizer�� ���������� ó���� �����ϳ� ��ü ó���ϱ� ���ؼ��� �迭�� ���� ó���Ѵ�.
		s1 = "This is a test";
		StringTokenizer st3 = new StringTokenizer(s1);
		
		String[] arr3 = new String[st3.countTokens()];
		int i =0;
		
		while(st3.hasMoreTokens()) {
			arr3[i++] = st3.nextToken();
		}
		
		for (int k = 0; k < arr3.length; k++) {
			System.out.println(arr3[k]);
		}
	}
}
