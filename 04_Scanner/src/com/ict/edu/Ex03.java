package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ϴ� �ݺ� Ƚ�� : ");
		int su = scan.nextInt();
		System.out.print("���ϴ� �ܾ� : ");
		String str = scan.next();
		
		for (int i = 0; i < su; i++) {
			System.out.println(str);
		}
		System.out.println("==========");
		
		int k =0;
		while(k < su) {
			System.out.println(str);
			k++;
		}
		System.out.println("==========");
		
		k = 0;
		while(true) {
			if(k++ >= su)	break;
			System.out.println(str);
			
		}
		
		
		
	}
}
