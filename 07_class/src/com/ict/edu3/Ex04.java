package com.ict.edu3;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EX03[] arr = new EX03[5];
		
		for (int i = 0; i <arr.length; i++) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			arr[i] = new EX03(name, kor, eng, math);
		
			arr[i].setSum();
		}

		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum)		arr[i].rank++;
			}
		}
		
		EX03 temp = new EX03();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum)	{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].sum+"\t");
			System.out.print(arr[i].avg+"\t");
			System.out.print(arr[i].grade+"\t");
			System.out.println(arr[i].rank);
			
			
		}
	}
	


}
