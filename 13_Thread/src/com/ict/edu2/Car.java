package com.ict.edu2;

import java.util.ArrayList;
import java.util.List;

public class Car {
	// 자동차를 가지고 있는 리스트
	private List<String >  carList = null;
	
	public Car() {
		carList = new ArrayList<String>();
	}

	public String getCar() {
		String carName  = null;
		
		switch ((int)(Math.random() * 3)) {
			case 0:
				carName = "SM5";
				break;
			case 1:
				carName = "매그넌스";
				break;
			case 2:
				carName = "카렌스";
				break;
			default:
				break;
		}
		return carName;
	}

	// 자동차 팔기
	public synchronized String pop() {
		String carName = null;
		if(carList.size() == 0) {
			try {
				System.out.println("차가 없어요. 생산할 떄까지 기다리세요.");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		//  리스트에 맨 마지막에 있는 객체를 삭제하고 이름을 반환
		carName = (String)carList.remove(carList.size()-1);
		System.out.println(" 손님이 차를 사갔습니다. : " + carName);
		return carName;
	}
	
	// 자동차 생산
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어졌습니다. : " + car);
		
		//  재고가 없을 때 wait()된 thread를 다시 실행시킨다.
		if(carList.size() ==5) {
			this.notify();
		}
	}
	
	
}
