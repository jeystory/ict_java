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
				//생성된 자동차를 리스트에 추가
				car.push(carName);
				
				try {
					Thread.sleep((int) (Math.random() * 250));
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
	}

}
