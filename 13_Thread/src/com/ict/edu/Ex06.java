package com.ict.edu;

// run()만 가지고 있음
public class Ex06 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("11111 :"  + Thread.currentThread().getName());
		}
		
	}

}
