package com.ict.edu;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// Parsing : 내용을 원하는 형태로 분해하는 과정  
public class Ex05 {
	public static void main(String[] args) {
		BufferedReader br = null;

		// XML 방식
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document document = null;
		try {
			// 공공데이터를 제공하는 사이트 : https://www.data.go.kr
			// URL url = new
			// URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				// System.out.println(msg);
				sb.append(msg + "\n");
			}
			// System.out.println(sb.toString());

			// 파일 읽기
			InputSource is = new InputSource(new StringReader(sb.toString()));
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);

			// 태그 구하기
			NodeList local = document.getElementsByTagName("local");
			StringBuilder  sb2 = new StringBuilder ();
			for (int i = 0; i < local.getLength(); i++) {
				// 태그 텍스트 구하기
				sb2.append(local.item(i).getFirstChild().getNodeValue() + ",    ");

				// 태그 속성 가져오기
				sb2.append(((Element) local.item(i)).getAttribute("desc") + ",   ");
				sb2.append(((Element) local.item(i)).getAttribute("ta") + "\n");
			}
			System.out.println(sb2.toString());

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				br.close();

			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}
