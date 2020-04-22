package com.ict.edu;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex08 {
	public static void main(String[] args) {
		// Queue(큐) 인터페이스 : FIFO(First In First Out) : 먼저 들어온 정보가 먼저 나감, 중복가능
		//      구현한 클래스 : LinkedList
		LinkedList<String> linked = new LinkedList<String>();
		
		// 추가, 삽입 : add, offer,addFrist, addLast, offerFirst, offerLast;
		linked.add("고길동");
		linked.add("도우너");
		linked.offer("마이콜");
		linked.addFirst("또치");
		linked.offerFirst("공실이");
		linked.addLast("꼴뚜기왕자");
		linked.offerLast("고길동");	//중복도 가능
		System.out.println(linked);
		System.out.println("===========================");
		
		// 포함유무
		if(linked.contains("고길동")) {
			System.out.println(linked.indexOf("고길동") + "번째 위치");
			System.out.println(linked.lastIndexOf("고길동") + "번째 위치");
			System.out.println(linked.getFirst());
			System.out.println(linked.getLast());
			System.out.println(linked.get(3));
		}else {
			System.out.println("존재하지 않음");
		}
		System.out.println("===========================");
		
		// 삭제 ; remove(index),remove(Object),removeFirst(), removeLast(), 
		linked.removeFirst();
		linked.removeLast();
		linked.remove("꼴뚜기왕자");
		linked.remove(2);
		
		System.out.println(linked);
		System.out.println("===========================");
		
	
		// 치환
		linked.set(2, "공실이");
		System.out.println(linked);
		System.out.println("===========================");
	
		
		// 출력
		for (String k : linked) {
			System.out.println(k);
		}
		
		System.out.println("===========================");
		Iterator<String> it = linked.iterator();
		while (it.hasNext()) {
			String msg = it.next();
			System.out.println(msg);
		}
	
	}
}
