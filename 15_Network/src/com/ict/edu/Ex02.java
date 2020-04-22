package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// URL 클래스(Uniform Resource Locator) : 인터넷에서 접근 가능한 인터넷 주소
//				- final 클래스 이기 때문에 상속 X -> 자식을 만들수 없음
public class Ex02 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("https://www.naver.com");
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getHost());
			System.out.println(url.getUserInfo());
			System.out.println("========");
	
			is =url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			String pathname = "c:/study/util/exam.txt";
			File file = new File(pathname);
	
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				//System.out.println(msg);
				sb = sb.append(msg + "\n");
			}
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				isr.close();
				is.close();
			} catch ( Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
