package com.ict.edu2;

import java.util.Random;

public class Ex02_Main extends Random{
	// random Ŭ���� ��ü ����
	public static void main(String[] args) {
		//Random ran = new Random();
		//int su = ran.nextInt(10)+1;	//1-10
		//System.out.println(su);
		
		// Ex02�� ����� �ϸ� Random�� ����ϸ�
		
		Ex02_Main test = new Ex02_Main();
		int n1 = test.nextInt(10) + 1;
		System.out.println(n1);
		
		//static �̹Ƿ� �ҷ��� �� ����
		// nextInt()�� static�� �ƴ϶� �ҷ��� �� ����
		//int num = nextInt(10) + 1;
		
		//play();	// ���� - �ҷ��� ����� �� �ִ� ����� ����. 
		//play()�� static���� �����ص� ����. b.c) nextInt() �� static �޼ҵ尡 �ƴ϶� static �Լ����� �ҷ��� ��� X
		
	}
	
	public void play() {
		int num = nextInt(10) +1 ;
		System.out.println(num);
	}
}
