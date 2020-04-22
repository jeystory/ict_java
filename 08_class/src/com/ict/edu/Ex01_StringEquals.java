package com.ict.edu;

public class Ex01_StringEquals {
	public static void main(String[] args) {
		String s1 = "ICT 인재개발원";
		String s2 = "ICT 인재개발원";
		
		// 같다
		// '==' 의 의미는 기본 자료형인 경우는 '데이터가 같냐?'의 의미가 있다.
		// String 객체인 경우는 '주소가 같냐?' 의 의미가 있다.
		// 기본 자료형처럼 String 객체를 만들때 데이터 내용이 같으면 같은 데이터 공간의 데이터를 함께 사용한다.
		// String에서는 데이터가 같다는 의미로 '==' 를 사용하지 않는다.
		
		if(s1 == s2)	System.out.println("같다");	//같다
		else				System.out.println("다르다");
		
		String s3 = new String("ICT 인재개발원");
		if(s1 == s3)	System.out.println("같다");
		else				System.out.println("다르다");	// 다르다
		
		if(s2 == s3)	System.out.println("같다");
		else				System.out.println("다르다");	// 다르다
		
		// String 에서 '내용이 같냐?'는 equals, equalsIgnoreCase를 사용
		
		if(s1.equals(s2))	System.out.println("같다");	//같다
		else				System.out.println("다르다");
		
		if(s1.equals(s3))	System.out.println("같다");
		else				System.out.println("다르다");	// 다르다
		
		if(s2.equals(s3))	System.out.println("같다");
		else				System.out.println("다르다");	// 다르다
		
		
	}
	
}
