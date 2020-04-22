package com.ict.edu2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//  InputStreamReader : 바이트 입력 스트림을 문자입력 스트림
//  InputStream => InputStreamReader => Reader => BufferedReader
// 기계(키보드)를 통해서 입력된 정보를 사람이 편하게 사용하기 위함

public class Ex06 {
	public static void main(String[] args) {
		System.out.print("원하는 문자 : ");
		//Scanner scan = new Scanner(System.in);
		
		InputStreamReader isr = null;
		BufferedReader br = null;
				
		try {
			isr = new  InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("스캐너 대신 사용하여 받은 문자 " + msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(br != null)		br.close();
				if(isr != null)		isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
