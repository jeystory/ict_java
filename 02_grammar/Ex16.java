
public class Ex16 {
	public static void main(String[] args) {
		// ��ø ���׿����� : �������� ���׿����ڸ� ���
		// char k1 �� �빮������, �ҹ�������, ��Ÿ��������.
	
		char k1 = 'p';
		String str = (k1 >= 'A' && k1 <= 'Z') ? "�빮��" : (k1 >= 'a' && k1 <= 'z' ? "�ҹ��� " : "��Ÿ����");
		System.out.println("����� " + str);
		
		
		// int k2�� 1�Ǵ� 3�̸� ���� 2�Ǵ� 4�̸� ���� , �������� �ܱ���
		int k2 = 5;
		str = (k2 == 1 || k2 == 3) ? "����" : ((k2 == 2 || k2 == 4 )? ("����"):("�ܱ���"));
		System.out.println(str);
		
		//int k3 90�̻��̸� "A", 80�̻��̸� "B", 70�̻��̸� "C"
		int k3 = 70;
		str  = k3 >= 90 ? "A" : (k3 >= 80 ? "B": k3 >= 70 ? "c":"F" );
		System.out.println(str);
		
	}
}
