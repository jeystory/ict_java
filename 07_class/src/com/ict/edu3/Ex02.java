package com.ict.edu3;

public class Ex02 {
	public static void main(String[] args) {
		
		Ex01 test = new Ex01();
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAddr());
		System.out.println("====================");
		// setter() -> ����ʵ尪 ����
		test.setName("�±Ǻ���");
		test.setAge(35);
		test.setAddr("����");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAddr());
		System.out.println("====================");
		
		Ex01 test2 = new Ex01("������", 1000, "�ϱ�");
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(test2.getAddr());		
	}
}
