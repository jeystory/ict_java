class Ex14{
	public static void main(String[] args){
		/*
		
		삼항연산자 : 조건연산자
		조건이 주어지고 조건이 참일 경우와 거짓을 경우를 각각 별도의 실행 문장을 만들어 결과를 저장하는 연산자
		형식 : 자료형 변수명 = 조건식? 참일 때 실행문장 : 거짓일 때 실행 문장;
		조건식은 boolean형( t or f) , 비교연산자, 논리연산자 사용가능
		** 저장 변수와 참, 거짓일 때 실행 문장의 결과는 반드시 같은 자료형이어야 한다.
		
		*/

		String res = true ? "합격" : "불합격";
		System.out.println("result " + res );	//합격

		res = false ? "합격" : "불합격";
		System.out.println("result " + res );	//불합격

		//res = true ? "합격" : 10; // 에러 - res, "합격", 10의 자료형이 달라서. 결과가 true라도 셋은 자료형이 같아야 함
		//res = true? "합격" : ;	// 에러 - false를 안써도 에러. 

		// char는 int보다 작은 자료형이므로 int 에 저장 가능.
		int result = true ? 'A':'B';
		System.out.println("result " + result );
		
		// 큰자료형 = 작은자료형
		double b1= true ? 14  :3.14;
		System.out.println("result " + b1);		
	}
}