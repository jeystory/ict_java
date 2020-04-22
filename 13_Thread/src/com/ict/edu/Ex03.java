package com.ict.edu;

public class Ex03 extends Thread {
	public void play() {
		System.out.println(Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("11111 :"  + Thread.currentThread().getName());
		}
	}
	
	public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("11111 :"  + Thread.currentThread().getName());
		}
	}
}

