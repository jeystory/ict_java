class Ex15{
	public static void main(String[] args){
		// ���׿����� ����
		//int k1�� Ȧ�� ���� ¦������ �Ǻ�
		int k1 = 8;
		String res = k1%2 == 1 ? "Ȧ��" : "¦��";
		System.out.println(k1 + "�� " + res);

		//int k2�� ������ 60�� �̻��̸� �հ�
		int k2 = 70;
		res = k2 >= 60 ? "�հ�": "���հ�";
		System.out.println(k2 + "�� " + res);

		// ���� k3�� �빮������, �빮�� �ƴ��� �Ǻ�����.
		char k3 = 'P';
		res = (k3 >= 'A' && k3 <= 'Z') ? "�빮��":"�빮�� �ƴ�";
		System.out.println(k3 + "�� " + res);
	
		// int k4�� 1 �Ǵ� 3�̸� ����, �ƴϸ� ����
		int k4 = 1;
		res = ((k4 == 1) || (k4 == 3)) ? "����" : "����";
		System.out.println(k4 + "�� " + res);

		// �ٹ��ð��� 8�ð������� 8350��. 8�ð� �ʰ��ϸ� �ʰ��� �ð����� 1.5��
		// �ٹ��� �ð� 10�ð�. �󸶸� �޾ƾ� �ϳ�
		int time = 10, wage = 8350;
	
		int int_res = (time > 8) ? (int)((time - 8)* wage* 1.5) + 8 *wage : time*wage;
		System.out.println(time + "�ð��� " + int_res + "���Դϴ�.");
	 		
	}
}