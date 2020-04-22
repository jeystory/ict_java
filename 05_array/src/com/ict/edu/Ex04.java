package com.ict.edu;

public class Ex04 {
	// 순위 구하기
	// 모든 순위의 초기값은 1로 설정
	public static void main(String[] args) {
		int[] su = {90,85, 70,90, 95, 72};
				
		for (int i = 0; i < su.length; i++) {
			int rank = 1;
			for (int j = 0; j < su.length; j++) {
				if(i == j)	continue;
				if(su[i] < su[j])	rank++;
			}
			System.out.println(su[i] + " : " + rank);
		}
		
		int[] su1 = {90, 85, 70, 90, 95, 72};
		int[] rank1 = {1,1,1,1,1,1};
		for (int i = 0; i < su1.length; i++) {
			
			for (int j = 0; j < su1.length; j++) {
				if(i == j)	continue;
				if(su1[i] < su1[j])	rank1[i]++;
			}
		}
		
		for (int i : su1) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for (int i : rank1) {
			System.out.print(i + "\t");
		}
	}
	
	
}
