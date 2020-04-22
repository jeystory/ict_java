package com.ict.edu;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex08 {
	public static void main(String[] args) {
		// Queue(ť) �������̽� : FIFO(First In First Out) : ���� ���� ������ ���� ����, �ߺ�����
		//      ������ Ŭ���� : LinkedList
		LinkedList<String> linked = new LinkedList<String>();
		
		// �߰�, ���� : add, offer,addFrist, addLast, offerFirst, offerLast;
		linked.add("��浿");
		linked.add("�����");
		linked.offer("������");
		linked.addFirst("��ġ");
		linked.offerFirst("������");
		linked.addLast("�öѱ����");
		linked.offerLast("��浿");	//�ߺ��� ����
		System.out.println(linked);
		System.out.println("===========================");
		
		// ��������
		if(linked.contains("��浿")) {
			System.out.println(linked.indexOf("��浿") + "��° ��ġ");
			System.out.println(linked.lastIndexOf("��浿") + "��° ��ġ");
			System.out.println(linked.getFirst());
			System.out.println(linked.getLast());
			System.out.println(linked.get(3));
		}else {
			System.out.println("�������� ����");
		}
		System.out.println("===========================");
		
		// ���� ; remove(index),remove(Object),removeFirst(), removeLast(), 
		linked.removeFirst();
		linked.removeLast();
		linked.remove("�öѱ����");
		linked.remove(2);
		
		System.out.println(linked);
		System.out.println("===========================");
		
	
		// ġȯ
		linked.set(2, "������");
		System.out.println(linked);
		System.out.println("===========================");
	
		
		// ���
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
