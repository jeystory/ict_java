package com.ict.edu;

public class Ex05 {
		//멤버 필드 : 상태값, 속성
		// - static X - 인스턴스
		// - static O - static
		// - final X - 변수
		// - final O - 상수
		String name ="Hong";			// instance 변수
		int kor = 80 ;						// instance 변수
		static int eng = 80;				// static 변수
		final int MATH = 100;			// instance 상수
		static final int COM = 100;	// static 상수
		
		// [접근제한][메소드종류] 반환형 메소드이름([인자들]){ 실행문들 }
		// 메소드는 기본적으로 instance와 static으로만 나누어짐
		public void add() {
			kor = kor + 10;			// - final X => 변수
			eng = eng + 10;			// - final X => 변수
			//MATH = MATH + 10;	// - final O => 상수(값 변경X)
			//COM = COM + 10;		// - final O => 상수(값 변경X)
		}
}
