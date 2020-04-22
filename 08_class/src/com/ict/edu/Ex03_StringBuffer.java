package com.ict.edu;

public class Ex03_StringBuffer {
	public static void main(String[] args) {
		// 새로 만들어서 다시 연결
		String s1 = "대한민국";
		s1 = s1 + "Korea";
		
		// 해당 문자열에서 다른 문자열 추가할 때 사용하는 클래스
		// 기존 내용에 계속 추가할 수 있음 - 메모리를 효율적으로 사용
		// StringBuffer
		StringBuffer sb = new StringBuffer("대한민국");
		StringBuilder sb2 = new StringBuilder("대한민국");
		
		// append("추가내용");
		sb.append(" 파이팅");
		sb2.append(" 코리아 파이팅 ");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		//insert(int index, String 들어갈 내용) : 삽입
		sb.insert(5, "★");
		sb2.insert(5, "★");
		System.out.println(sb);
		System.out.println(sb2);
		
		// replace ( 시작위치, 끝위치, 치환내용)
		sb.replace(0, 4, "KOREA");
		sb2.replace(0, 4, "KOREA");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		//delete(시작위치, 끝위치-1)
		sb.delete(6, 7);
		sb2.delete(6, 7);
		System.out.println(sb);
		System.out.println(sb2);
		
		// toString() : StringBuffer, StringBuider를 String으로 변환시켜줌
		// 최종적으로 String 클래스 변경하기 위해서 반드시 실행해 주는 것이 좋다
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
	}
}
