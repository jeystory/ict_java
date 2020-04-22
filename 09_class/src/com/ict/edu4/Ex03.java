package com.ict.edu4;

// 인터페이스의 상속
// 1. 일반클래스가 인터페이스를 상속 받으면 반드시 오버라이딩 해야 된다.(implements 예약어 사용 ) 
class Ex03 implements Ex01{
	@Override
	public void play2() { 	}
	@Override
	public void sound() {	}
}

// 2. 추상클래스가 인터페이스를 상속 받으면 오러라이딩 할 필요가 없다.(implements 예약어 사용 )
abstract class Ex04 implements Ex01{
	int s1 = 10 ;             // 인스턴스 변수
    static int s2 = 20 ;      // static 변수
    final int s3 = 30 ;       // 인스턴스 상수
    static final int s4 = 40 ;// static 상수

    public abstract void leftSound() ; // 추상메소드
    
}

abstract class Ex05 implements Ex01{
	int n1 = 10 ;             // 인스턴스 변수
    static int n2 = 20 ;      // static 변수
    final int n3 = 30 ;       // 인스턴스 상수
    static final int n4 = 40 ;// static 상수
}

// 3. 인터페이스가 인터페이스를 상속받으면 오버라이딩 할 필요가 없다.(extends 예약어 사용)
interface Ex06 extends Ex01{
	
}

// 2번,3번을 나중에 일반 클래스로 상속 받으면 모두 오버라이딩 해야 된다.
class Ex07 extends Ex04{
    // Ex01 
	@Override
	public void play2() {}
    // Ex01
	@Override
	public void sound() {}
    // Ex04
	@Override
	public void leftSound() {}
}

class Ex08 extends Ex05{
     // Ex01
	@Override
	public void play2() {}
     // Ex01
	@Override
	public void sound() {}
}
 
class Ex09 implements Ex06{
	 // Ex01
	@Override
	public void play2() {}
	 // Ex01
	@Override
	public void sound() {}
	
}



