package com.ict.edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap 지정되도록 하고,
		//원하는 나라가 key값이 되어, 화면에 나라를 물어보면 수도나 출력되는 프로그램
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Korea", "Seoul");
		map.put("Canada", "Ottawa");
		map.put("England", "London");
		map.put("Swiss", "Bern");
		
		Scanner scan = new Scanner(System.in);
	
		Set<String> keys = map.keySet();
		
		esc:
		while (true) {
			System.out.print("나라입력 : ");
			String str = scan.next();
			String  res = "";
			
			/* 
			for (String k : map.keySet()) {
				if(str.equals(k)) {
					res  =  map.get(k); 
					break;
				}
			}
			 if(res.equals(""))	System.out.println(str + "is not exist on the list.");
			 else 					System.out.println(str+"의 수도는 "+ res + "입니다.");
			 */
			 
			
			if(keys.contains(str)) {
				res = map.get(str);
				System.out.println(str+"의 수도는 "+ res + "입니다.");
			}else {
				System.out.println("데이터에 없는 나라 입니다.");
			}
			
			
			
			while (true) {
				System.out.print("계속할까요?(y/n) >> ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		System.out.println("수고하셨습니다.");
	}
}
