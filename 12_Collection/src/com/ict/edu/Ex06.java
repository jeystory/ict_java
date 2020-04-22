package com.ict.edu;

import java.util.Stack;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		/* List Interface :  배열과 흡사한 구조, 삽입, 삭제가 자유롭다. 크기를 미리지정하지 않아도 됨, 중복가능
		 * 관련 클래스 : ArrayList, Vector, Stack
		 * Stack : LIFO(LastInFirstOut) : 마지막에 들어온 데이터가 먼저 나가는 구조
		 * 메소드 : add, push, addElement -> 추가(append)
		 * 		add(index, E) => 삽입(insert)
		 * 		pop => 맨위에 존재하는 객체를 반환 후 삭제까지
		 * 		peek => 맨위에 존재하는 객체를 반환
		 * 		search => 검색( 오른쪽부터 시작(1부터 시작))
		 * 		elementAt(index) => 찾기(위치반환)(왼쪽부터 시작(0부터시작))
		 * 		indexOf => 찾기(위치반환)(왼쪽부터 시작(0부터 시작))
		 * 		get(index)=> 찾기(위치반환)(왼쪽부터 시작(0부터시작))
		 * 		firstElement() => 처음 요소
		 * 		lastElement() => 마지막 요소
		 * 		setElementAt(Element,index) = > 치환
		*/

		Stack<String> st = new Stack<String>();
		//set과는 다르게 순서대로 들어감
		st.add("둘리");
		st.push("공실이");
		st.addElement("마이콜");
		System.out.println(st);
		System.out.println("========");
		
		st.add(0, "고길동");
		System.out.println(st);
		System.out.println("========");
		
		st.add(3, "희동이");
		System.out.println(st);
		System.out.println("========");
		
		// 마지막 객체 보기
		System.out.println("마지막 사람 : " + st.peek());
		System.out.println(st);
		System.out.println("========");
				
		System.out.println("마지막 사람 : " + st.pop());
		System.out.println(st);
		System.out.println("========");
		
		// 검색
		if(st.contains("둘리")) {
			System.out.println( st.indexOf("둘리") + "번째 위치");
			System.out.println( st.search("둘리") + "번째 위치");
		}else {
			System.out.println("not exist");
		}
		System.out.println("==================");
		System.out.println(st.elementAt(3));
		System.out.println(st.get(3));
		System.out.println(st.firstElement());
		System.out.println(st.lastElement());
		System.out.println(st.get(st.size()-1));
		System.out.println("==================");
		
		//  치환
		st.setElementAt("도우너", 2);
		System.out.println(st);
		System.out.println("==================");
		
		// 중복 가능
		st.add("둘리");
		st.add(0, "둘리");
		System.out.println(st);
		System.out.println("========");
		
		// 출력
		for (String k : st) {
			System.out.println(k);
		}
		System.out.println("=============");
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
		System.out.println("=============");
		// 거꾸로 나오면서 삭제
		while (! st.isEmpty()) {
			// st.peek()는 무한 루프로 빠진다.
			String k = st.pop();
			System.out.println(k);
			System.out.println("pop는 삭제 하므로 크기는 "+ st.size() + "이다.");
		}
	}
}
