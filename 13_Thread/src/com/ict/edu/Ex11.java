package com.ict.edu;

//임계영역 : 멀티 스레드에서 공통으로 사용되는 영역
//				현재 실행 중인 스레드가 순식간에 다른 스레드에게 제어권을 빼앗길 수 있다.
//				이러한 경우 실시간 처리에서는  문제가 발생할 수 있기 때문에 
//				이를 해결하기 위해서 동기화 처리를  한다.

//동기화 처리 : 임계영역에 synchronized 예약어을 사용하여
//					현재 실행 중인 스레드가 끝날 때까지 다른 스레드는 임계영역에 접근 불가 상태가 되게 만드는 방법 

public class Ex11  implements Runnable{
	int x ;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (x++));
		}
		
		
	}
	
	public static void main(String[] args) {
		Ex11 t1 = new Ex11();
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
		
	}

}
