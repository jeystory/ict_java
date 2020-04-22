package com.ict.edu3;

import java.util.InputMismatchException;
import java.util.Scanner;
// 다중 catch 문 : try{ }의 예외가 하나가 아닐때  사용
// 주의 사항 : Exception 사용할때 반드시 가장 아래쪽 catch문에서 사용 한다.        
public class Ex03 {
	public static void main(String[] args) {
		/*
		try {
			Scanner sc = new Scanner(System.in);
			int var = 50 ;
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해  주세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수가 없습니다.");
		}
		*/
		
		try {
			Scanner sc = new Scanner(System.in);
			int var = 50 ;
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (Exception e) {
			System.out.println("제대로 입력하세요");
		}
		
		System.out.println("수고 하셨습니다.");
	}
}
