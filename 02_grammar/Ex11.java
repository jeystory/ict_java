class Ex11{
	public static void main(String[] args){
		// 논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
		// 논리연산자의 대상은 boolean형, 반환값도 boolean형
		// 논리연산자의 대상은 비교연산자, 논리연산자, boolean형
		
		// &&(AND, 논리곱, 교집합)
		// 주어진 조건들이 모두 참일때만 결과가 참
		// 주어진 조건 중 false를 만나면 false
		// false를 만나면 false 다음의 존재하는 조건의 연산을 하지 않음
		// '변수 >= 숫자 and 변수 <= 숫자' : 변수의 범위를 나타낸다.
		// ex) a>=10 && a<=20 : 10<= a <=20 (a는 10부터 20까지)를 의미

		int su1 = 10, su2= 7;

		boolean b1 = (su1 >= 7) && (su2 >= 5);	// t = t && t
		System.out.println(b1);
		
		b1 = (su1 <= 7) && (su2 >= 5);	// f= f && t
		System.out.println(b1);

		b1 = (su1 >= 7) && (su2 <= 5);	// f = t && f
		System.out.println(b1);

		b1 = (su1 <= 7) && (su2 <= 5);	// f = f && f
		System.out.println(b1);
		System.out.println("=========================");

		su1 = 10;
		su2 = 7;
		boolean res = ((su1 += 2) > su2) && (su1 == (su2 += 5));
		System.out.println("res = " + res);	// true
		System.out.println("su1 = " + su1);	//12
		System.out.println("su2 = " + su2);	//12	
		System.out.println("=========================");

		su1 = 10;
		su2 = 7;
		res = ((su1 += 2) < su2) && (su1 == (su2 += 5));
		System.out.println("res = " + res);	//false
		System.out.println("su1 = " + su1);	//12
		System.out.println("su2 = " + su2);	//7
		System.out.println("=========================");

		// '변수 >= 숫자 and 변수 <= 숫자' : 변수의 범위를 나타낸다.
		// ex) a>=10 && a<=20 : 10<= a <=20 (a는 10부터 20까지)를 의미
		su1 = 13;	
		res = (su1 >= 10) && (su1 <= 15);	// 10<= su1 <= 15
		System.out.println("결과 : " + res);	// true

		su1 = 17;	
		res = (su1 >= 10) && (su1 <= 15);
		System.out.println("결과 : " + res);	// false

		// 다음문자가 소문자인지  아닌지
		char c1 = 'p';
		res = (c1 >= 'a') && (c1 <= 'z');
		System.out.println("결과 : " + res);

		c1 = 'Q';
		res = (c1 >= 'a') && (c1 <= 'z');
		System.out.println("결과 : " + res);

      	}
}