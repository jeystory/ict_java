package com.ict.edu2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int( ascii code)  -> char ����ȯ, read(byte[] b)
// FileReader : read():int(uni code) => char ����ȯ, read(char[] ch)
// BufferedReader �߰� : readLine() => ���پ� �б� , �� �̻� ���� ���� ���� �� null

public class Ex04 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test06.txt";
		File file = new File(pathName);
		
	
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
					
			// ���پ� �б�
			//System.out.println(br.readLine());
			
			
			// ��ü �б�
			//String msg;
			//while((msg = br.readLine()) != null ){
			//	System.out.println(msg);
			//}
			

			String msg = "";
			String res = "";
			StringBuilder sb = new StringBuilder();
			while((msg = br.readLine()) != null) {
				// System.out.println(msg);
				// res = res.concat(msg) ;
				sb.append(msg + "\n");
			}
			// System.out.println(res);
			System.out.println(sb.toString());
		
			
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}

