class Ex14{
	public static void main(String[] args){
		/*
		
		���׿����� : ���ǿ�����
		������ �־����� ������ ���� ���� ������ ��츦 ���� ������ ���� ������ ����� ����� �����ϴ� ������
		���� : �ڷ��� ������ = ���ǽ�? ���� �� ���๮�� : ������ �� ���� ����;
		���ǽ��� boolean��( t or f) , �񱳿�����, �������� ��밡��
		** ���� ������ ��, ������ �� ���� ������ ����� �ݵ�� ���� �ڷ����̾�� �Ѵ�.
		
		*/

		String res = true ? "�հ�" : "���հ�";
		System.out.println("result " + res );	//�հ�

		res = false ? "�հ�" : "���հ�";
		System.out.println("result " + res );	//���հ�

		//res = true ? "�հ�" : 10; // ���� - res, "�հ�", 10�� �ڷ����� �޶�. ����� true�� ���� �ڷ����� ���ƾ� ��
		//res = true? "�հ�" : ;	// ���� - false�� �Ƚᵵ ����. 

		// char�� int���� ���� �ڷ����̹Ƿ� int �� ���� ����.
		int result = true ? 'A':'B';
		System.out.println("result " + result );
		
		// ū�ڷ��� = �����ڷ���
		double b1= true ? 14  :3.14;
		System.out.println("result " + b1);		
	}
}