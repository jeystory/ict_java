package com.ict.edu1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1. byte stream(기계 중심) : 모든 처리를 1byte씩 입출력 처리
// 						바이트로 이루어진 모든 파일(영상, 소리, 사진, 문서 등 모든 파일이 가능)
// 						최상위 클래스 : InputStream(입력), OutputStream( 출력)

// FileOutputStream 주요메소드
// write(int b) : int  => ascii code(숫자)  -> 하나의 글자
//						int  대신에 char를 넣어서 사용할 수 있음
//						ASCII code(0~9, a~z, A~Z, 일부 특수문자만 가능)

// write(byte[] b) : int => 1 byte씩 배열에 저장하고 읽을 수 있는 수만큼 반환하기
// flush() : write()후에 반드시 수행
// close() : 오픈된 스트림 닫기 ( finally에서 처리함)
public class Ex04 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test01.txt";
		
		File file = new File(pathName);
		FileOutputStream out = null;
		try {
			out = new  FileOutputStream(file);	// 덮어쓰기
			//out = new  FileOutputStream(file, true);	// 이어쓰기 
			
			//  한글자 쓰기
			out.write(65);	// 대문자 'A'
			out.flush();
			
			// ascii code값 대신에 char를 직접 입력
			out.write('J');	// 대문자 'J'
			out.write('A');	// 대문자 'J'
			out.write('V');	// 대문자 'J'
			out.write('A');	// 대문자 'J'
			out.flush();
			
			// 여러 글자 한번에 쓰기
			byte[] b = {'j', 'a', 'v', 'a', 13, 10, 'b', 'o', 'y'};
			out.write(b);
			out.flush();
			
			////// write(int b), write(byte[] b) :  ascii code만 사용가능 /////////////////
			
			// String class 이용가능 -  비영어권 문자 사용가능
			String msg = "\n Hello \n 안녕 \n 123 \n 大韓";
			byte[] b2 = msg.getBytes();
			out.write(b2);
			out.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(out != null) out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
