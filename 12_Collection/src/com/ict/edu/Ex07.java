package com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		// List 인터페이스 : 배열과 흡사한 구조, 삽입,삭제가 자유롭다. 크기를 미리 지정하지 안하도 됨, 중복가능
		// 관련클래스 : ArrayList, Vector, Stack

		// ArrayList : 멀티스레드 동기화를 지원하지 않음, 1:N 실시간 처리에 적합하지 않음
		// Vector : 멀티스레드 동기화를 지원, 1:N 실시간 처리에 적합(온라인 좌적예약,....)
		// ArrayList와 Vector 사용용도가 다르지 사용법은 같다
		ArrayList<String> list = new ArrayList<String>();
		// 추가, 삽입 => add()
		list.add("박찬호");
		list.add("손흥민");
		list.add("류현진");
		list.add(0, "차범근");
		System.out.println(list);
		System.out.println("================");

		Vector<String> vector = new Vector<String>();
		vector.add("박찬호");
		vector.add("손흥민");
		vector.addElement("류현진");
		vector.add(0, "차범근");
		System.out.println(vector);
		System.out.println("================");
		
		// 검색
		if (list.contains("손흥민")) {
			System.out.println( list.indexOf("손흥민") + "번째 존재");
			System.out.println( list.lastIndexOf("손흥민") + "번째 존재");
			System.out.println( list.get(2) + "번째 존재");
			// System.out.println(list.elementAt(2));
			// System.out.println(list.firstElement());
			// System.out.println(list.lastElement());
		} else {
			System.out.println("존재하지 않음");
		}

		if (vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민") + "번째 위치");
			System.out.println(vector.lastIndexOf("손흥민") + "번째 위치");
			System.out.println(vector.get(2));
			System.out.println(vector.elementAt(2));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());	
		}
		
		System.out.println(list.get(3));
		// 중복이 없음 indexOf와 같고 중복이 있으면 마지막 객체의 위치를 나타냄
		System.out.println(list.lastIndexOf("철이"));
		
		// 치환
		list.set(1, "박세리");
		vector.set(1, "박세리");
		vector.setElementAt("차두리", 1);
		System.out.println(vector);
		System.out.println("================");
		
		// 중복가능
		list.add(0,"박지성");
		list.add(3,"박지성");
		list.add("박지성");
		System.out.println(list);
		
		vector.add(0,"이승엽");
		vector.add(3,"이승엽");
		vector.add("이승엽");
		vector.add("이승엽");
		System.out.println(vector);
		System.out.println("================");
		
		// 크기(갯수)와 용량(담을 수 있는 최대 공간) : 용량이 채워지면 다시 늘어난다.
		System.out.println(list.size()); // 크기
		System.out.println(vector.size()); // 크기
		// System.out.println(list.capacity()); // 용량
		System.out.println(vector.capacity()); // 용량
		System.out.println("================");

		System.out.println("======== for문 이용========");
		for (String k : vector) {
			System.out.println(k);
		}
		System.out.println("======== while문 이용========");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String msg = it.next();
			System.out.println(msg);
		}
		
	}
}
