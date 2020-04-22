package com.ict.edu2;

public class Producer implements Runnable {
	private Car car;

	public Producer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
			String carName = null;
			for (int i = 0; i < 20; i++) {
				carName = car.getCar();
				//������ �ڵ����� ����Ʈ�� �߰�
				car.push(carName);
				
				try {
					Thread.sleep((int) (Math.random() * 250));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
	}

}
