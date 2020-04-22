package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
	public static void main(String[] args) {
		BufferedReader br= null;
		try {
			// 공공데이터를 제공하는 사이트 : https://www.data.go.kr
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			//URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
