package com.ict.edu2;

// �θ� Ŭ���� : super, parent
public class Ex01_Super {
	String name = "ȫ�浿";
	int age = 47;
	String addr ="����";
	private String dog ="�۸���";	//  ��ӵ��� ���� - �ڽ� Ŭ������ ����� �� ����.
	static int car = 1;
	static final  boolean GENDER = true;
	
	public Ex01_Super() {
		System.out.println("Parent contractor" + this);
	}
	
	public void prn() {
		System.out.println("�θ�Ŭ���� �޼ҵ�");
		//System.out.println(this.cat);	// ���� : �θ�� �ڽ��� ����� �ƴ� �ڽ��� ����� ����Ҽ� ����.
	}
	
	public static void prn2() {
		System.out.println("�θ�Ŭ���� static �޼ҵ�");
	}
	

	
	
}
