package com.ict.edu2;

import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int( ascii code)  -> char ����ȯ, read(byte[] b)
// FileReader : read():int(uni code) => char ����ȯ, read(char[] ch)
public class Ex03 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test05.txt";
		File file = new File(pathName);
		
		int k=0;
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			//  �ѱ��� �б�
			//k = fr.read();
			//System.out.println(k + ": " + (char)(k));
			
			// ���� ��ü �б�
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
