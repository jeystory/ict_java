class Ex02{
	public static void main(String[] args){
		// 숫자 자료형의 크기의 따른 저장원리
		//  byte < short < char < int < long < float < double
		
		// 1. 자기보다 큰 자료향으로 자유롭게 저장할수 있음(자동형변환, promotion)
		double s1;
		s1 = 3.14;
		s1 = 3.14f;
		s1 = 34L;
		s1 = 3212;
		s1 = 'a';

		System.out.println(s1); // 97.0

		// 2. 자기보다 작은 자료형으로 저장할 때는 오류 발생해서 강제형변환이 필요(demotion, casting)
		// 강제형변환이 발생하면 데이터의 손실이 발생할 수 있음.
		// 왼쪽을 기준으로 오른쪽 데이터를 변환 -> (왼쪽 자료형)(데이터)
		byte b1 = (byte)(-129);
		System.out.println(b1);

		float f1 = (float)(432.234);
		System.out.println(f1);

		// 3. char 형변환
		char c1 = 'a' + 2;
		System.out.println(c1);
		
		char c2 = 97 + 2;
		System.out.println(c2);

		// 4. char + int = int    char + long = long
		// ** char + 다른 자료형 ->  결과를 char 형 변수에 저장하는 경우 :  char로 변환되서 문자로 출력가능 char c = 'a' + 2 => 'c'
		char c='a' + 2;
		System.out.println( c);	// c 출력
		// ** char + 다른 자료형 ->  결과를 char 형 변수에 저장하지 않는 경우는 숫자로 처리 : 'a' + 2 -> 99
		System.out.println('a' + 2);	//99 출력
		int k1 = 'a' + 2;
		System.out.println( k1);
		System.out.println( (char)(k1));	
		
		long k2 = c1 + 2L;
		System.out.println(k2);	
		System.out.println((char)(k2));	

		// 5. 수의 연산 : 작은 크기의 자료형 데이터와 큰 크기의 자료형 데이터를 연산하면 큰 크기의 데이터로 변환
		// 예외) byte, short를 연산하면 무조건 int 이상의 자료형으로 변환
		double res1 = 240 + 3.14;
		float res2 = 230 + 3.14f;
		
		byte n1 = 24, n2 = 30;
		short n3 = 70, n4 = 50;
		
		int result = n1 + n2;	// int = byte + byte
		result = n3 + n4;	// int = short + short
		result = n1 + n3;	// int = byte + short (or short + byte) 

		// 소수점 첫째짜리까지만 구하기
		double res3 = 83.5555;
		int res4 = (int)(res3 * 10);
		System.out.println(res4);
		//double res5 = res4 / 10; 	//83 <=  int/int = int
		double res5 = res4 / 10.0;	//83.5 <= int/double = double
		System.out.println(res5);
		
		// 십의 자리까지만 구하기(일의 자리 버림)
		int res6 = 17895;
		res6 = res6 / 10;	//1789
		res6 = res6 * 10;	//17890
		System.out.println(res6);
		
	}
}