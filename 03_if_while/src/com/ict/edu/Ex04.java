package com.ict.edu;

public class Ex04 {
	/* switch ~ case 문 : if문과 같은 분기문이다.
	if문의 조건식이 boolean, 논리연산, 비교연산, 범위일 때 사용하기 좋음
	switch문은 주어진 데이터가 byte, short, int, char, String
	switch(인자값=조건값){
		case 조건값 1: 
			수행문(인자값과 조건값 1이 같을 때); 
			break;
		case 조건값 2: 
			수행문(인자값과 조건값 2이 같을 때); 
			break;
		case 조건값 3: 
			수행문(인자값과 조건값 3이 같을 때); 
			수행문(인자값과 조건값 3이 같을 때); 
			수행문(인자값과 조건값 3이 같을 때); 
			break;
		default:
			수행문;	// 조건값 1,2,3 이 모두 인자값과 같지 않을 떄 default 수행문 실행
			[break;]	// 생략가능. 어차피 switch 문이 끝나기 때문에 수행에 아무런 변화가 없음
	}
	     **** 주의사항 : break문을 만나면 switch 문을 탈출한다. 
			만약에 없으면 다음 break문을 만날때 까지 이후 모든 수행문들을 실행한다.
	 */
	public static void main(String[] args) {
		// char k3이 A또는 a이면 Africa, B또는 b이면 Brazil, C또는 c이면 Canada, 나머지는 Korea 출력하는 프로그램
		// break가 없을 때 생기는 현상
		char k1 = 'B';

		switch (k1) {
			case 'A':
				System.out.println("아프리카");
			case 'B':
				System.out.println("브라질");
			case 'C':
				System.out.println("캐나다");
			default:
				System.out.println("대한민국");
		}
		System.out.println("====================");

		String str = "";
		switch (k1) {
			case 'A':
				str = "아프리카";
			case 'B':
				str = "브라질";
			case 'C':
				str = "캐나다";
			default:
				str = "대한민국";
		}
		System.out.println(str);
		System.out.println("====================");

		str = "";
		switch (k1) {
			case 'A':
				str = "아프리카";
				break;
			case 'B':
				str = "브라질";
				break;
			case 'C':
				str = "캐나다";
				break;
			default:
				str = "대한민국";
		}
		System.out.println(str);
		System.out.println("====================");

		// char k3이 A또는 a이면 Africa, B또는 b이면 Brazil, C또는 c이면 Canada, 나머지는 Korea 출력하는 프로그램
		str = "";
		switch (k1) {
			case 'A':
			case 'a':
				str = "아프리카";
				break;
			case 'B':
			case 'b':
				str = "브라질";
				break;
			case 'C':
			case 'c':
				str = "캐나다";
				break;
			default:
				str = "대한민국";
		}
		System.out.println(str);
		System.out.println("====================");
		
		// char k2가 1또는 3이면 , 2또는 4이면 여자 , 나머지는 외국인
		char k2 = 5;
		str = "";
		switch (k2) {
		case 1:
		case 3:
			str = "남자";
			break;
		case 2:
		case 4:
			str = "여자";
			break;
		default:
			str = "외국인";
			break;
		}
		System.out.println(str);
		System.out.println("====================");
		
		// 나라이름 도시 출력하기 한국-서울, 중국 - 북경, 미국-워싱턴 DC, 캐나다 - 오타와 		
		String country = "캐나다";
		str = "";
		switch (country) {
		case "한국":
			str = "서울";
			break;
		case "중국":
			str = "북경";
			break;
		case "캐나다":
			str = "오타와";
			break;
		case "미국":
			str = "워싱턴 DC";
			break;
		default:
			str = "리스트에 없는 나라입니다.";
			break;
		}
		System.out.println("입력한 " + country + "의 수도는 " + str );
		System.out.println("====================");
	}
}
