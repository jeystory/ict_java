class Ex01{
	public static void main(String[] args){
		/*
		숫자 : 정수형(소수점 X) < 실수형(소수점 O)
		-  정수형 : byte < short < int(기본) < long
		-  실수형 : float < double(기본)
		*/
		
		// float - 숫자뒤에 반드시 f or F 붙인다. 생략하면 에러발생
		float su1 = 3.14f;
		System.out.println(su1);

		//su1 = 3.14;	// error - f or F가 빠지면 실수는 double로 처리됨
		
		// double
		double su2 = 3.14;
		System.out.println(su2);

		su2 = 254.0f;
		System.out.println(su2);
	}
}