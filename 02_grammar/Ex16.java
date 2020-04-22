
public class Ex16 {
	public static void main(String[] args) {
		// 중첩 삼항연산자 : 여러개의 삼항연산자를 사용
		// char k1 이 대문자인지, 소문자인지, 기타문자인지.
	
		char k1 = 'p';
		String str = (k1 >= 'A' && k1 <= 'Z') ? "대문자" : (k1 >= 'a' && k1 <= 'z' ? "소문자 " : "기타문자");
		System.out.println("결과는 " + str);
		
		
		// int k2가 1또는 3이면 남자 2또는 4이면 여자 , 나머지는 외국인
		int k2 = 5;
		str = (k2 == 1 || k2 == 3) ? "남자" : ((k2 == 2 || k2 == 4 )? ("여자"):("외국인"));
		System.out.println(str);
		
		//int k3 90이상이면 "A", 80이상이면 "B", 70이상이면 "C"
		int k3 = 70;
		str  = k3 >= 90 ? "A" : (k3 >= 80 ? "B": k3 >= 70 ? "c":"F" );
		System.out.println(str);
		
	}
}
