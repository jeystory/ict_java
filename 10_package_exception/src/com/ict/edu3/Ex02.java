package com.ict.edu3;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1994";
			Calendar now = Calendar.getInstance();
			
			int age = now.get(Calendar.YEAR)- Integer.parseInt(year) + 1 ;
			System.out.println("���� : " + age);
			
			year = "1994��";
			age = 2019 - Integer.parseInt(year) + 1 ;
			System.out.println("���� : " + age);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
