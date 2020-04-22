package com.ict.edu;

public class Ex04 {
	/* switch ~ case �� : if���� ���� �б⹮�̴�.
	if���� ���ǽ��� boolean, ������, �񱳿���, ������ �� ����ϱ� ����
	switch���� �־��� �����Ͱ� byte, short, int, char, String
	switch(���ڰ�=���ǰ�){
		case ���ǰ� 1: 
			���๮(���ڰ��� ���ǰ� 1�� ���� ��); 
			break;
		case ���ǰ� 2: 
			���๮(���ڰ��� ���ǰ� 2�� ���� ��); 
			break;
		case ���ǰ� 3: 
			���๮(���ڰ��� ���ǰ� 3�� ���� ��); 
			���๮(���ڰ��� ���ǰ� 3�� ���� ��); 
			���๮(���ڰ��� ���ǰ� 3�� ���� ��); 
			break;
		default:
			���๮;	// ���ǰ� 1,2,3 �� ��� ���ڰ��� ���� ���� �� default ���๮ ����
			[break;]	// ��������. ������ switch ���� ������ ������ ���࿡ �ƹ��� ��ȭ�� ����
	}
	     **** ���ǻ��� : break���� ������ switch ���� Ż���Ѵ�. 
			���࿡ ������ ���� break���� ������ ���� ���� ��� ���๮���� �����Ѵ�.
	 */
	public static void main(String[] args) {
		// char k3�� A�Ǵ� a�̸� Africa, B�Ǵ� b�̸� Brazil, C�Ǵ� c�̸� Canada, �������� Korea ����ϴ� ���α׷�
		// break�� ���� �� ����� ����
		char k1 = 'B';

		switch (k1) {
			case 'A':
				System.out.println("������ī");
			case 'B':
				System.out.println("�����");
			case 'C':
				System.out.println("ĳ����");
			default:
				System.out.println("���ѹα�");
		}
		System.out.println("====================");

		String str = "";
		switch (k1) {
			case 'A':
				str = "������ī";
			case 'B':
				str = "�����";
			case 'C':
				str = "ĳ����";
			default:
				str = "���ѹα�";
		}
		System.out.println(str);
		System.out.println("====================");

		str = "";
		switch (k1) {
			case 'A':
				str = "������ī";
				break;
			case 'B':
				str = "�����";
				break;
			case 'C':
				str = "ĳ����";
				break;
			default:
				str = "���ѹα�";
		}
		System.out.println(str);
		System.out.println("====================");

		// char k3�� A�Ǵ� a�̸� Africa, B�Ǵ� b�̸� Brazil, C�Ǵ� c�̸� Canada, �������� Korea ����ϴ� ���α׷�
		str = "";
		switch (k1) {
			case 'A':
			case 'a':
				str = "������ī";
				break;
			case 'B':
			case 'b':
				str = "�����";
				break;
			case 'C':
			case 'c':
				str = "ĳ����";
				break;
			default:
				str = "���ѹα�";
		}
		System.out.println(str);
		System.out.println("====================");
		
		// char k2�� 1�Ǵ� 3�̸� , 2�Ǵ� 4�̸� ���� , �������� �ܱ���
		char k2 = 5;
		str = "";
		switch (k2) {
		case 1:
		case 3:
			str = "����";
			break;
		case 2:
		case 4:
			str = "����";
			break;
		default:
			str = "�ܱ���";
			break;
		}
		System.out.println(str);
		System.out.println("====================");
		
		// �����̸� ���� ����ϱ� �ѱ�-����, �߱� - �ϰ�, �̱�-������ DC, ĳ���� - ��Ÿ�� 		
		String country = "ĳ����";
		str = "";
		switch (country) {
		case "�ѱ�":
			str = "����";
			break;
		case "�߱�":
			str = "�ϰ�";
			break;
		case "ĳ����":
			str = "��Ÿ��";
			break;
		case "�̱�":
			str = "������ DC";
			break;
		default:
			str = "����Ʈ�� ���� �����Դϴ�.";
			break;
		}
		System.out.println("�Է��� " + country + "�� ������ " + str );
		System.out.println("====================");
	}
}
