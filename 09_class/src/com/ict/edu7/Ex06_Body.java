package com.ict.edu7;

public class Ex06_Body {
	private String[] menu = { "아메리카노", "레몬티", "카푸치노" };
	private int[] price = { 5000, 8000, 9000 };
	private int income ;

	String choice = "카푸치노";

	public void cafe(Ex06 c) {
		c.setMenu(menu);
		System.out.println("까페 등록 완료");
		System.out.println("==== MENU ====");
		
		//메뉴표시
		for (int i = 0; i < c.getMenu().length; i++) {
			System.out.println(i+1 + " : " + c.getMenu()[i] );
		}
		c.sell(choice);
	}

	public String[] getMenu() {
		return menu;
	}

	public void setMenu(String[] menu) {
		this.menu = menu;
	}

	public int[] getPrice() {
		return price;
	}

	public void setPrice(int[] price) {
		this.price = price;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

}
