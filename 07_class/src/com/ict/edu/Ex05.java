package com.ict.edu;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex04[] arr = new Ex04[5];
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = new Ex04();
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();
	
			arr[i].setName(name);
			arr[i].setSum(kor + eng + math);
			arr[i].play();
		}

		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i].sum < arr[j].sum)		arr[i].rank++;
			}
		}
		
		Ex04 temp = new Ex04();
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
