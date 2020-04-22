package com.ict.edu2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// FileInputStream : read():int( ascii code)  -> char 형변환, read(byte[] b)
// FileReader : read():int(uni code) => char 형변환, read(char[] ch)
// BufferedReader 추가 : readLine() => 한줄씩 읽기 , 더 이상 읽을 것이 없을 때 null

public class Ex04 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test06.txt";
		File file = new File(pathName);
		
	
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
					
			// 한줄씩 읽기
			//System.out.println(br.readLine());
			
			
			// 전체 읽기
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

