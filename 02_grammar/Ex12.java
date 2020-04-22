class Ex12{
	public static void main(String[] args){
		/*
		논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
		논리연산자의 대상은 boolean형, 반환값도 boolean형
		논리연산자의 대상은 비교연산자, 논리연산자, boolean형
		
		논리 연산자 : || (or, 논리합, 합집합)
		- 주어진 조건들이 모두 거짓(false)일때만 결과 거짓(false)
		- 주어진 조건들이면 하나라도 참(true)이면 결과는 참(true)	
		- true를 만나면 뒤에 조건식은 연산하지 않고 결과는 참(true) 
		
		*/

		int su1 = 10, su2= 7;

		boolean b1 = (su1 >= 7) || (su2 >= 5);	// t = t || t
		System.out.println(b1);

		b1 = (su1 <= 7) || (su2 >= 5);	// t= f || t
		System.out.println(b1);

		b1 = (su1 >= 7) || (su2 <= 5);	// t = t || f
		System.out.println(b1);

		b1 = (su1 <= 7) || (su2 <= 5);	// f = f || f
		System.out.println(b1);
		System.out.println("=========================");

		su1 = 10;
		su2 = 7;
		boolean res = ((su1 += 2) > su2) || (su1 == (su2 += 5));
		System.out.println("res = " + res);	// true
		System.out.println("su1 = " + su1);	//12
		System.out.println("su2 = " + su2);	//7	
		System.out.println("=========================");

		// !(NOT,논리부정)
		// 주어진 논리값을 반대로 표현 : true(in) -> false(out), false -> true 로 변경
		res = true;
		System.out.println("result   : " + res);	// true
		System.out.println("!result  : " + !res);	// false
		System.out.println("!!result : " + !!res);	// true
	}
}