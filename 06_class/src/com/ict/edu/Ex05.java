package com.ict.edu;

public class Ex05 {
		//��� �ʵ� : ���°�, �Ӽ�
		// - static X - �ν��Ͻ�
		// - static O - static
		// - final X - ����
		// - final O - ���
		String name ="Hong";			// instance ����
		int kor = 80 ;						// instance ����
		static int eng = 80;				// static ����
		final int MATH = 100;			// instance ���
		static final int COM = 100;	// static ���
		
		// [��������][�޼ҵ�����] ��ȯ�� �޼ҵ��̸�([���ڵ�]){ ���๮�� }
		// �޼ҵ�� �⺻������ instance�� static���θ� ��������
		public void add() {
			kor = kor + 10;			// - final X => ����
			eng = eng + 10;			// - final X => ����
			//MATH = MATH + 10;	// - final O => ���(�� ����X)
			//COM = COM + 10;		// - final O => ���(�� ����X)
		}
}
