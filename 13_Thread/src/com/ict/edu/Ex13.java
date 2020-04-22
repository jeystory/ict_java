package com.ict.edu;

public class Ex13 implements Runnable{
	int x;
	@Override
	public synchronized void run() {
		for(int i=0;i<100;i++) {
			x++;
			System.out.println(Thread.currentThread().getName() + ":" + x);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		Ex13 test = new Ex13();
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		
	}

}
