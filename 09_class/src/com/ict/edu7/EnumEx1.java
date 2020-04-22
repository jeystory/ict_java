package com.ict.edu7;

// ������ : ����� �ϳ��� ��ü�� �ν�. �������� ��� ��ü���� �Ѱ��� ��� �� �ϳ��� ����(��ü)
public class EnumEx1 {
	
	static final int JAVA = 200;
	
	public enum Lesson{
		//static final 
		JAVA, JSP, SPRING, ANDROID
	}
	
	
	public static void main(String[] args) {
		Lesson le = Lesson.JAVA;
		System.out.println("le : " + le);
		System.out.println("JAVA : " + Lesson.JAVA);	//JAVA : ��ü
		System.out.println("JAVA : " + JAVA);				//200 : ��(������)
		System.out.println("jsp : " + Lesson.JSP);
		
		System.out.println("=========");
		Lesson[] items = Lesson.values();
		System.out.println("����" + items.length);
		
		//ordinal() : ���� ����� ������ ���ϱ�
		for (Lesson k : items) {
			System.out.println(k + " : " + k.ordinal());
		}
	}
}
