package com.ict.edu;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("name  : ");
		String name = scan.next();
		System.out.print("Korean  : ");
		int kor = scan.nextInt();
		System.out.print("English  : ");
		int eng = scan.nextInt();
		System.out.print("Mathmatics  : ");
		int math = scan.nextInt();
		
		Ex11_1 test = new Ex11_1();
		
		int sum = test.sum(kor, eng, math);
		double avg = test.avg(sum);
		String grade = test.grade(avg);
		
		System.out.println("name : " + name + "\ttotal " + sum + "\tAvg. " + avg + "\tGrade :"  + grade);
		
		
		Ex11_2 test1 = new Ex11_2(name);
		test1.sum(kor, eng, math);
	
	}
}
