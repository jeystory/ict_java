class Ex04{

	public static void main(String[] args){
		/* 변수와 상수 : 데이터를 저장할 수 있는 기억공간
		   변수 : 데이터를 저장할 수 있는 기억 공간, 데이터를 변경해서 저장할 수 있다.
		   상수 : 데이터를 저장할 수 있는 기억 공간, 데이터를 변경할 수 없다. 
		
		   자료를 데이터에 저장하기
		   1.선언 : 자료형 이름;
		   2.저장 : 이름 = 데이터;
		                or
		   1과 2를 한번에 => 선언과  저장을 한번에 : 자료형 이름 = 데이터; 
		
   		   논리형 데이터를 저장하기
		   - 자바에서 논리형 : 참(true), 거짓(false)
		   - 논리형의 예약어 : boolean

		   논리형 데이터는 '조건식'에서 사용
		   			
		*/
		
		boolean res;
		res = true;
		// 저장된 자료형 호출 => 가지고 있는 데이터가 나옴
		System.out.println(res);

		res = false;
		System.out.println(res);

		//boolean res2 = 10;	// error
		//System.out.println(res2);

	}

}