package com.ict.edu4;

public class AnimalTest {
	public static void main(String[] args) {
		Animal test = new Animal();
		
		test.setName("ÄÚ»Ô¼Ò");
		test.setAge(3);
		test.setLive(true);
		
		test.setName("Æë±Ï");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.isLive());

	}
}
