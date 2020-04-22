class Ex08{
	public static void main(String[] args){
		/*
		숫자 : 정수형(소수점 X), 실수형(소수점 O)
		-  정수형 : byte < short < int(기본) < long
		-  실수형 : float < double(기본)
		
		- 일반적인 정수는 int
		- long : int보다 더 넓은 범위를 가지고 있음
			숫자뒤에 L또눈  l을 붙임. 생략 가능
		*/

		int k1 = 128;	// byte 초과
		System.out.println(k1);
		
		k1 = 32768;	// short 초과
		System.out.println(k1);
		
		// long : int보다 더 넓은 범위를 가지고 있음
		// 	숫자뒤에 L또눈  l을 붙임. 생략 가능
		long k2 = 128L;
		System.out.println(k2);

		k2 = 32768l;
		System.out.println(k2);

		k2 = 127;
		System.out.println(k2);	
		
		//k2 = 127.0;
		//System.out.println(k2);	
	}

}