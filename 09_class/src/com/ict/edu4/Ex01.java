package com.ict.edu4;

// �������̽� : ���񽺸� �����ϱ� ���� ���
// 					- ** ���� : �߻�޼ҵ�� ���(static final)
// 					- ������ X => ��ü ���� X
//					- ���� ����� ����
//  				- �������̽��� ���� : ��ü �Ǵ� ȣȯ ����
/*
           interface
             /    \ 
  extends     implements    
           /        \
    interface   class
           \         /
implements  extends 
            \      /
              class
 
**Ŭ������ �θ�� ������ �������̽��� ����.      
*/
public interface Ex01 {
	// �ڵ����� static final�� ����
	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;
	
	/*	// �Ϲݸ޼ҵ�� ����� �� ����
	public  void play() {
		
	}*/
	public static void paly() {
		System.out.println("static �޼ҵ�� ��밡��");
	};
	
	// �߻�޼ҵ� ��밡��
	public abstract void play2();
	// abstract�� ������ �ʾƵ� �������̽��� ���� �ƴ�
	public void sound();
}
