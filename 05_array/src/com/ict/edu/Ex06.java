package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < 5; i++) {
			System.out.print("이름 :");
			name[i] = scan.next();

			System.out.print("국어 :");
			kor[i] = scan.nextInt();

			System.out.print("영어 :");
			eng[i] = scan.nextInt();

			System.out.print("수학 :");
			math[i] = scan.nextInt();

			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;

			if (avg[i] >= 90) {
				hak[i] = "A";
			} else if (avg[i] >= 80) {
				hak[i] = "B";
			} else if (avg[i] >= 70) {
				hak[i] = "C";
			} else {
				hak[i] = "F";
			}
			
		}
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(i==j)	continue;
				if(sum[i] < sum[j])	rank[i]++;
			}
		}
		
		System.out.println("이름\t총점\t평균\t학점\t순위\t");
		for (int i = 0; i < rank.length; i++) {
			System.out.println(name[i] + "\t" + sum[i] + "\t" + avg[i] + "\t" + hak[i] + "\t" + rank[i]);
		}
	}
}
