package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			System.out.println("헤더필드 인코딩 :" + conn.getContentEncoding());
			System.out.println("헤더필드 길이 :" + conn.getContentLength());
			System.out.println("헤더필드 문서타입 :" + conn.getContentType());
			
			// 인터넷 정보는 헤더와 바디로 나눔
			// 헤더 정보를 이용해서 웹 브라우저가 해석하고 실행
			Map<String, List<String>> list = conn.getHeaderFields();
			
			for (String k : list.keySet()) {
				System.out.println(list.get(k));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
