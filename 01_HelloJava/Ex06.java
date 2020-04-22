class Ex06{
	public static void main(String[] args){
		/*
		숫자 : 정수형(소수점 X), 실수형(소수점 O)
		-  정수형 : byte < short < int(기본) < long
		-  실수형 : float < double(기본)

		- byte : 정수형이면서 가장 작은 범위 -128~127 의 값만 저장
		*/

		byte b1 = -128;
		System.out.println(b1);
		
		b1 = 127;
		System.out.println(b1);
		
		//byte범위를 벗어나서 오류 -128~127
		//b1 = -129;	// conversion error(int -> byte) : byte는 -128~127
		//b1 = 128;	// conversion error(int -> byte) : byte는 -128~127
		System.out.println(b1);

		//b1 = 120+10;	// 계산식은 결과를 저장. 결과값이 byte범위를 벗어났기 때문에
		System.out.println(b1);
	}

}