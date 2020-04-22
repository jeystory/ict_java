package com.ict.edu2;


// 추상클래스의 상속
// 1. 일반클래스가 추상클래스를 상속받으면  반드시 부모클래스의 추상메소드를 오버라이딩 하여 구체화 해야 된다.
// 2. 추상클래스가 추상클래스를 상속받으면 오버라이딩 할 필요가 없다.
//  ** 오버라이딩(재정의) : 상속관계에서 부모클래스이 메소드를 그대로 가지고 와서 내용만 변경해서 사용하는 것
//  ** 오버로딩(중복정의) : 한 클래스안에서  같은 메소들가 여러개 존재하는 것 

public class Ex02 extends Ex01{

	@Override
	public void play3() {}

	@Override
	public int play4() {
		return 0;
	}

}

class Ex03 {
	
}