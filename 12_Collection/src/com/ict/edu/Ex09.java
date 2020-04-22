package com.ict.edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Map �������̽� : key�� value�� 1:1 ��Ī
// key�� ȣ���ϸ� value�� ���´�.
// ���� Ŭ���� : HaspMap: value �� key�� null�� �ѹ� ���
// key�� �ߺ��� ������� ����
// key�� ���� set���� ������ �����Ѵ�. = > keySet()
// get(key)�� �ϸ� value�� ���´�.
// add()�� �߰��� ������ �� �� ����.
// put(key, value)�� �����Ѵ�.

//Map�� ������ Ŭ���� : HashMap
public class Ex09 {
	public static void main(String[] args) {
		// Map ����
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		// �߰�
		// ����ϱ� ���� key��  Integer�� ������� �־���.
		map1.put(0, "�ѱ�");
		map1.put(1, "�̱�");
		map1.put(2, "�߱�");
		map1.put(3, "�Ϻ�");
		map1.put(4, "�ѱ�");    // value�� �ߺ� ����
		map1.put(3, "����");    // Ű �ߺ� �ȵ�, ����Ⱑ ��(��, �Ϻ��� �������� ������ ����)
		
	
		System.out.println(map1);
		System.out.println("=========================");
		
		// ȣ����
		System.out.println(map1.get(4));
		System.out.println(map1.get("�ѱ�"));	//  "�ѱ�" �̶�� Ű�� ���� ������ -> null ���
		
		// �Ϻη� key�� 0���� ������� ������� ������ for�� ����ϱ� ����
		System.out.println("=========================");
		for (int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println("=========================");
		
		// key => Integer
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		
		System.out.println("=========================");
		// key => Integer
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = it.next();
			System.out.println(map1.get(k));
		}
		 System.out.println("==========================");
		
		// �Ϲ������� ����ϴ� Map
		 HashMap<String, String> map2 = new HashMap<String, String>();
		 map2.put("�̸�", "��浿");
		 map2.put("����", "38");
		 map2.put("�ּ�", "����� ������ ������");
		 map2.put("����", "����");
		 
		 System.out.println(map2.get("�̸�"));
		 System.out.println(map2.get("����"));
		 System.out.println(map2.get("�ּ�"));
		 System.out.println(map2.get("����"));
		 System.out.println("==========================");
		 
		 for (String k : map2.keySet()) {
			System.out.println(k + ":" + map2.get(k));
		}
		System.out.println("==========================");
		
	
		 Iterator<String> it2 = map2.keySet().iterator();
		 while (it2.hasNext()) {
			String k= it2.next();
			System.out.println(k + ":" + map2.get(k));
		}

		 System.out.println("==========================");
		// key���� ������ ����
		 Set<String> set1 =  map2.keySet();
		 System.out.println(set1);
		 //value���� ������ ����
		 Collection<String> set2 =  map2.values();
		 System.out.println(set2);
	}
}
