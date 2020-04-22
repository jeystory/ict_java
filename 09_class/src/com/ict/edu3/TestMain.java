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
		
		// ������ 
		animal.sound();		// �θ� Ŭ������ �ִ� �޼ҵ�� Ok
		animal.like();			// �θ� Ŭ������ �ִ� �޼ҵ�� Ok
		//animal.play();	//���� - Dog�� �ִ� �޼ҵ�
		//animal.hobby();	// ���� - Cat�� �ִ� �޼ҵ�
		
		System.out.println(animal.legs);	// �θ� Ŭ������ �ִ� �ʵ� Ok
		System.out.println(animal.eyes);	// �θ� Ŭ������ �ִ� �ʵ� Ok
		//System.out.println(animal.name);	//���� - �θ� Ŭ������ ���� �ʵ�
		//System.out.println(animal.age);		//���� - �θ� Ŭ������ ���� �ʵ�
		
	}
}
