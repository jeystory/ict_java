class Ex15{
	public static void main(String[] args){
		// 삼항연산자 예제
		//int k1가 홀수 인지 짝수인지 판별
		int k1 = 8;
		String res = k1%2 == 1 ? "홀수" : "짝수";
		System.out.println(k1 + "는 " + res);

		//int k2의 점수가 60점 이상이면 합격
		int k2 = 70;
		res = k2 >= 60 ? "합격": "불합격";
		System.out.println(k2 + "는 " + res);

		// 문자 k3가 대문자인지, 대문자 아닌지 판별하자.
		char k3 = 'P';
		res = (k3 >= 'A' && k3 <= 'Z') ? "대문자":"대문자 아님";
		System.out.println(k3 + "는 " + res);
	
		// int k4가 1 또는 3이면 남성, 아니면 여성
		int k4 = 1;
		res = ((k4 == 1) || (k4 == 3)) ? "남성" : "여성";
		System.out.println(k4 + "는 " + res);

		// 근무시간이 8시간까지는 8350원. 8시간 초과하면 초과한 시간부터 1.5배
		// 근무한 시간 10시간. 얼마를 받아야 하나
		int time = 10, wage = 8350;
	
		int int_res = (time > 8) ? (int)((time - 8)* wage* 1.5) + 8 *wage : time*wage;
		System.out.println(time + "시간은 " + int_res + "원입니다.");
	 		
	}
}