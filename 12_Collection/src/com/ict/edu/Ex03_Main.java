package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03_VO t1 = new Ex03_VO();
		t1.setName("�Ѹ�");
		t1.setAge(1041);
		t1.setHeight(140.6);
		t1.setHak('b');
		
		Ex03_VO t2 = new Ex03_VO("����", 2, 76.4, 'F');
		Ex03_VO t3 = new Ex03_VO("������", 25, 180.6, 'C');                                                        
		
		//��ü�� �迭�� �ֱ�
		Ex03_VO[] arr = new Ex03_VO[3];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		
		System.out.println(arr);	// �迭�� �ּ�
		for (Ex03_VO x : arr) {
			System.out.println("�̸� :" + x.getName());
			System.out.println("���� :" + x.getHak());
			System.out.println("-----------------------");
		}
		System.out.println("===================");
		
		// �÷��ǿ� �ֱ� : �߰����
		HashSet<Ex03_VO> sets = new HashSet<Ex03_VO>();
		//�߰�(add)
		sets.add(t1);
		sets.add(t2);
		sets.add(t3);
		// �߰��� ����
		sets.add(new Ex03_VO("������", 2019, 139.5, 'A')); //
		System.out.println(sets); 		// Ŭ������ ��� -�ּҰ� ���
		
		for (Ex03_VO x : sets) {
			System.out.println("�̸� :" + x.getName());
			System.out.println("���� :" + x.getHak());
			System.out.println("-----------------------");
		}
		System.out.println("===================");
		
		// ���� : remove(Object O) : ���� ����, clear() : ��ü ����
		sets.remove(t3);
		
		// ���Կ��� : contains(Object o)
		if(sets.contains(t3))	{
			System.out.println("t3 ���� O");
		} else {
			System.out.println("t3 ���� X");
			/*
			if(sets.contains(t2))	{
				System.out.println("t2 ���� O");
			}else {
				System.out.println("t2 ���� X");
			}
			*/
			if(sets.contains(t2.getName().equals("ȫ�浿"))) {
				System.out.println("t2�� �̸��� ȫ�浿" );
			} else {
				System.out.println("t2�� �̸��� "  + t2.getName());
			}
		}
		
		// ũ�� : size();
		System.out.println("sets�� ������ : " + sets.size());
		
		sets.clear();
		System.out.println("sets�� ������ : " + sets.size());
		
		//��� �ִ��� Ȯ��
		if(sets.isEmpty())	
			System.out.println("Empty");
		else 
			System.out.println("Not Empty");
	}
}
