package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("메인 : " +  Thread.currentThread().getName());
		Ex08 testA = new Ex08();
		Ex09 testB = new Ex09();
		
		Thread t1 = new Thread(testA);
		Thread t2 = new Thread(testB);
		t1.start();
		t2.start();
		
		// 현재 스레드는 join() 호출한 스레드가 끝날때까지 무조건 대기 상태에 빠진다.
		//즉, join()를 호출한 스레드가 끝나야 다시 실행할 수 있다.
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("수고 : " + Thread.currentThread().getName());
	}
}
