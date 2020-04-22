package com.ict.edu2;

import java.util.ArrayList;
import java.util.List;

public class Car {
	// �ڵ����� ������ �ִ� ����Ʈ
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
				carName = "�ű׳ͽ�";
				break;
			case 2:
				carName = "ī����";
				break;
			default:
				break;
		}
		return carName;
	}

	// �ڵ��� �ȱ�
	public synchronized String pop() {
		String carName = null;
		if(carList.size() == 0) {
			try {
				System.out.println("���� �����. ������ ������ ��ٸ�����.");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		//  ����Ʈ�� �� �������� �ִ� ��ü�� �����ϰ� �̸��� ��ȯ
		carName = (String)carList.remove(carList.size()-1);
		System.out.println(" �մ��� ���� �簬���ϴ�. : " + carName);
		return carName;
	}
	
	// �ڵ��� ����
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("���� ����������ϴ�. : " + car);
		
		//  ��� ���� �� wait()�� thread�� �ٽ� �����Ų��.
		if(carList.size() ==5) {
			this.notify();
		}
	}
	
	
}
