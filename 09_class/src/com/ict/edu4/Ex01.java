package com.ict.edu4;

// 인터페이스 : 서비스를 제공하기 위한 목록
// 					- ** 구성 : 추상메소드와 상수(static final)
// 					- 생성자 X => 객체 생성 X
//					- 다중 상속이 가능
//  				- 인터페이스가 같다 : 대체 또는 호환 가능
/*
           interface
             /    \ 
  extends     implements    
           /        \
    interface   class
           \         /
implements  extends 
            \      /
              class
 
**클래스를 부모로 가지는 인터페이스는 없다.      
*/
public interface Ex01 {
	// 자동으로 static final로 변경
	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;
	
	/*	// 일반메소드는 사용할 수 없음
	public  void play() {
		
	}*/
	public static void paly() {
		System.out.println("static 메소드는 사용가능");
	};
	
	// 추상메소드 사용가능
	public abstract void play2();
	// abstract를 붙이지 않아도 인터페이스는 오류 아님
	public void sound();
}
