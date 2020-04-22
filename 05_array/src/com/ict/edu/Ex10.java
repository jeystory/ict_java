package com.ict.edu;

public class Ex10 {
	public static void main(String[] args) {
		int[][] str = new int[5][4];
		// 한사람의 정보가 하나의 배열이다.
		int[] p1 = {270,90,'A',1};
		int[] p2 = {210,70,'C',1};
		int[] p3 = {180,60,'F',1};
		int[] p4 = {300,100,'A',1};
		int[] p5 = {285,95,'A',1};
		
		str[0] = p1;
		str[1] = p2;
		str[2] = p3;
		str[3] = p4;
		str[4] = p5;
		
		// 순위 구하기 
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i][0] < str[j][0])
				 str[i][3]++;	
			}
		}
		
		// 정렬하기
		int[] temp = new int[4];
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i][0] < str[j][0]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		// 출력하기
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				if(j == 2)	
					System.out.print((char)(str[i][j])+"\t");
				else	System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
