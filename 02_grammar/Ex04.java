class Ex04{

	public static void main(String[] args){
		// ���������� : 1�� ����, �����ϴ� ������
		//	    char, ����, �Ǽ����� ���
	
		int su1 = 10, su2 = 10;
		
		System.out.println(++su1);	//11
		System.out.println(su2++);	//10

		System.out.println(su1);	//11
		System.out.println(su2);	//11

		char c1 = 'D', c2 = 'D';
		System.out.println(++c1);	//E
		System.out.println(c2++);	//D

		System.out.println(c1);		//E
		System.out.println(c2);		//E
	}
}