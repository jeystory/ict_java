package com.ict.edu;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 배열내용 정렬하기
		int[] su = {2,5,6,4,7,1,9,3,8,10};
		
		// Arrays -> 오름차순 정렬가능, 내림차순 정렬 기능은 없음
		Arrays.sort(su);
		for (int i : su) {
			System.out.println(i);
		}
		
		int[] k = {2,5,6,4,7,1,9,3,8,10};
		
		// 내림차순
		for (int i = 0; i < k.length-1; i++) {
			for (int j = i+1; j < k.length; j++) {
				if(k[i] < k[j])	{	// 내림차순
				//if(k[i] > k[j])	{	// 오름차순	
					int tmp = k[i];
					k[i] = k[j];
					k[j] = tmp;
				}
			}
		}
		
		for (int i : k) {
			System.out.println(i);
		}
	}
}
