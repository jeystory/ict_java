package com.ict.edu7;

public class Ex05_Main {
	public static void main(String[] args) {
		Ex05_InnerClass test1 = new Ex05_InnerClass();
		test1.prnData();
		System.out.println("=============");
		
		Ex05_InnerClass2 test2 = new Ex05_InnerClass2();
		test2.play();
		System.out.println("=============");
		
		test2.play(new Ex05() {
			@Override
			public void prnData() {}
		});	
	}
}
