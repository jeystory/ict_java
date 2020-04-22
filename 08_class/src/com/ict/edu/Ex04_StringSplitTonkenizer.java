package com.ict.edu;

import java.util.StringTokenizer;

public class Ex04_StringSplitTonkenizer {
	public static void main(String[] args) {
		// 문자열 나누기 : String.split(), StringTokenizer 클래스
		// 차이점 :
		//			- String.split() : 결과가 String[] 인데 배열의 크기를 마음대로 나눌 수 있다. for문 사용
		// 			- StringTokenizer :알아서 자동으로 나눈다. 필요없는 것은 자동 삭제(중간에 띄워쓰기한 부분이 모두 삭제). 반환형이 배열이 아님. for문 사용못함. while문 사용
		
		String s1 = "  This  is  a  Test";
		String[] arr1 = s1.split(" ");	//[This][is][a][test]
		int j =0;
		for (String k : arr1) {
			System.out.println(j++ + k);
		}
		System.out.println("===========");
		
		String[] arr2 = s1.split(" ", 2);	//[This][is a test]
		for (String x : arr2) {
			System.out.println(x);
		}
		
		StringTokenizer st1 = new StringTokenizer(s1);
		
		while (st1.hasMoreTokens()) {
			String k1 = st1.nextToken();
			System.out.println("k1 : " + k1);
			
		}
		// st1 내용이 사라진다.
	
		st1 = new StringTokenizer(s1);
			
		System.out.println("===========");
		while (st1.hasMoreElements()) {
			String k1 = (String)st1.nextElement();
			System.out.println("k1 : " + k1);
			
		}
		System.out.println("===========");
		
		// StringTokenizer는 개별적으로 처리는 가능하나 전체 처리하기 위해서는 배열로 만들어서 처리한다.
		s1 = "This is a test";
		StringTokenizer st3 = new StringTokenizer(s1);
		
		String[] arr3 = new String[st3.countTokens()];
		int i =0;
		
		while(st3.hasMoreTokens()) {
			arr3[i++] = st3.nextToken();
		}
		
		for (int k = 0; k < arr3.length; k++) {
			System.out.println(arr3[k]);
		}
	}
}
