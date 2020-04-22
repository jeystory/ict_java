package com.ict.edu;

public class Ex03 {
	/*  다중 if문(중첩 if문) : 거짓일 때 다시 if문을 사용
	if (조건식 1) {
		조건식1이 참일때 실행할 문장들
	}
	else if(조건식 2){
		조건식 1이 거짓이고 조건식 2가 참일 경우 실행할 문장들
	}
	else if(조건식 3){
		조건식 1과 2가 거짓이고 조건식 3가 참일 경우 실행할 문장들
	}
	else {
		조건식 1,2,3이 모두 거짓일 때 실행할 문장들
	}
	*/

	public static void main(String[] args) {
		// int k1이 90 이상이면 A, 80이상이면 B, 70 이상이면 C, 나머지는 F
		int k1 = 50;
		String str = "";
		if(k1 >= 90)		str = "Grade A";
		else if( k1 >= 80)	str = "Grade B";
		else if(k1 >= 70)	str = "Grade C";
		else 				str = "Grade F";
		
		System.out.println("Result : " +  str);

		// char k2 upper case(capital), lower case, numeric, other characters
		char k2 = '3';
		str = "";
		if(k2 >= 'A' && k2 <= 'Z')		str = "upper case(capital)";
		else if(k2 >= 'a' && k2 <= 'z')	str = "lower case";
		else if(k2 >= '0' && k2 <= '9')	str = "numeric";
		else 							str = "other characters";
		
		System.out.println("Result " + str);
		

		// char k3이 A또는 a이면 Africa, B또는 b이면 Brazil, C또는 c이면 Canada, 나머지는 Korea 출력하는 프로그램
		char k3 = 'C';
		str = "";

		if(k3 == 'a' || k3 == 'A')		str = "Africa";
		else if(k3 == 'b' || k3 == 'B')	str = "Brazil";
		else if(k3 == 'c' || k3 == 'C')	str = "Canada";
		else 							str = "Korea";
		
		System.out.println("Result : " +  str);

		/*  메뉴 1 카페모카 3500 
			2 카페라떼 4000
			3 아메리카노 3000
			4 과일주스 3500
		지불한 돈 : 만원, 친구와 2잔 구입. 잔돈은 얼마일까?(부가세 10%)
		*/	
		int price=0;
		int menu = 3;
		int amount = 2;
		int input = 10000;
		int money = 0;
		int vat = 0;
		int out = 0;
		String coffee= "";
		
		if( menu == 1 ){
			coffee = "caffe Mocha";
			price = 3500; 
		}else if( menu == 2 ){
			coffee = "cafe Latte";
			price = 4000;
		}
		else if( menu == 3 ) {
			coffee = "Americano";
			price = 3000;
		}
		else if( menu == 4 ){
			coffee = "Fruit Juice";
			price = 3500;
		}
		
		vat = (int)(price * 2 * 0.1);
		money = price * amount + vat;	
		out = input-money;
		System.out.println("selected item :" + coffee + " change : " + out);	
	}           
}
