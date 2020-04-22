class Ex11{
	public static void main(String[] args){
		// �������� : &&(AND, ����), ||(OR, ����), !(NOT, ������)
		// ���������� ����� boolean��, ��ȯ���� boolean��
		// ���������� ����� �񱳿�����, ��������, boolean��
		
		// &&(AND, ����, ������)
		// �־��� ���ǵ��� ��� ���϶��� ����� ��
		// �־��� ���� �� false�� ������ false
		// false�� ������ false ������ �����ϴ� ������ ������ ���� ����
		// '���� >= ���� and ���� <= ����' : ������ ������ ��Ÿ����.
		// ex) a>=10 && a<=20 : 10<= a <=20 (a�� 10���� 20����)�� �ǹ�

		int su1 = 10, su2= 7;

		boolean b1 = (su1 >= 7) && (su2 >= 5);	// t = t && t
		System.out.println(b1);
		
		b1 = (su1 <= 7) && (su2 >= 5);	// f= f && t
		System.out.println(b1);

		b1 = (su1 >= 7) && (su2 <= 5);	// f = t && f
		System.out.println(b1);

		b1 = (su1 <= 7) && (su2 <= 5);	// f = f && f
		System.out.println(b1);
		System.out.println("=========================");

		su1 = 10;
		su2 = 7;
		boolean res = ((su1 += 2) > su2) && (su1 == (su2 += 5));
		System.out.println("res = " + res);	// true
		System.out.println("su1 = " + su1);	//12
		System.out.println("su2 = " + su2);	//12	
		System.out.println("=========================");

		su1 = 10;
		su2 = 7;
		res = ((su1 += 2) < su2) && (su1 == (su2 += 5));
		System.out.println("res = " + res);	//false
		System.out.println("su1 = " + su1);	//12
		System.out.println("su2 = " + su2);	//7
		System.out.println("=========================");

		// '���� >= ���� and ���� <= ����' : ������ ������ ��Ÿ����.
		// ex) a>=10 && a<=20 : 10<= a <=20 (a�� 10���� 20����)�� �ǹ�
		su1 = 13;	
		res = (su1 >= 10) && (su1 <= 15);	// 10<= su1 <= 15
		System.out.println("��� : " + res);	// true

		su1 = 17;	
		res = (su1 >= 10) && (su1 <= 15);
		System.out.println("��� : " + res);	// false

		// �������ڰ� �ҹ�������  �ƴ���
		char c1 = 'p';
		res = (c1 >= 'a') && (c1 <= 'z');
		System.out.println("��� : " + res);

		c1 = 'Q';
		res = (c1 >= 'a') && (c1 <= 'z');
		System.out.println("��� : " + res);

      	}
}