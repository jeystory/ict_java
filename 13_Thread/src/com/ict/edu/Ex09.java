package com.ict.edu;

public class Ex09 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<50; i++)
			System.out.println("RunB: " + Thread.currentThread().getName());
		first();
		
	}
	
	public void first() {
		for(int i=0;i<50; i++)
			System.out.println("firstB : " + Thread.currentThread().getName());
	}

}
