package com.ict.edu;

import java.util.Stack;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		/* List Interface :  �迭�� ����� ����, ����, ������ �����Ӵ�. ũ�⸦ �̸��������� �ʾƵ� ��, �ߺ�����
		 * ���� Ŭ���� : ArrayList, Vector, Stack
		 * Stack : LIFO(LastInFirstOut) : �������� ���� �����Ͱ� ���� ������ ����
		 * �޼ҵ� : add, push, addElement -> �߰�(append)
		 * 		add(index, E) => ����(insert)
		 * 		pop => ������ �����ϴ� ��ü�� ��ȯ �� ��������
		 * 		peek => ������ �����ϴ� ��ü�� ��ȯ
		 * 		search => �˻�( �����ʺ��� ����(1���� ����))
		 * 		elementAt(index) => ã��(��ġ��ȯ)(���ʺ��� ����(0���ͽ���))
		 * 		indexOf => ã��(��ġ��ȯ)(���ʺ��� ����(0���� ����))
		 * 		get(index)=> ã��(��ġ��ȯ)(���ʺ��� ����(0���ͽ���))
		 * 		firstElement() => ó�� ���
		 * 		lastElement() => ������ ���
		 * 		setElementAt(Element,index) = > ġȯ
		*/

		Stack<String> st = new Stack<String>();
		//set���� �ٸ��� ������� ��
		st.add("�Ѹ�");
		st.push("������");
		st.addElement("������");
		System.out.println(st);
		System.out.println("========");
		
		st.add(0, "��浿");
		System.out.println(st);
		System.out.println("========");
		
		st.add(3, "����");
		System.out.println(st);
		System.out.println("========");
		
		// ������ ��ü ����
		System.out.println("������ ��� : " + st.peek());
		System.out.println(st);
		System.out.println("========");
				
		System.out.println("������ ��� : " + st.pop());
		System.out.println(st);
		System.out.println("========");
		
		// �˻�
		if(st.contains("�Ѹ�")) {
			System.out.println( st.indexOf("�Ѹ�") + "��° ��ġ");
			System.out.println( st.search("�Ѹ�") + "��° ��ġ");
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
		
		//  ġȯ
		st.setElementAt("�����", 2);
		System.out.println(st);
		System.out.println("==================");
		
		// �ߺ� ����
		st.add("�Ѹ�");
		st.add(0, "�Ѹ�");
		System.out.println(st);
		System.out.println("========");
		
		// ���
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
		// �Ųٷ� �����鼭 ����
		while (! st.isEmpty()) {
			// st.peek()�� ���� ������ ������.
			String k = st.pop();
			System.out.println(k);
			System.out.println("pop�� ���� �ϹǷ� ũ��� "+ st.size() + "�̴�.");
		}
	}
}
