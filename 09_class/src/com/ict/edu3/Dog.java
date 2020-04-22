package com.ict.edu3;

// 추상클래스를 상속받았기 때문에 부모클래스의 추상메소드를 오버라이딩 해야함.
public class Dog extends Animal{

	String name = "멍멍이";
	int age = 4;
	
	public void play() {
		System.out.println("산책하기");
	}
	@Override
	public void sound() {
		System.out.println("멍~멍~");
	}

}
