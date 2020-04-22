package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		String[] str = {"java", "jsp", "spring", "android"};
		
		HashSet<String> set1 = new HashSet<String>();
		//TreeSet<String> set1 = new TreeSet<String>();
		// 배열을 set에 넣어주기
	
		for (String k : str) {
			set1.add(k);
		}
		
		//추가
		set1.add("html");
		set1.add("css");
		System.out.println(set1);
		System.out.println("-----------------");
		
		// set 을 배열로 만들기
		Object [] arr = set1.toArray();
		
		for (Object t : arr) {
			//System.out.println(t);			// okay
			System.out.println((String)(t));
		}	
		System.out.println("-----------------");
		
		// 중복검사
		// set1의 내용 - "java", "jsp", "spring", "android", "Html", "css"
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		set2.add("Java");
		set2.add("java");
		set2.add("JAVA");
		
		System.out.println(set2);	//JAVA, Java, java - 대소문자 구별
		
		
		for (String k : set2) {
			// 삽입 실패 - 중복 데이터 or 제너릭이 틀린 경우
			if(!set1.add(k)) {	//  삽입 실패 - 중복 데이터
				 set3.add(k);
			}
			
		}
		
		System.out.println("======");
		System.out.println(set1);
		System.out.println(set3);		
	}
}
