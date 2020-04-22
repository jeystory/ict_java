package com.ict.edu;

public class Ex02_StringFormat {
	public static void main(String[] args) {
		// String �Һ��� Ư¡ : String�� �ѹ� ����� ������ �� ����.
		String s1 = "I �� YOU";
		s1 = s1 + "Korea";
		
		System.out.println(s1);
		System.out.println("=============");
		
		//���Ĺ���
		// %s ���ڿ� ,%d :���� ,%f : �Ǽ�
		
		String s3 = "ICT ���� ���߿�";
		int su1 = 92;
		float su2 = 78995.5789f;
		float su3 = 152395.5789f;
		double su4 = 152395.5789;
		
		System.out.printf("����� �Ҽ��� %s �Ҽ��Դϴ�.\n ����� ����� %d �Դϴ�.\n ", s3, su1 );
		// %.2f : �Ҽ��� 3°¥������ �ݿø��ؼ� ��°�ڸ����� ���
		System.out.printf("����� ��� ������ %f, %4f, %.2f\n", su2, su2, su2);
		System.out.printf("����� ��� ������ %f, %4f, %.2f\n", su3, su3, su3);
		System.out.printf("����� ��� ������ %f, %4f, %.2f\n", su4, su4, su4);
		System.out.printf("%s\n ", s3 );
		System.out.printf("%5s\n ", s3 );
		System.out.printf("%20s\n ", s3 );
		
		//String.format() : ������ �����ϰ� ���Ŀ� ���� ����
		System.out.println(String.format("%20s", s3));
	}
}
