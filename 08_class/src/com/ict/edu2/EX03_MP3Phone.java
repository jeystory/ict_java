package com.ict.edu2;

public class EX03_MP3Phone extends Ex03_Phone  {
	public EX03_MP3Phone(String name) {
		super(name);
		System.out.println(name + "Phone 생성");
	}
	

	
	public void listenMusic() {
		System.out.println("음악을 들어요");
	}
}
