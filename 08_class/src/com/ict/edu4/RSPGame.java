package com.ict.edu4;
import java.util.Random;
import java.util.Scanner;


public class RSPGame {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		double  wCount =0, tCount = 0; 
		esc:
		while(true) {
			System.out.print("입력 : (1:  가위, 2: 바위, 3:보) ");
			int  num = scan.nextInt();
			
			if(num == 1 ||  num == 2 || num == 3) {
				int res = (int)(ran.nextDouble()*3)+1;
				
				String cIn = "", pIn ="";
				if(num == 1)		pIn = "가위";
				else if(num == 2)	pIn = "바위";
				else if(num == 3)	pIn = "보";
				
				if(res == 1)			cIn = "가위";
				else if(res == 2)	cIn = "바위";
				else	 if(res == 3)	cIn = "보";
				
				System.out.println("컴퓨터 숫자 : " + cIn + " 사용자의 선택 : " + pIn);
				tCount++;
				if(num == 1 && res == 3)		{wCount++; System.out.println("win");}
				else if(num== 2 && res ==  1)	{wCount++;System.out.println("win");}
				else if(num==3 && res == 2)	{wCount++;System.out.println("win");}
				
			} else {
				System.out.println("잘못된 입력 : (1:  가위, 2: 바위, 3:보) 만 입력 ");
				continue;
			}
			
						
			while(true) {
				System.out.print("Countine ? (Y / N) : ");
				String str = scan.next();
				if(str.equals("Y") || str.equals("y"))	break;
				else if(str.equals("N") || str.equals("n"))	break esc;
				else	System.out.println("잘못된 입력");
			}
			
		}
		
		// 승률 계산
		
		System.out.println("총" + tCount + "번을 수행해서 " + wCount + " 번 이겼습니다.");
		double rate = (int)((wCount/tCount * 100)*100)/100.0;
		System.out.println("승률은 :" +  rate);
	
	}	
	
}
