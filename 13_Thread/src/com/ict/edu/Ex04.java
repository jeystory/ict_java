package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("1 : " + Thread.currentThread().getName());
		
		Ex05 testA = new Ex05();
		Ex06 testB = new Ex06();
		
		//testA, testB는 Runnable 구현했으므로 start()를 가지고 있지 않음
		// testA, testB의 run()을 실행하면 스레드 처리가 아니다.
		// Thread 에서 start()에서 start()를 호출하면 스레드 처리가 아니다.
		
		//testA.run();
		//testB.run();
		// start()는 스레드가 가지고 있으므로  Thread를 이용해야 한다. 
		//스레드 실행하는 방법 1
		// new Thread(Runnable target) -> Runnable 를 가진 객체를 넣어주기
		Thread t1 = new Thread(testA);
		t1.start();
		new Thread(testB).start();
		
		// 스레드 실행하는 방법 2 - 안드로이드식 : 익명 내부 클래스 활용한 스레드
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("가가가가 :"  + Thread.currentThread().getName());
				}	
				
			}
		}).start();
		
		
		System.out.println("==========   bye");
	}
}