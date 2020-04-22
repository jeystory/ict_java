package com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		// List �������̽� : �迭�� ����� ����, ����,������ �����Ӵ�. ũ�⸦ �̸� �������� ���ϵ� ��, �ߺ�����
		// ����Ŭ���� : ArrayList, Vector, Stack

		// ArrayList : ��Ƽ������ ����ȭ�� �������� ����, 1:N �ǽð� ó���� �������� ����
		// Vector : ��Ƽ������ ����ȭ�� ����, 1:N �ǽð� ó���� ����(�¶��� ��������,....)
		// ArrayList�� Vector ���뵵�� �ٸ��� ������ ����
		ArrayList<String> list = new ArrayList<String>();
		// �߰�, ���� => add()
		list.add("����ȣ");
		list.add("�����");
		list.add("������");
		list.add(0, "������");
		System.out.println(list);
		System.out.println("================");

		Vector<String> vector = new Vector<String>();
		vector.add("����ȣ");
		vector.add("�����");
		vector.addElement("������");
		vector.add(0, "������");
		System.out.println(vector);
		System.out.println("================");
		
		// �˻�
		if (list.contains("�����")) {
			System.out.println( list.indexOf("�����") + "��° ����");
			System.out.println( list.lastIndexOf("�����") + "��° ����");
			System.out.println( list.get(2) + "��° ����");
			// System.out.println(list.elementAt(2));
			// System.out.println(list.firstElement());
			// System.out.println(list.lastElement());
		} else {
			System.out.println("�������� ����");
		}

		if (vector.contains("�����")) {
			System.out.println(vector.indexOf("�����") + "��° ��ġ");
			System.out.println(vector.lastIndexOf("�����") + "��° ��ġ");
			System.out.println(vector.get(2));
			System.out.println(vector.elementAt(2));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());	
		}
		
		System.out.println(list.get(3));
		// �ߺ��� ���� indexOf�� ���� �ߺ��� ������ ������ ��ü�� ��ġ�� ��Ÿ��
		System.out.println(list.lastIndexOf("ö��"));
		
		// ġȯ
		list.set(1, "�ڼ���");
		vector.set(1, "�ڼ���");
		vector.setElementAt("���θ�", 1);
		System.out.println(vector);
		System.out.println("================");
		
		// �ߺ�����
		list.add(0,"������");
		list.add(3,"������");
		list.add("������");
		System.out.println(list);
		
		vector.add(0,"�̽¿�");
		vector.add(3,"�̽¿�");
		vector.add("�̽¿�");
		vector.add("�̽¿�");
		System.out.println(vector);
		System.out.println("================");
		
		// ũ��(����)�� �뷮(���� �� �ִ� �ִ� ����) : �뷮�� ä������ �ٽ� �þ��.
		System.out.println(list.size()); // ũ��
		System.out.println(vector.size()); // ũ��
		// System.out.println(list.capacity()); // �뷮
		System.out.println(vector.capacity()); // �뷮
		System.out.println("================");

		System.out.println("======== for�� �̿�========");
		for (String k : vector) {
			System.out.println(k);
		}
		System.out.println("======== while�� �̿�========");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String msg = it.next();
			System.out.println(msg);
		}
		
	}
}
