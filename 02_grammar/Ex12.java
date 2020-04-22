class Ex12{
	public static void main(String[] args){
		/*
		�������� : &&(AND, ����), ||(OR, ����), !(NOT, ������)
		���������� ����� boolean��, ��ȯ���� boolean��
		���������� ����� �񱳿�����, ��������, boolean��
		
		�� ������ : || (or, ����, ������)
		- �־��� ���ǵ��� ��� ����(false)�϶��� ��� ����(false)
		- �־��� ���ǵ��̸� �ϳ��� ��(true)�̸� ����� ��(true)	
		- true�� ������ �ڿ� ���ǽ��� �������� �ʰ� ����� ��(true) 
		
		*/

		int su1 = 10, su2= 7;

		boolean b1 = (su1 >= 7) || (su2 >= 5);	// t = t || t
		System.out.println(b1);

		b1 = (su1 <= 7) || (su2 >= 5);	// t= f || t
		System.out.println(b1);

		b1 = (su1 >= 7) || (su2 <= 5);	// t = t || f
		System.out.println(b1);

		b1 = (su1 <= 7) || (su2 <= 5);	// f = f || f
		System.out.println(b1);
		System.out.println("=========================");

		su1 = 10;
		su2 = 7;
		boolean res = ((su1 += 2) > su2) || (su1 == (su2 += 5));
		System.out.println("res = " + res);	// true
		System.out.println("su1 = " + su1);	//12
		System.out.println("su2 = " + su2);	//7	
		System.out.println("=========================");

		// !(NOT,������)
		// �־��� ������ �ݴ�� ǥ�� : true(in) -> false(out), false -> true �� ����
		res = true;
		System.out.println("result   : " + res);	// true
		System.out.println("!result  : " + !res);	// false
		System.out.println("!!result : " + !!res);	// true
	}
}