class Ex06{
	public static void main(String[] args){
		/*
		���� : ������(�Ҽ��� X), �Ǽ���(�Ҽ��� O)
		-  ������ : byte < short < int(�⺻) < long
		-  �Ǽ��� : float < double(�⺻)

		- byte : �������̸鼭 ���� ���� ���� -128~127 �� ���� ����
		*/

		byte b1 = -128;
		System.out.println(b1);
		
		b1 = 127;
		System.out.println(b1);
		
		//byte������ ����� ���� -128~127
		//b1 = -129;	// conversion error(int -> byte) : byte�� -128~127
		//b1 = 128;	// conversion error(int -> byte) : byte�� -128~127
		System.out.println(b1);

		//b1 = 120+10;	// ������ ����� ����. ������� byte������ ����� ������
		System.out.println(b1);
	}

}