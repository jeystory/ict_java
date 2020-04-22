package com.ict.edu3;

public class Ex05 {
	private String name;
	private int price;
	private int su;
	
	public Ex05() {
		// TODO Auto-generated constructor stub
	}

	// VO(ValueObject) : 값을 담는 객체
	public Ex05(String name, int price, int su) {
		super();
		this.name = name;
		this.price = price;
		this.su = su;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}
	
	
	
	
}
