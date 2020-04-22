package com.ict.edu1;

import java.io.File;
import java.io.FileInputStream;


//1. byte stream(기계 중심) : 모든 처리를 1byte씩 입출력 처리
//	바이트로 이루어진 모든 파일(영상, 소리, 사진, 문서 등 모든 파일이 가능)
//	최상위 클래스 : InputStream(입력), OutputStream( 출력)

//FileInputStream 주요메소드
//	- read() : int  => ascii code(숫자)  -> 하나의 글자 반환 : 한글자를 읽어오는 메소드
//				더 이상 읽을 수 없을 때 -1 반환 
//         		비영어권 문자를 읽을 수 없음 => ASCII code(0~9, a~z, A~Z, 일부 특수문자만 가능)
//				문자로 보기 위해서는 char 형변환이 필요


// - read(byte[] b) : int => 1 byte씩 배열에 저장하고 읽을 수 있는 수만큼 반환하기
// 										** 크기 지정을 해야한다.

// - close() : 입력 스트림 닫아주기


public class Ex06 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test02.txt";
		File file = new File(pathName);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			//int k = fis.read();
			//System.out.println(k + "," + (char)(k));
			// 13 - (CR)carriage return, 10 : (LF) line feed
			
			// 전체 글자 읽어오기
			// 그림, 영상, 사진, 복사, 잘라내기 붙이기에 사용
			
			// read()
			int k = 0;
			/*
			while(true) {
				k = fis.read();
				if(k ==  -1)	break;
				System.out.println(k + "," + (char)(k));
			}
			*/
			/*
			while((k = fis.read()) != -1) {
				System.out.println(k + "," + (char)(k));
			}
			*/
			
			// read(byte[] b) : int 
			// 배열의 크기는 파일의 크기(length)만큼
			byte[] b = new byte[(byte)(file.length())];
			// 파일의 내용이 byte 배열 b에 저장
			fis.read(b);
			
			for (byte c : b) {
				System.out.println(c + " : " + (char)c);
			}
			System.out.println("=======");
			
			
			//String class 이용하면 비영어권 코드 사용가능
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		
		} finally {
			try {
				if(fis != null)	fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
