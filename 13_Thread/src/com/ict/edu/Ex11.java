package com.ict.edu;

//�Ӱ迵�� : ��Ƽ �����忡�� �������� ���Ǵ� ����
//				���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ� �� �ִ�.
//				�̷��� ��� �ǽð� ó��������  ������ �߻��� �� �ֱ� ������ 
//				�̸� �ذ��ϱ� ���ؼ� ����ȭ ó����  �Ѵ�.

//����ȭ ó�� : �Ӱ迵���� synchronized ������� ����Ͽ�
//					���� ���� ���� �����尡 ���� ������ �ٸ� ������� �Ӱ迵���� ���� �Ұ� ���°� �ǰ� ����� ��� 

public class Ex11  implements Runnable{
	int x ;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (x++));
		}
		
		
	}
	
	public static void main(String[] args) {
		Ex11 t1 = new Ex11();
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
		
	}

}
