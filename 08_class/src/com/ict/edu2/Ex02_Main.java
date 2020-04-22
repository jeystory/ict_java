package com.ict.edu2;

import java.util.Random;

public class Ex02_Main extends Random{
	// random 클래스 객체 생성
	public static void main(String[] args) {
		//Random ran = new Random();
		//int su = ran.nextInt(10)+1;	//1-10
		//System.out.println(su);
		
		// Ex02가 상속을 하면 Random을 상속하면
		
		Ex02_Main test = new Ex02_Main();
		int n1 = test.nextInt(10) + 1;
		System.out.println(n1);
		
		//static 이므로 불러올 수 없다
		// nextInt()가 static이 아니라 불러올 수 없다
		//int num = nextInt(10) + 1;
		
		//play();	// 에러 - 불러서 사용할 수 있는 방법이 없음. 
		//play()를 static으로 변경해도 에러. b.c) nextInt() 가 static 메소드가 아니라서 static 함수에서 불러서 사용 X
		
	}
	
	public void play() {
		int num = nextInt(10) +1 ;
		System.out.println(num);
	}
}
