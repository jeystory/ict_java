class Ex03{
	public static void main(String[] args){
		// �����ڷ��� : Ŭ������ �ڷ������� ���
		// String class : ���ڿ��� ó���ϴ� ����� ������ �ִ� Ŭ����
		// 		Ŭ���������� �⺻ �ڷ���ó�� ����� �� ����
		//        	�ݵ�� "" ����ؼ� ���ڿ��� ���������.
		String str = "hello";
		System.out.println(str);
		int su = 24;
		System.out.println(su);

		// String ���� : + ����(��������� �ƴ϶� ���ڿ�����) but -, *, / �Ұ��� 	
		//             + �� ����� ������ String �̴�.
     		
		str = "1000";
		su = 1000;
		System.out.println(str + 100);
		System.out.println(su + 100);
		
		int su1 = 20, su2 = 4;
		int res = su1 + su2;
		System.out.println(su1 + su2);	//24
		System.out.println("�����" + su1 + su2); // ����� 204  "�����" + 20 -> "�����20" + 4 => "�����204" ������� ó��
		System.out.println("�����" + (su1 + su2));
		System.out.println("�����" + res);	// ��õ ���
	}
}