package com.ict.edu;

// start(), run()
public class Ex02 extends Thread{
	public void play() {
		System.out.println(Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa :"  + Thread.currentThread().getName());
		}
	}
	
	// main()에서  start()를 호출하면 run() 메소드보다 우선순위가 있으므로 멀티스레드 작업을 할 수 없음
	public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa :"  + Thread.currentThread().getName());
		}
	}
}
