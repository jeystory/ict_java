package com.ict.edu;

public class Ex03 {
	/*  ���� if��(��ø if��) : ������ �� �ٽ� if���� ���
	if (���ǽ� 1) {
		���ǽ�1�� ���϶� ������ �����
	}
	else if(���ǽ� 2){
		���ǽ� 1�� �����̰� ���ǽ� 2�� ���� ��� ������ �����
	}
	else if(���ǽ� 3){
		���ǽ� 1�� 2�� �����̰� ���ǽ� 3�� ���� ��� ������ �����
	}
	else {
		���ǽ� 1,2,3�� ��� ������ �� ������ �����
	}
	*/

	public static void main(String[] args) {
		// int k1�� 90 �̻��̸� A, 80�̻��̸� B, 70 �̻��̸� C, �������� F
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
		

		// char k3�� A�Ǵ� a�̸� Africa, B�Ǵ� b�̸� Brazil, C�Ǵ� c�̸� Canada, �������� Korea ����ϴ� ���α׷�
		char k3 = 'C';
		str = "";

		if(k3 == 'a' || k3 == 'A')		str = "Africa";
		else if(k3 == 'b' || k3 == 'B')	str = "Brazil";
		else if(k3 == 'c' || k3 == 'C')	str = "Canada";
		else 							str = "Korea";
		
		System.out.println("Result : " +  str);

		/*  �޴� 1 ī���ī 3500 
			2 ī��� 4000
			3 �Ƹ޸�ī�� 3000
			4 �����ֽ� 3500
		������ �� : ����, ģ���� 2�� ����. �ܵ��� ���ϱ�?(�ΰ��� 10%)
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
