package com.ict.edu;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// ���� �߻� ���
		// 1. ��ü�� ���� ���� �߻�
		Random ran = new Random();

		// ������ ������ ������ ���������� ���� ���
		int num = ran.nextInt();
		System.out.println(num);
		System.out.println("================");

		// �����Ҷ����� 0~4������ ������
		num = ran.nextInt(5); // 0~4
		System.out.println(num);
		System.out.println("================");

		// 2. ��ü�� ������ �ʰ� ���� �߻�
		// �������� ���� 0.0 ~ less than 1.0 �Ǽ���
		double dNum = Math.random();
		System.out.println(dNum);

		// ������ 0 ����
		int k2 = (int) (Math.random());
		System.out.println(k2);

		int k3 = (int) (Math.random() * 5);
		System.out.println(k3);
	}
}
