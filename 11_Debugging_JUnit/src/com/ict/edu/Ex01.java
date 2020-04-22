package com.ict.edu;

// 디버깅 : 논리적인 오류를 잡기 위해서 실행하는 행위, 해당 변수값을 조사, 알아서 수정하지 못함.
// breakpoint(중단점)	: 디버깅 실행시 자동으로 실행이 중단되어 해당 변수값을 조사할 수 있는 특정 지점을 말함. 
//								마우스 더블클릭으로 설정
// 디버깅 모드에서 사용하는 제어키 :  F11 -> 디버깅 실행
// 											  F8 -> breakpoint에서 다음 break point 까지 실행
//											  F5 -> 한줄 씩 실행, 메소드를 만나면 메소드 안으로 진입
//											  F6 -> 한줄 씩 실행, 메소드를 만나면 메소드 안으로 진입하지 않음
public class Ex01 {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < 11; i++) {
			total += i;
			System.out.println("1부터 " + i + "까지의 합은 " + total);
		}
		System.out.println("합 " + total);
		
	}
}
