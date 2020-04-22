package com.ict.edu;

public class Ex08 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println("Run : " + Thread.currentThread().getName());
		}
		
		first();
		
	}
	
	public void first() {
		for (int i = 0; i < 50; i++) {
			System.out.println("first : " + Thread.currentThread().getName());
		}
		
	}

}
