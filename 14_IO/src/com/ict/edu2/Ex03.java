package com.ict.edu2;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int( ascii code)  -> char 형변환, read(byte[] b)
// FileReader : read():int(uni code) => char 형변환, read(char[] ch)
public class Ex03 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test05.txt";
		File file = new File(pathName);
		
		int k=0;
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			//  한글자 읽기
			//k = fr.read();
			//System.out.println(k + ": " + (char)(k));
			
			// 파일 전체 읽기
			/*
			while((k = fr.read()) != -1){
				System.out.println(k + ": " + (char)(k));
			}
			System.out.println("================");
			*/
			/*
			char[] ch = new char[(int)file.length()];
			fr.read(ch);
			for (char c : ch) {
				System.out.print(c);
			}
			*/
			
			char[] ch = new char[(int)file.length()];
			fr.read(ch);
			
			String msg = new String(ch);
			System.out.println(msg);
			
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}
