package com.ict.edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		// ���ѹα�, ĳ����, ����, �������� ������ ���� HashMap �����ǵ��� �ϰ�,
		//���ϴ� ���� key���� �Ǿ�, ȭ�鿡 ���� ����� ������ ��µǴ� ���α׷�
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Korea", "Seoul");
		map.put("Canada", "Ottawa");
		map.put("England", "London");
		map.put("Swiss", "Bern");
		
		Scanner scan = new Scanner(System.in);
	
		Set<String> keys = map.keySet();
		
		esc:
		while (true) {
			System.out.print("�����Է� : ");
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
			 else 					System.out.println(str+"�� ������ "+ res + "�Դϴ�.");
			 */
			 
			
			if(keys.contains(str)) {
				res = map.get(str);
				System.out.println(str+"�� ������ "+ res + "�Դϴ�.");
			}else {
				System.out.println("�����Ϳ� ���� ���� �Դϴ�.");
			}
			
			
			
			while (true) {
				System.out.print("����ұ��?(y/n) >> ");
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
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
