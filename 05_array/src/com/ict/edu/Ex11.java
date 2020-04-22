package com.ict.edu;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[][] str_person = new double[5][7];
			
		for (int i = 0; i < str_person.length; i++) {
			
			System.out.print(i + " 국어");
			str_person[i][0] = scan.nextInt();
			System.out.print(i + " 영어");
			str_person[i][1] = scan.nextInt();
			System.out.print(i + " 수학");
			str_person[i][2] = scan.nextInt();
			str_person[i][3] = str_person[i][0] + str_person[i][1] + str_person[i][2];		//총점 : str_person[3]
			str_person[i][4] = (int) (str_person[i][3] / 3.0 * 10) / 10.0;	//평균 : str_person[4]

			// grade
			if (str_person[i][4] >= 90) {
				str_person[i][5] = 'A';			// 학점 : str_person[5]
			} else if (str_person[i][4] >= 80) {
				str_person[i][5] = 'B';
			} else if (str_person[i][4] >= 70) {
				str_person[i][5] = 'C';
			} else {
				str_person[i][5] = (double)('F');
			}

			str_person[i][6] = 1;
	
		}

		// 순위 구하기
		for (int i = 0; i < str_person.length; i++) {
			for (int j = 0; j < str_person.length; j++) {
				if (str_person[i][3] < str_person[j][3])	//총점 : str_person[3]
					str_person[i][6]++;						//순위 : str_person[6]
			}
		}

		// 정렬하기
		for (int i = 0; i < str_person.length - 1; i++) {
			for (int j = i + 1; j < str_person.length; j++) {
				if(str_person[i][3] < str_person[j][3]) {	//총점 : str_person[3]
					double[] temp = new double[7];
					temp = str_person[i];
					str_person[i] = str_person[j];
					str_person[j] = temp;
				}
			}
		}

		// 출력
		System.out.println("총점\t평균\t학점\t순위\t");
		for (int i = 0; i < str_person.length; i++) {
			for (int j = 3; j < str_person[i].length; j++) {
			
				if(j == 4)	//평균
					System.out.print(str_person[i][j] + "\t");
				else if (j == 5)	// 학점
					System.out.print((char) (str_person[i][j]) + "\t");
				else // 총점
					System.out.print((int)(str_person[i][j]) + "\t");
			}
			System.out.println();

		}
	}
}
