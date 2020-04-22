class Ex10{
	public static void main(String[] args){
		// 비교연산자 :  > , >= , < , <= , ==(같다), !=(같지않다)
         	// ** 비교연산자를 할 수 있는 자료형 : char, 정수, 실수
         	// boolean, String은 비교연산자를 하지 않는다.
         	// ** 비교연산자의 결과는 boolean이다. (90% 이상이 조건식에 사용 된다.)
	
		int su1 = 90, su2 = 80;
		boolean res = su1 > su2;
		System.out.println(res);

		char ch1 = 'a', ch2 = 'b';
		res  = ch1 > ch2;
		System.out.println(res);
		
		res = su1 < ch1;		//int와 char
		System.out.println(res);	// true

		res = su1 > 89.9999;		// int와 double
		System.out.println(res);	// true

	
      	}
}