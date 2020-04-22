package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03_VO t1 = new Ex03_VO();
		t1.setName("둘리");
		t1.setAge(1041);
		t1.setHeight(140.6);
		t1.setHak('b');
		
		Ex03_VO t2 = new Ex03_VO("희동이", 2, 76.4, 'F');
		Ex03_VO t3 = new Ex03_VO("마이콜", 25, 180.6, 'C');                                                        
		
		//객체를 배열에 넣기
		Ex03_VO[] arr = new Ex03_VO[3];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		
		System.out.println(arr);	// 배열의 주소
		for (Ex03_VO x : arr) {
			System.out.println("이름 :" + x.getName());
			System.out.println("학점 :" + x.getHak());
			System.out.println("-----------------------");
		}
		System.out.println("===================");
		
		// 컬렉션에 넣기 : 추가기능
		HashSet<Ex03_VO> sets = new HashSet<Ex03_VO>();
		//추가(add)
		sets.add(t1);
		sets.add(t2);
		sets.add(t3);
		// 추가도 가능
		sets.add(new Ex03_VO("공실이", 2019, 139.5, 'A')); //
		System.out.println(sets); 		// 클래스인 경우 -주소값 출력
		
		for (Ex03_VO x : sets) {
			System.out.println("이름 :" + x.getName());
			System.out.println("학점 :" + x.getHak());
			System.out.println("-----------------------");
		}
		System.out.println("===================");
		
		// 삭제 : remove(Object O) : 개별 삭제, clear() : 전체 삭제
		sets.remove(t3);
		
		// 포함여부 : contains(Object o)
		if(sets.contains(t3))	{
			System.out.println("t3 포함 O");
		} else {
			System.out.println("t3 포함 X");
			/*
			if(sets.contains(t2))	{
				System.out.println("t2 포함 O");
			}else {
				System.out.println("t2 포함 X");
			}
			*/
			if(sets.contains(t2.getName().equals("홍길동"))) {
				System.out.println("t2의 이름은 홍길동" );
			} else {
				System.out.println("t2의 이름은 "  + t2.getName());
			}
		}
		
		// 크기 : size();
		System.out.println("sets의 갯수는 : " + sets.size());
		
		sets.clear();
		System.out.println("sets의 갯수는 : " + sets.size());
		
		//비어 있는지 확인
		if(sets.isEmpty())	
			System.out.println("Empty");
		else 
			System.out.println("Not Empty");
	}
}
