package com.ict.edu3;

public class Ex02 {
	public static void main(String[] args) {
		
		Ex01 test = new Ex01();
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAddr());
		System.out.println("====================");
		// setter() -> 멤버필드값 변경
		test.setName("태권브이");
		test.setAge(35);
		test.setAddr("서울");
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
		System.out.println(test.getAddr());
		System.out.println("====================");
		
		Ex01 test2 = new Ex01("공실이", 1000, "북극");
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(test2.getAddr());		
	}
}
