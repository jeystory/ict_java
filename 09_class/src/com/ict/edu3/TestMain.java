package com.ict.edu3;

public class TestMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.legs);
		System.out.println(dog.eyes);
		System.out.println(dog.name);
		System.out.println(dog.age);
		
		dog.play();
		dog.sound();
		dog.like();
		
		System.out.println("=============");
		
		System.out.println(cat.legs);
		System.out.println(cat.eyes);
		System.out.println(cat.name);
		System.out.println(cat.age);
		
		cat.hobby();
		cat.sound();
		cat.like();
		System.out.println("=============");
		
		Animal animal = null;
		int op = 1;
		
		switch (op) {
		case 1:
			animal = new Dog();
			break;
		case 2:
			animal = new Cat();
			break;
		default:
			break;
		}
		
		// 다형성 
		animal.sound();		// 부모 클래스에 있는 메소드는 Ok
		animal.like();			// 부모 클래스에 있는 메소드는 Ok
		//animal.play();	//에러 - Dog에 있는 메소드
		//animal.hobby();	// 에러 - Cat에 있는 메소드
		
		System.out.println(animal.legs);	// 부모 클래스에 있는 필드 Ok
		System.out.println(animal.eyes);	// 부모 클래스에 있는 필드 Ok
		//System.out.println(animal.name);	//에러 - 부모 클래스에 없는 필드
		//System.out.println(animal.age);		//에러 - 부모 클래스에 없는 필드
		
	}
}
