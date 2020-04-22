package com.ict.edu;

//�Ӱ迵�� : ��Ƽ �����忡�� �������� ���Ǵ� ����
//				���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ� �� �ִ�.
//				�̷��� ��� �ǽð� ó��������  ������ �߻��� �� �ֱ� ������ 
//				�̸� �ذ��ϱ� ���ؼ� ����ȭ ó����  �Ѵ�.

//����ȭ ó�� : �Ӱ迵���� synchronized ������� ����Ͽ�
//					���� ���� ���� �����尡 ���� ������ �ٸ� ������� �Ӱ迵���� ���� �Ұ� ���°� �ǰ� ����� ���


// wait() :  ����ȭ ó�� �� �϶� ���� ���� ���� �����带 ������ �����·� �����Ű�� �޼ҵ� 
//				wait()�� �����带 Ǯ�������� ��� ������ �̴�.  
// wait()�� �����带 Ǯ���ִ� �޼ҵ� : notify(), notifyAll();
public class Ex12  implements Runnable{
	int x = 1 ;
	@Override
	public synchronized void run() {
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (x++));
			if(x == 10) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Ex12 t1 = new Ex12();
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
		
	}

}
