class Ex03{
	public static void main(String[] args){
		// 참조자료형 : 클래스를 자료형으로 사용
		// String class : 문자열을 처리하는 기능을 가지고 있는 클래스
		// 		클래스이지만 기본 자료형처럼 사용할 수 있음
		//        	반드시 "" 사용해서 문자열을 감싸줘야함.
		String str = "hello";
		System.out.println(str);
		int su = 24;
		System.out.println(su);

		// String 연산 : + 가능(뎃셈기능이 아니라 문자연결자) but -, *, / 불가능 	
		//             + 의 결과는 무조건 String 이다.
     		
		str = "1000";
		su = 1000;
		System.out.println(str + 100);
		System.out.println(su + 100);
		
		int su1 = 20, su2 = 4;
		int res = su1 + su2;
		System.out.println(su1 + su2);	//24
		System.out.println("결과는" + su1 + su2); // 결과는 204  "결과는" + 20 -> "결과는20" + 4 => "결과는204" 순서대로 처리
		System.out.println("결과는" + (su1 + su2));
		System.out.println("결과는" + res);	// 추천 방식
	}
}