package com.ict.edu3;

// 예외처리 : Exception => try ~ catch ~
//              목적 : 비정상적인 종료를 정상적인 종료로 유도하고, 예외발생시 예외에 대한 처리를 해준다.
//				형식 : 
//				try{
//						예외 발생 가능한 문장 ;
//						예외가 발생되면 예외 발생 시점 아랭에 존재하는 문장들을 무시하고 바로 catch문으로 이동한다.;
//						예외 발생 가능한 문장 ;
//						예외 발생 가능한 문장 ;
//				}catch(예외발생  e){
//						예외 발생시 처리하는 문장;
//				}

public class Ex01 {
	public static void main(String[] args) {
		try {
			int[] var = { 10, 20, 30 };
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			System.out.println("예외발생" + e);
		}
		
		System.out.println("수고 하셨습니다.");
	}
}
