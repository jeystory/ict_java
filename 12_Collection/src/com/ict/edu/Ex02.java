package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
	
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		//특징 : 중복 X, 특정 기준으로 정렬X , TreeSet은 오름차순 정렬을 유지
		
		//컬렉션 생성 : HashSet<제너릭 = 객체타입=클래스> 참조변수 = new HashSet[객체타입]();	=> [객체 타입]은 생략이 가능
		//HashSet<String> test1 = new HashSet<>(); 객체 타입 String을 생략해도 OK
		HashSet<String> test1 = new HashSet<String>();	
		HashSet<Integer> test2 = new HashSet<Integer>();
		HashSet<Double> test3 = new HashSet<Double>();
		TreeSet<Boolean> test4 = new TreeSet<Boolean>();
		TreeSet<Character> test5 = new TreeSet<Character>();
			
		 //컬렉션에 객체 추가(add)
		String s1 = "둘리";
		String s2 = new String("희동이");
		test1.add(s1);
		test1.add(s2);
		test1.add("마이콜");
		test1.add(new String("또치"));
		
		//test2.add(s1);	제네릭이 맞지 않아서 오류 발생
	    Integer k1 = new Integer(10);
	    Integer k2 = new Integer("20");
	    test2.add(k1);
	    test2.add(k2);
	    test2.add(new Integer(30));
	    test2.add(40);	//auto boxing - 자동으로 객체로 변경되는 것
	    int k3= 50;
	    test2.add(k3);	//변수가 객체로 변경되어서 컬렉션에 저장
	    
	    Double d1 = new Double(3.142);
	    test3.add(d1);
	    test3.add(3.14);
	    //test3.add(3);	// 에러 - int가 double에 들어가서. 크거나 작은 개념이 존재하지 않음. 같은 자료형만 가능
	    test3.add(3.0);
	    
	    // 컬렉션 전제 보기
	    System.out.println(test1);
	    System.out.println(test2);
	    
	    //하나씩 보기
	    for (String x : test1) {
			System.out.println(x);
		}
	    System.out.println("=======");	    
	   
	    Iterator<String> it = test1.iterator();
	    while(it.hasNext()) {
	    	String str = (String) it.next();
	    	System.out.println(str);
	    }
	    
	    /*
	    Iterator<Integer> it2 = test2.iterator();
	    while(it2.hasNext()) {
	    	int num = it2.next();
	    	System.out.println(num);	
	    }
	    */
	    
	}
}
