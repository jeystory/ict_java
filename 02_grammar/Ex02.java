class Ex02{
	public static void main(String[] args){
		// ���� �ڷ����� ũ���� ���� �������
		//  byte < short < char < int < long < float < double
		
		// 1. �ڱ⺸�� ū �ڷ������� �����Ӱ� �����Ҽ� ����(�ڵ�����ȯ, promotion)
		double s1;
		s1 = 3.14;
		s1 = 3.14f;
		s1 = 34L;
		s1 = 3212;
		s1 = 'a';

		System.out.println(s1); // 97.0

		// 2. �ڱ⺸�� ���� �ڷ������� ������ ���� ���� �߻��ؼ� ��������ȯ�� �ʿ�(demotion, casting)
		// ��������ȯ�� �߻��ϸ� �������� �ս��� �߻��� �� ����.
		// ������ �������� ������ �����͸� ��ȯ -> (���� �ڷ���)(������)
		byte b1 = (byte)(-129);
		System.out.println(b1);

		float f1 = (float)(432.234);
		System.out.println(f1);

		// 3. char ����ȯ
		char c1 = 'a' + 2;
		System.out.println(c1);
		
		char c2 = 97 + 2;
		System.out.println(c2);

		// 4. char + int = int    char + long = long
		// ** char + �ٸ� �ڷ��� ->  ����� char �� ������ �����ϴ� ��� :  char�� ��ȯ�Ǽ� ���ڷ� ��°��� char c = 'a' + 2 => 'c'
		char c='a' + 2;
		System.out.println( c);	// c ���
		// ** char + �ٸ� �ڷ��� ->  ����� char �� ������ �������� �ʴ� ���� ���ڷ� ó�� : 'a' + 2 -> 99
		System.out.println('a' + 2);	//99 ���
		int k1 = 'a' + 2;
		System.out.println( k1);
		System.out.println( (char)(k1));	
		
		long k2 = c1 + 2L;
		System.out.println(k2);	
		System.out.println((char)(k2));	

		// 5. ���� ���� : ���� ũ���� �ڷ��� �����Ϳ� ū ũ���� �ڷ��� �����͸� �����ϸ� ū ũ���� �����ͷ� ��ȯ
		// ����) byte, short�� �����ϸ� ������ int �̻��� �ڷ������� ��ȯ
		double res1 = 240 + 3.14;
		float res2 = 230 + 3.14f;
		
		byte n1 = 24, n2 = 30;
		short n3 = 70, n4 = 50;
		
		int result = n1 + n2;	// int = byte + byte
		result = n3 + n4;	// int = short + short
		result = n1 + n3;	// int = byte + short (or short + byte) 

		// �Ҽ��� ù°¥�������� ���ϱ�
		double res3 = 83.5555;
		int res4 = (int)(res3 * 10);
		System.out.println(res4);
		//double res5 = res4 / 10; 	//83 <=  int/int = int
		double res5 = res4 / 10.0;	//83.5 <= int/double = double
		System.out.println(res5);
		
		// ���� �ڸ������� ���ϱ�(���� �ڸ� ����)
		int res6 = 17895;
		res6 = res6 / 10;	//1789
		res6 = res6 * 10;	//17890
		System.out.println(res6);
		
	}
}