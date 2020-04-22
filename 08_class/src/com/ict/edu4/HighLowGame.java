package com.ict.edu4;

import java.util.Random;
import java.util.Scanner;

public class HighLowGame{

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		double  wCount =0, tCount = 0; 
		esc:
		while(true) {
			System.out.print("입력 : (1:  높음, 2: 낮음) ");
			int  num = scan.nextInt();
			
			if(num == 1 ||  num == 2) {
				int res = (int)(ran.nextDouble()*13)+ 1;
				// int res = (int)(Math.random()*13) +1;	// okay
								
				System.out.println("컴퓨터 숫자 : " + res + " 사용자의 선택 : " + num);
				tCount++;
				
				if(num == 1 && res > 7)	{
						wCount++;
						System.out.println("win");
				} else if(num == 2 && res < 7) {
						wCount++;
						System.out.println("win");
				} 
			} else {
				System.out.println("잘못된 입력 : (1:  높음, 2: 낮음) ");
				continue;
			}
			
						
			while(true) {
				System.out.print("Countine ? (Y / N) : ");
				String str = scan.next();
				if(str.equalsIgnoreCase("Y"))	break;
				else if(str.equalsIgnoreCase("N"))	break esc;
				else	System.out.println("잘못된 입력");
			}
			
		}
		
		// 승률 계산
		
		System.out.println("총" + tCount + "번을 수행해서 " + wCount + " 번 이겼습니다.");
		double rate = (int)((wCount/tCount * 100)*100)/100.0;
		System.out.println("승률은 :" +  rate);
	
	}	
}
