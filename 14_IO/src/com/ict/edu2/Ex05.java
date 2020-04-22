package com.ict.edu2;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

//PrintWriter는 OutputStream, Writer 두 클래스 모두 다 인자로 사용 가능하다.
//print(각종자료형, String, Object), println(각종자료형, String, Object)를 사용해서 출력한다.
//즉, 바이트 출력 스트림,  문자출 력스트림을 모두다 사용 할 수 있다.
public class Ex05 {
	public static void main(String[] args) {
		String pathname 
		// = "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test07.txt";
		= "C:"+File.separator+"study"+File.separator+"util"+ File.separator+"test08.txt";
		File file = new File(pathname);
		
		//FileOutputStream out = null;
		//BufferedOutputStream bos = null;
		//PrintWriter  pw = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		
		
		try {
			//out = new FileOutputStream(file);
			//bos = new BufferedOutputStream(out);
			//pw = new PrintWriter(bos);
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			
			pw.println("PrintWriter를 가지고 연습");
			pw.println(123456);
			pw.println(true);
			pw.println(3.147);
			pw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				//if(pw != null) 	pw.close();
				//if(bos != null)	bos.close();
				//if(out != null)	out.close();
				
				if(pw != null) 	pw.close();
				if(bw != null)	bw.close();
				if(fw != null)		fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
