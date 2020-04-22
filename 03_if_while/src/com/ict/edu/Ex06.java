package com.ict.edu;

public class Ex06 {
	/*
	다중 for문 : for문 안에 다른 for문이 존재
	*/
	
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i = " + i + ", j =" + j);
			}
		}
		
		System.out.println("=================");
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i == j)	System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		// 0 0 0 1
		// 0 0 1 0
		// 0 1 0 0
		// 1 0 0 0
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i + j == 3)	System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		for (int i = 4; i > 0; i--) {
			for (int j = 1; j < 5; j++) {
				if(i == j)	System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		//  구구단 1
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println( i + " * " +  j + " = " + (i*j));
			}
		}
		System.out.println("=================");
		
		//  구구단 2
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print( i + " * " +  j + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
		System.out.println("=================");
		
		//  구구단 3
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print( j + " * " + i + " = " + (i*j) + "\t");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
	
}
