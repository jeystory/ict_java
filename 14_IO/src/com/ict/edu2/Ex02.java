package com.ict.edu2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//2. 문자 스트림 (사람중심): 모든 처리를 2byte씩 처리 (입력, 출력)
//문자 스트림의 대상 :  세계 모든 언어로 구성된 문서 파일을 입출력하기에 적합
//최상위 클래스 : Reader(입력스트림),  Writer(출력스트림)

//FileOutputSteram  => write(아스키코드), write(byte[] b) : 숫자,대.소문자만 가능
//FileWriter       => 2 byte씩 처리, write(String str) ;
//추가) BufferedWriter => newLine()를 이용해서 줄바꾸기가 가능
public class Ex02 {
	public static void main(String[] args) {
		
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test06.txt";
		File file = new File(pathName);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("123456789\n");
			bw.write("Hello\n");
			bw.write("대한민국");
			bw.newLine();
			bw.write("true");
			bw.newLine();
			bw.write("大韓");
			bw.flush();
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(bw != null) fw.close();
				if(fw != null) fw.close();
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}
