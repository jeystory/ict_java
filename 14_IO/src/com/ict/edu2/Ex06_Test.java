package com.ict.edu2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex06_Test {
	public static void main(String[] args) {
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 입력");
			bw.flush();
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			
			System.out.println(br.readLine());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
