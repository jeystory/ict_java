class Ex13{
	public static void main(String[] args){
		/*
		대입연산자 : 특정값이나 객체의 주소를 변수에 기억 시킬 때 사용(저장)
		=, +=, -=, *=, /=, %=

		*/

		int su = 10;	// 데이터 10을 su라는 변수에 기억(저장, 대입)
		System.out.println("su :  " + su);
		su += 10;	// su = su + 10
		System.out.println("su + 10 = " + su);

		su -= 10;	// su = su - 10
		System.out.println("su - 10 = " + su);

		su *= 10;	// su = su * 10
		System.out.println("su * 10 = " + su);

		su /= 10;	// su = su / 10
		System.out.println("su / 10 = " + su);

		su %= 10;	// su = su % 10
		System.out.println("su % 10 = " + su);
		System.out.println();		
	}
}