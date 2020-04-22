package com.ict.edu2;

// extends :멤버 필드, 메소드의 확장(부모의 멤버 필드, 메소드 사용가능)
public class Ex03_DCPhone extends Ex03_Phone {
	public Ex03_DCPhone(String name) {
		super(name);
		System.out.println(name + "Phone 생성");
	}
	public void takePicture() {
		System.out.println("사진을 찍어요");
	}

}
