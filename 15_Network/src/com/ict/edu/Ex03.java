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
			
			System.out.println("����ʵ� ���ڵ� :" + conn.getContentEncoding());
			System.out.println("����ʵ� ���� :" + conn.getContentLength());
			System.out.println("����ʵ� ����Ÿ�� :" + conn.getContentType());
			
			// ���ͳ� ������ ����� �ٵ�� ����
			// ��� ������ �̿��ؼ� �� �������� �ؼ��ϰ� ����
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
