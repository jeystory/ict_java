package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		String[] str = {"java", "jsp", "spring", "android"};
		
		HashSet<String> set1 = new HashSet<String>();
		//TreeSet<String> set1 = new TreeSet<String>();
		// �迭�� set�� �־��ֱ�
	
		for (String k : str) {
			set1.add(k);
		}
		
		//�߰�
		set1.add("html");
		set1.add("css");
		System.out.println(set1);
		System.out.println("-----------------");
		
		// set �� �迭�� �����
		Object [] arr = set1.toArray();
		
		for (Object t : arr) {
			//System.out.println(t);			// okay
			System.out.println((String)(t));
		}	
		System.out.println("-----------------");
		
		// �ߺ��˻�
		// set1�� ���� - "java", "jsp", "spring", "android", "Html", "css"
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		set2.add("Java");
		set2.add("java");
		set2.add("JAVA");
		
		System.out.println(set2);	//JAVA, Java, java - ��ҹ��� ����
		
		
		for (String k : set2) {
			// ���� ���� - �ߺ� ������ or ���ʸ��� Ʋ�� ���
			if(!set1.add(k)) {	//  ���� ���� - �ߺ� ������
				 set3.add(k);
			}
			
		}
		
		System.out.println("======");
		System.out.println(set1);
		System.out.println(set3);		
	}
}
