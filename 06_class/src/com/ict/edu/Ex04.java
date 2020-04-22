package com.ict.edu;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// 난수 발생 방법
		// 1. 객체를 만들어서 난수 발생
		Random ran = new Random();

		// 실행할 때마다 무작위 정수범위의 숫자 출력
		int num = ran.nextInt();
		System.out.println(num);
		System.out.println("================");

		// 실행할때마다 0~4까지의 정수값
		num = ran.nextInt(5); // 0~4
		System.out.println(num);
		System.out.println("================");

		// 2. 객체를 만들지 않고 난수 발생
		// 정해지지 않은 0.0 ~ less than 1.0 실수값
		double dNum = Math.random();
		System.out.println(dNum);

		// 무조건 0 나옴
		int k2 = (int) (Math.random());
		System.out.println(k2);

		int k3 = (int) (Math.random() * 5);
		System.out.println(k3);
	}
}
