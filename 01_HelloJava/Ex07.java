class Ex07{
	public static void main(String[] args){
		/*
		숫자 : 정수형(소수점 X), 실수형(소수점 O)
		-  정수형 : byte < short < int(기본) < long
		-  실수형 : float < double(기본)

		- short : 정수형.  -32,768~32,767 의 값만 저장
		*/

		short s1 = -32768;
		System.out.println(s1);
		s1 = 32767;
		System.out.println(s1);

		// short 허용 범위 초과
		//s1 = -32769;
		//s1 = 32768;
	}

}