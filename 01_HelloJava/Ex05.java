class Ex05{
	public static void main(String[] args){
		// ���ڸ� ������ ����
		// ���� ����� => char
		// char�� ����Ǵ�  �����ʹ� 0-65535�� ���ڰ�
		// �������·� �����ϱ� ���ؼ��� '�ѹ���'�� ���·� ���� => ex)'A', 'a', '1', '��', '��'

		char k1;	// ����
		k1 = 'a';	// ���� - a�� k1�� ����Ǵ� ���� �ƴ϶� a�� �ش��ϴ� Uni-code���� ����
		System.out.println(k1);

		char k2 = 97;
		System.out.println(k2);

		char k3 = '\u0042';
		System.out.println(k3);

		char k4 = '\u0062';
		System.out.println(k4);

	}

}