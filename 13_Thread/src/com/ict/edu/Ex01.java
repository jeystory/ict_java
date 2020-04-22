package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 현재 실행중인 스레드 이름 호출
		System.out.println(Thread.currentThread().getName());
		
		Ex02 t1 = new Ex02();
		Ex03 t2 = new Ex03();
		t1.play();
		t2.play();
		// t1, t2는 thread를 상속 받았으므로 start(), run() 을 가짐
		//start() 호출하면 run() 를 가서 스레드를 생성하고 작업을 실행
		// 멀티스레드 :  스레드가 여러개의 일을 동시에 병행처리
		t1.start();
		t2.start();
		System.out.println("Bye");
	}
}
