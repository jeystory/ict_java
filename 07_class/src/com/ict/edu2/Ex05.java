package com.ict.edu2;

public class Ex05 {
	public static void main(String[] args) {
		Ex04 test = new Ex04();
		
		test.getLength(true);
		test.getLength('c');
		test.getLength(247);
		test.getLength(3.14);
		test.getLength("¥Î«—πŒ±π");
	}
}
