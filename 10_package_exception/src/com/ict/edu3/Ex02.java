package com.ict.edu3;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1994";
			Calendar now = Calendar.getInstance();
			
			int age = now.get(Calendar.YEAR)- Integer.parseInt(year) + 1 ;
			System.out.println("나이 : " + age);
			
			year = "1994년";
			age = 2019 - Integer.parseInt(year) + 1 ;
			System.out.println("나이 : " + age);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("수고하셨습니다.");
	}
}
