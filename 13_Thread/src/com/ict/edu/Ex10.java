package com.ict.edu;

public class Ex10 implements Runnable{
	static boolean autoSave = false; 
	public static void main(String[] args) {
		// 데몬스레드 : 일반 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드
		// 					- 일반 스레드가 종료되면 데몬 스레드는 강제적으로 자동 종료된다
		// 					- 예) 워드프로세서의 자동 저장, 화면 자동 갱신 등이 있다.
		Thread t1 = new Thread(new Ex10());
		t1.setDaemon(true);
		//t1.setDaemon(false);	// 데몬스레드로 작동 하지 않음
		t1.start();
		for (int i = 1; i < 18; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			if(i == 5 )	autoSave = true;
		}
		System.out.println("프로그램 종료");
	
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);	// 3초마다
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(autoSave)
				autoSave();
		}
		
	}
	
	public void autoSave() {
		System.out.println("작업파일을 자동 저장 합니다.");
	}
}
