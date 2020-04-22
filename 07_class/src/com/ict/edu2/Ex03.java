package com.ict.edu2;

public class Ex03 {
	private int su;
	private String name;
	private int price;
	private boolean order;
	
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
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
	
	// boolean형은 getXXX() 대신에 isXXX() 를 사용한다.
	public boolean isOrder() {
		return order;
	}
	public void setOrder(boolean order) {
		this.order = order;
	}
}
