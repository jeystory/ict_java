package com.ict.edu;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// API를 보려면 shift + F2
		// java.lang 이외의 클래스는 import해줘야 함
		// 자동 import 방법 : ctrl + shift + O or ctrl + space
		
		// 키보드에 입력한 내용을 scan 변수에 저장
		
		Scanner scan = new Scanner(System.in);
				
		// 들어온 정보가 문자열(String)로 처리할 때 : scan.next(); or scan.nextLine(); 사용가능
		// 한글자라도 char 처리할 수 없기 때문에 -> 들어온 정보를 char 로 처리할 때 : String을 char로 변경해야 된다.
		System.out.print("당신의 이름 : ");
		String name = scan.next();	// 띄워쓰기 하면 안됨 - 띄워쓰기 전에 데이터만 처리가능
		//String name = scan.nextLine();	// 띄워쓰가 가능 - 띄워써도 언터전까지 데이터를 받아서 처리 가능
		System.out.println("당신의 이름 : " + name + "입니다.");
		
		// 들어온 정보를 정수형(int)로 처리할 때 : scan.nextInt();
		// 에러 - 숫자외의 데이터가 들어오면 예외처리 발생
		System.out.print("당신의 나이 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 : " + (age + 1) + "살 입니다.");
		
		System.out.print("당신의 나이 : ");
		String age2 = scan.next();	// 24 를 입력하면
		System.out.println("당신의 나이는 : " + (age2 + 1) + "살 입니다.");	//241 이 출력
		
		// 들어온 정보를 double 로 처리할 때 : scan.nextDouble();
		System.out.print("당신의 키는 : ");
		double height = scan.nextDouble();
		System.out.println("당신의 키는 : " + (height + 1) + " 입니다.");
		
		
		System.out.print("당신의 키는 : ");
		String height2 = scan.next();
		System.out.println("당신의 키는 : " + (height2 + 1) + " 입니다.");
		
		// 들어온 정보를 boolean 로 처리할 때 : scan.nextBoolean();
		System.out.print("당신은 남성입니까 ? (true/false) ");
		boolean gender = scan.nextBoolean();
		System.out.println("당신은 : " + gender + " 입니다.");	
		
		if(gender) {
			System.out.println("당신은 남성입니다.");
		}else {
			System.out.println("당신은 여성입니다.");
		}

		System.out.print("당신은 남성입니까 ? (true/false) ");
		String gender2 = scan.next();
		System.out.println("당신은 : " + gender2 + " 입니다.");		

	}
}
