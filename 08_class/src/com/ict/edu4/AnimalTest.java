package com.ict.edu4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal test = new Animal();
		
		test.setName("�ڻԼ�");
		test.setAge(3);
		test.setLive(true);
		
		test.setName("���");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.isLive());

	}
}
