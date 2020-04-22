package com.ict.edu4;

public class Ex04 {
	public static void main(String[] args) {
		Ex03 test1 = new Ex03();
		System.out.println("이름 : " + test1.name);
		System.out.println("age : " + test1.age);
		System.out.println("===================");
		
		Ex03 test2 = new Ex03("둘리");
		System.out.println("이름 : " + test2.name);
		System.out.println("age : " + test2.age);
		System.out.println("===================");
		
		Ex03 test3 = new Ex03(27);
		System.out.println("이름 : " + test3.name);
		System.out.println("age : " + test3.age);
		System.out.println("===================");
		
		Ex03 test4 = new Ex03("희동이", 3);
		System.out.println("이름 : " + test4.name);
		System.out.println("age : " + test4.age);
		System.out.println("===================");
	}
}
