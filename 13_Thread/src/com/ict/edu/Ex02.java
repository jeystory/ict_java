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
	
	// main()����  start()�� ȣ���ϸ� run() �޼ҵ庸�� �켱������ �����Ƿ� ��Ƽ������ �۾��� �� �� ����
	public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaaa :"  + Thread.currentThread().getName());
		}
	}
}
