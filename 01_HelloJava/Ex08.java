class Ex08{
	public static void main(String[] args){
		/*
		���� : ������(�Ҽ��� X), �Ǽ���(�Ҽ��� O)
		-  ������ : byte < short < int(�⺻) < long
		-  �Ǽ��� : float < double(�⺻)
		
		- �Ϲ����� ������ int
		- long : int���� �� ���� ������ ������ ����
			���ڵڿ� L�Ǵ�  l�� ����. ���� ����
		*/

		int k1 = 128;	// byte �ʰ�
		System.out.println(k1);
		
		k1 = 32768;	// short �ʰ�
		System.out.println(k1);
		
		// long : int���� �� ���� ������ ������ ����
		// 	���ڵڿ� L�Ǵ�  l�� ����. ���� ����
		long k2 = 128L;
		System.out.println(k2);

		k2 = 32768l;
		System.out.println(k2);

		k2 = 127;
		System.out.println(k2);	
		
		//k2 = 127.0;
		//System.out.println(k2);	
	}

}