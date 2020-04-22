package com.ict.edu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Ex11_Test {
	public static void main(String[] args) {
		/*
		HashMap <String, String > map = new HashMap<String, String>();
		
		map.put("korea", "seoul");
		map.put("canada", "ottawa");
		map.put("china", "beijing");
		map.put("usa", "washington");
		
		Set <String> sets = map.keySet();
		
		String str = "korea";
		String str1 ="";
		if(sets.contains(str)) {
			str1 = map.get(str);
		}
		
		System.out.println(str1);
		
	
		
		 for (String x : map.keySet()) {
			System.out.println(map.get(x));
		}
		 
		map.remove("usa", "washington");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(map.get(s));
		}
		*/
		
		ArrayList<String> list = new ArrayList<String>();
	
		
		// 추가
		list.add("둘리");
		list.add("희동이");
		list.add(0, "또치");
		list.add(2, "고길동");
		list.add(3, "둘리");
		
		System.out.println(list);
		int idx = 0;		
		// 포함유무
		if(list.contains("둘리")){
			idx= list.lastIndexOf("둘리");
			System.out.println(idx);
		} else {
			System.out.println("존재하지 않는 데이터");
		}
		
		System.out.println(list.get(3));
		
		// 치환
		list.set(3, "또치");
		System.out.println(list.get(3));
		
		//삭제
		System.out.println("=======");
		list.remove(3);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("=======");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
			
		
		
		
		//
		
		
	}
}
