class Ex05{
	public static void main(String[] args){
		// 문자를 변수에 저장
		// 문자 예약어 => char
		// char에 저장되는  데이터는 0-65535의 숫자값
		// 문자형태로 저장하기 위해서는 '한문자'의 형태로 저장 => ex)'A', 'a', '1', '가', '大'

		char k1;	// 선언
		k1 = 'a';	// 저장 - a가 k1에 저장되는 것이 아니라 a에 해당하는 Uni-code값이 저장
		System.out.println(k1);

		char k2 = 97;
		System.out.println(k2);

		char k3 = '\u0042';
		System.out.println(k3);

		char k4 = '\u0062';
		System.out.println(k4);

	}

}