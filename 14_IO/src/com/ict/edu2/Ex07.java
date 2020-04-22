package com.ict.edu2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//  InputStreamReader : 바이트 입력 스트림을 문자입력 스트림
//  InputStream => InputStreamReader => Reader => BufferedReader
// 기계(키보드)를 통해서 입력된 정보를 사람이 편하게 사용하기 위함

//OutputStreamReader : 바이트 출력 스트림을 문자 출력 스트림
//OutputStream => OutputStreamReader => Writer => BufferedWriter

public class Ex07 {
	public static void main(String[] args) {

		InputStreamReader isr = null;
		BufferedReader br = null;

		OutputStreamWriter osw = null;
		BufferedWriter bw = null;

		try {
			// System.out.print("원하는 문자 : ");
			// 원하는 내용을 모니터에 출력하라(System.out)
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("원하는 문자 : ");
			bw.flush();

			// 키보드를 통해 들어온 정보를 받자(System.in)
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();

			// System.out.println("스캐너 대신 사용하여 받은 문자 : " + msg);
			bw.write("스캐너 대신 사용하여 받은 문자 : " + msg);
			bw.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (isr != null)
					isr.close();
				if (osw != null)
					osw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
