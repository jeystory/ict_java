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
	
		
		// �߰�
		list.add("�Ѹ�");
		list.add("����");
		list.add(0, "��ġ");
		list.add(2, "��浿");
		list.add(3, "�Ѹ�");
		
		System.out.println(list);
		int idx = 0;		
		// ��������
		if(list.contains("�Ѹ�")){
			idx= list.lastIndexOf("�Ѹ�");
			System.out.println(idx);
		} else {
			System.out.println("�������� �ʴ� ������");
		}
		
		System.out.println(list.get(3));
		
		// ġȯ
		list.set(3, "��ġ");
		System.out.println(list.get(3));
		
		//����
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
