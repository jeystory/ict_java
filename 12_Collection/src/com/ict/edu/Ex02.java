package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
	
		// Set �������̽��� ������ Ŭ���� : HashSet, TreeSet
		//Ư¡ : �ߺ� X, Ư�� �������� ����X , TreeSet�� �������� ������ ����
		
		//�÷��� ���� : HashSet<���ʸ� = ��üŸ��=Ŭ����> �������� = new HashSet[��üŸ��]();	=> [��ü Ÿ��]�� ������ ����
		//HashSet<String> test1 = new HashSet<>(); ��ü Ÿ�� String�� �����ص� OK
		HashSet<String> test1 = new HashSet<String>();	
		HashSet<Integer> test2 = new HashSet<Integer>();
		HashSet<Double> test3 = new HashSet<Double>();
		TreeSet<Boolean> test4 = new TreeSet<Boolean>();
		TreeSet<Character> test5 = new TreeSet<Character>();
			
		 //�÷��ǿ� ��ü �߰�(add)
		String s1 = "�Ѹ�";
		String s2 = new String("����");
		test1.add(s1);
		test1.add(s2);
		test1.add("������");
		test1.add(new String("��ġ"));
		
		//test2.add(s1);	���׸��� ���� �ʾƼ� ���� �߻�
	    Integer k1 = new Integer(10);
	    Integer k2 = new Integer("20");
	    test2.add(k1);
	    test2.add(k2);
	    test2.add(new Integer(30));
	    test2.add(40);	//auto boxing - �ڵ����� ��ü�� ����Ǵ� ��
	    int k3= 50;
	    test2.add(k3);	//������ ��ü�� ����Ǿ �÷��ǿ� ����
	    
	    Double d1 = new Double(3.142);
	    test3.add(d1);
	    test3.add(3.14);
	    //test3.add(3);	// ���� - int�� double�� ����. ũ�ų� ���� ������ �������� ����. ���� �ڷ����� ����
	    test3.add(3.0);
	    
	    // �÷��� ���� ����
	    System.out.println(test1);
	    System.out.println(test2);
	    
	    //�ϳ��� ����
	    for (String x : test1) {
			System.out.println(x);
		}
	    System.out.println("=======");	    
	   
	    Iterator<String> it = test1.iterator();
	    while(it.hasNext()) {
	    	String str = (String) it.next();
	    	System.out.println(str);
	    }
	    
	    /*
	    Iterator<Integer> it2 = test2.iterator();
	    while(it2.hasNext()) {
	    	int num = it2.next();
	    	System.out.println(num);	
	    }
	    */
	    
	}
}
