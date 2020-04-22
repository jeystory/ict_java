package com.ict.edu;

public class Ex13_StringEx {
	public static void main(String[] args) {
		// String class 주요 메소드(기능)

		// 1.String 클래스 생성 방법
		String str1 = "Korea";
		char ch1[] = { '서', '울' };
		String str2 = new String(ch1);
		String str3 = new String("Korea");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// 결과는 다르다 - String '==' 사용하지 않는다.
		//  String 또는 객체에서 '==' 변수의 주소값이 같으냐고 묻는것이다. 
		// 객체에 저장되는 값은 데이터값이 아니라 주소가 들어가기 때문
		if(str1 == str3)		System.out.println("같다");
		else 						System.out.println("다르다");
		
	
		// 2.주요 메소드
// 1) charAt(int index) : char
		// - int index는 정수이며, 의미는 배열의 위치값, 0부터 ~ length -1
		// - char : 반환형 - 메소드가 시행 후 결과의 자료형을 의
		// - charAt : 위치값을 받아서 해당 위치의 존재하는 문자를 추출하여 반환.
		String msg = "대한민국 ♥ Korea";

		char ch = msg.charAt(3);
		System.out.println(ch);

		ch = msg.charAt(7);
		System.out.println(ch);
		
// 2) length() : int
		// - 해당 문자열의 길이를 정수값으로 반환.
		int res = msg.length();
		System.out.println(res);
		
		System.out.println("++++++++++++++++++++++++++++++");
		// 배열의 길이 : length
		// String의 길이 : length()
		// msg 내용을 하나씩 추출하자
		for (int i = 0; i < msg.length(); i++) {
			System.out.print(msg.charAt(i) + " ");
		}
				
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		// 메시지의 내용중 소문자만 추출하자
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')
				System.out.print(msg.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		// 메시지의 내용중 소문자를 대문자
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')
				System.out.print((char) (msg.charAt(i) - 32) + " ");
			else {
				System.out.print(msg.charAt(i) + " ");
			}
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		// 대문자, 소문자를 제외한 문자만 출력
		for (int i = 0; i < msg.length(); i++) {
			if ((msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') || (msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z'))
				continue;
			else
				System.out.print(msg.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
	
// 3) concat(String str) : String
		// - 해당 문자열에 인자로 받은 문자열을 추가하는 것
		// - 문자연결자(+)와 같은 효과
		msg = "대한민국";
		String msg2 = msg.concat(" KOREA");
		System.out.println(msg2);
		System.out.println("+++++++++++++++++++++++++++++++++++");

		String msg3 = msg + " korea";
		System.out.println(msg3);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
// 4) contains(CharSequence s) : boolean
		// - CharSequence s -> String으로 생각
		// - 해당 문자열에 인자로 들어온 문자열이 존재하면 true 아니면 false
		// - 대소문자 구분
		msg = "KOREA @ 대한민국";
		// boolean result = msg.contains('Q'); Error -> char를 인자로 사용할 수 없다
		boolean result = msg.contains("Q");	//false
		System.out.println(result);
		
		result = msg.contains("@");		//true
		System.out.println(result);
		
		result = msg.contains("대한민"); // true
		System.out.println(result);
		
		result = msg.contains("rea"); 	// false -> 대소문자 구분
		System.out.println(result);	
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		// 5) equals(String str) : boolean
		// - 해당 문자열이 인자로 들어온 문자열과 같으면 true, 대소문자를 구별
		// - 문자열은 '==' 를 사용할 수 없음. 그 대신으로 equals를 사용

		// 6) equalsIgnoreCase(String str) : boolean
		// 해당 문자열이 인자로 들어온 문자열과 같으면 true, 대소문자 구별하지 않음.
		// ***** equals와 equalsIgnoreCase은 string이 일치하는지 확인
		// '==' 은 숫자나 char에 사용. 문자열에는 사용할 수 없음

		msg = "korea";
		msg2 = "KOREA";
		msg3 = "Korea";
		System.out.println(msg.equals(msg2));					// false
		System.out.println(msg.equals("korea"));					// true
		System.out.println(msg.equalsIgnoreCase(msg2));	// true
		
// 7) toLowerCase() : String
		// 해당문자열을 소문자로 변경
		msg = "java8 Javascript 자바8 자바스크립트 JSP";
		System.out.println(msg.toLowerCase());	//java8 javascript 자바8 자바스크립트 jsp

// 8) toUpperCase() : String
		// 해당문자열을 데문자로 변경
		System.out.println(msg.toUpperCase());	//JAVA8 JAVASCRIPT 자바8 자바스크립트 JSP

		System.out.println(msg2.equals("korea".toUpperCase()));	//true
		
// 9-1) indexOf(int ch) 							: int -> 처음부터 검색해서 인자로 들어온 char 또는 숫자의 위치값을 반환
		// indexOf(String str)					: int -> 처음부터 검색해서 인자로 들어온 문자열의 위치값을 반환
		// - int ch는 char로 취급.
		//  - 해당 문자열에 들어오는 문자나 문자열에 처음 위치값을 숫자로 표현
		// 	공통 :  문자나 문자열이 존재하지 않으면 -1을 반환

		msg = "java, jsp, android";
		res = msg.indexOf('a');	// index -> 1
		System.out.println(res);
		res = msg.indexOf("av");	// index -> 1
		System.out.println(res);
		res = msg.indexOf("a");	// index -> 1
		System.out.println(res);
		res = msg.indexOf(97);
		System.out.println(res);
		res = msg.indexOf("k");	// -1
		System.out.println(res);
		
		
// 9-2 indexOf(int ch, int fromIndex) : int
		// indexOf(String str, int fromIndex) : int
		// - fromIndex는 시작위치.
		// - fromIndex로 설정된 시작위치부터 해당 문자열에 들어오는 문자나 문자열에 처음 위치값을 숫자로 표현
		// - ** 두번째, 세번째 문자나 문자열의 위치값을 찾을 때 사용
		res = msg.indexOf('a', 2);
		System.out.println(res);
		res = msg.indexOf('a', msg.indexOf('a') + 1);
		System.out.println(res);
		
		res = msg.indexOf('a' , msg.indexOf('a', res ) + 1);
		System.out.println(res);

// 10) lastIndexOf(int ch) : int
		// lastIndexof(String str) : int
		// 해당 문자열에서 인자로 들어온 문자의 마지막 위치를 반환.
		res = msg.lastIndexOf('a');
		System.out.println(res);

// 11) isEmpty() : boolean
		// 해당 문자열이 비어 있으면 true, 없으면 false
		msg = "java JAVA 자바";
		System.out.println(msg.isEmpty());	//false

		msg = "";
		System.out.println(msg.isEmpty());	//true
		
		//msg = null;			//예외 발생  NullPointerException
		//boolean b = msg.isEmpty();

// 12) replace(char oldChar, char newChar) : String
		// replace(String oldString, String newString) : String
		// 해당 문자를 다른 문자로 변경(치환)
		System.out.println("replace()===========================");
		msg = "대한민국";
		String msg4 = msg.replace("대한민국", "KOREA");	// KOREA
		System.out.println(msg4);
		String msg5 = msg4.replace('O', 'o');					// KoREA
		System.out.println(msg5);
		String msg6 = msg.replace(msg, msg + " 파이팅");	// 대만민국 파이팅
		System.out.println(msg6);		
		
// 13) substring(int beginIndex) : String
		// - 해당 문자열의 시작위치부터 끝까지 문자열 반환(추출)
		// substring(int beginIndex, int endIndex) : String
		// - 해당 문자열의 시작위치부터 끝위치전까지 문자열 반환(추출), 끝 위치를 포함하지 않음을 주의.
		System.out.println("subString()===========================");
		msg = "010-7777-9999";
		String msg7 = msg.substring(4);	//7777-9999
		System.out.println(msg7);

		String msg8 = msg.substring(4, 8); // 8(뒷자리)-4(앞자리) = 4개의 문자가 출력된다.	
		System.out.println(msg8);	//7777

		msg = "770707-1";
		String msg9 = msg.substring(0, 2); // 2-0=2
		System.out.println(msg9);	//77
	
		msg9 = msg.substring(7,8); 
		System.out.println(msg9);	//1
	
		// 문자 하나씩 추출하기
		for(int i=0;i<msg.length();i++) {
			msg9 = msg.substring(i, i+1);
			System.out.println(msg9);
		}
		
// 14) toString()
		// Object(객체) : 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		// String에서의 toString() :  문자열 자체를 반환. (객체 자기자신을 호출)
		msg = "Java Version 8";
		System.out.println(msg);
		System.out.println(msg.toString());
		System.out.println("========================");

// 15) trim() : String
		// - 해당 문자열의 앞뒤에 필요없는 공백문자 제거
		msg = "   java Java test      ";
		System.out.println(msg + " : " + msg.length());
		msg = msg.trim();
		System.out.println(msg + " : " + msg.length());
		System.out.println("========================");
		
// 16) valueOf(기본자료형) : String
		// - 각종 기본 자료형을 받아서 문자열(String)로 변경시킴
		boolean b1 = true;
		char c1 = 'A';
		int n1 = 34;
		long n2 = 56L;
		float n3 = 3.14f;
		double n4 = 13.410;

		// System.out.println(b1+10); //연산불가
		System.out.println(c1 + 10 + ":" + (int) (c1 + 10));
		System.out.println(n1 + 10);
		System.out.println(n2 + 10);
		System.out.println(n3 + 10);
		System.out.println(n4 + 10);
		System.out.println("========================");

		System.out.println(String.valueOf(b1) + 10); // true10 으로 출력
		System.out.println(String.valueOf(c1) + 10); // A10
		System.out.println(String.valueOf(n1) + 10); // 3410
		System.out.println(String.valueOf(n2) + 10); // 5610
		System.out.println(String.valueOf(n3) + 10); // 3.1410
		System.out.println(String.valueOf(n4) + 10); // 13.41910
		
		System.out.println(b1 + "10" ); // valueOf와 같은 기능을 하지만 메모리에 부담이 생겨서 추천하지 않음
		System.out.println(c1 + "10" );
		System.out.println(n1 + "10" );
		System.out.println(n2 + "10" );
		System.out.println(n3 + "10" );
		System.out.println(n4 + "10" );	//	System.out.println(n4 + "" + 10);	 이렇게 해도 됨

// 17) Wrapper class  : 기본 자료형을 객체로 만들때 사용하는 클래스(자동으로 변환됨)
		// 							-> 기본 자료형 형태로 이루어진 문자를 진짜 자료형으로 변경하는 클래스

		//17-1) boolean형 : Boolean.parseBoolean();
		String op1 = "true";
		boolean r_op1 = Boolean.parseBoolean(op1);
		if (r_op1) {
			System.out.println(r_op1);
		}
		System.out.println("========================");

		// 17-2) int 형 : Integer.parseInt();
		String op2 = "127";
		System.out.println(op2 + 10);

		int r_op2 = Integer.parseInt(op2);
		System.out.println(r_op2 + 10);

		// 17-3) long형 : Long.parseLong();
		String op3 = "1234L";
		System.out.println(op3 + 10);
		// long r_op3 = Long.parseLong(op3); // 에러발생 - 1234L 'L'이 붙어서 숫자로 만들어 줄수 없어서.
		// System.out.println(r_op3+10);

		// 17-4) double형 : Double.parseDouble();
		String op4 = "12.7";
		System.out.println(op4 + 10);
		double r_op4 = Double.parseDouble(op4);
		System.out.println(r_op4 + 10);

		// 17-5) char형은 별도의 클래스가 존재하지 않음
		// String 클래스의 CharAt() 사용
		String op5 = "P";
		System.out.println(op5 + 5);

		char r_op5 = op5.charAt(0);
		System.out.println((char) (r_op5 + 5));
		

		// 18) getBytes() : byte[]
		// 해당문자열을 byte[]로 만들어 줌.(입출력, 네트워크에서 사용됨)
		// byte 자료형이므로 숫자, 영문자 대소문자, 일부 특수문자만 표시 가능(ASCII code이름 127자만 가능)
		// *** 자바입출력(java I/O)할 때 사용
		msg = "java 123456 JAVA";
		byte[] by = msg.getBytes();

		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i] + " : " + (char) (by[i]));
		}
		
		// 19) toCharArray() : char[]
		// - 모든 글자를 char[]로 저장한다.
		// - char 자료형이므로 모든 문자가 사용가능
		// - getByte() ASCII Code만 저장할 수 있음.
		msg = "java2 대한민국 ☆ 大韓 JSP";
		char ch2[] = msg.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
		System.out.println();
		System.out.println("========================");
	
	
		// 14) split(String regex) : String[]
		// 해당 문자열을 인자로 받은 문자열을 기준으로 나누어서 배열에 저장
		msg = "java,jsp,android";
		String[] arr = msg.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// 구분자가 해당 문자열에 없으면 첫번째 배열에 모두 들어간다.
		String[] arr2 = msg.split("/");
		System.out.println(arr2[0]);

//20.   split(String regex) : String[]
		//split(String regex, int limit) : String[]
		// 해당 문자욜을 인자로 받은 문자열 기준으로 나누어서 배열에 넣어준다
		//  regex : 구분자를 뜻한다.
		// - int limit: 배열의 크기를 지정
		System.out.println("==split ==================");
		msg = "java,jsp,spring, android,python";
		String[] arr3 = msg.split(",");

		for (int i = 0; i < arr3.length; i++)
			System.out.println(arr3[i]);
		System.out.println("========================");
		
		String[] arr4 = msg.split(" ");
		for (int i = 0; i < arr4.length; i++)
			System.out.println(arr4[i]);
		System.out.println("========================");

		String[] arr5 = msg.split(",", 2);
		for (int i = 0; i < arr5.length; i++)
			System.out.println(arr5[i]);
		System.out.println("========================");

		String[] arr6 = msg.split(",", 3);
		for (int i = 0; i < arr6.length; i++)
			System.out.println(arr6[i]);
		System.out.println("========================");
		
		arr6 = msg.split(",", 6); // 초과하면 안 만들어진다.
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
	
		System.out.println("=======");
		//System.out.println(arr[5]);	//  초과하면 안 만들어진다.
		System.out.println("=======");
		msg = "010-9393-7777";
		arr[1] = "*****";
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
		System.out.println("========================");

		System.out.print(arr[0] + "-" + arr[1] + "-" + arr[2]);
		System.out.println();
		System.out.println("========================");
		
	}
}
