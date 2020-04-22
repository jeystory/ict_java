package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = {"È«", "±è", "ÀÌ", "¹Ú", "°í"};
		int[] kor = {91,59,65,78,89};
		int[] eng = {87,89,96,78,98};
		int[] math = {45,89,75,85,56};
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = new int[5];
		
		//ÃÑÁ¡, Æò±Õ, ÇÐÁ¡
		for (int i = 0; i <name.length; i++) {
			sum[i] = kor[i]+math[i]+eng[i];
			avg[i] = (int)(sum[i]/3.0 * 10)/10.0;
			if (avg[i] >= 90) {
				hak[i] = "A";
			}else if (avg[i] >= 80) { 
				hak[i] = "B";
			}else if (avg[i] >= 70) { 
				hak[i] = "C";
			}else {
				hak[i] = "F";
			}
		}
		
		// rank
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < rank.length; j++) {
				if(i == j)	continue;
				if(sum[i] < sum[j])	{
					rank[i]++;
				}
			}
		}
		
		System.out.println("ÀÌ¸§\t ÃÑÁ¡\t Æò±Õ\t ÇÐÁ¡\t ¼øÀ§\t");
		for (int i = 0; i < rank.length; i++) {
			System.out.println(name[i] + "\t" + sum[i] + "\t" + avg[i] + "\t" + hak[i] + "\t" + rank[i]);
		}
	}
}
