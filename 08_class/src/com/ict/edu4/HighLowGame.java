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
			System.out.print("�Է� : (1:  ����, 2: ����) ");
			int  num = scan.nextInt();
			
			if(num == 1 ||  num == 2) {
				int res = (int)(ran.nextDouble()*13)+ 1;
				// int res = (int)(Math.random()*13) +1;	// okay
								
				System.out.println("��ǻ�� ���� : " + res + " ������� ���� : " + num);
				tCount++;
				
				if(num == 1 && res > 7)	{
						wCount++;
						System.out.println("win");
				} else if(num == 2 && res < 7) {
						wCount++;
						System.out.println("win");
				} 
			} else {
				System.out.println("�߸��� �Է� : (1:  ����, 2: ����) ");
				continue;
			}
			
						
			while(true) {
				System.out.print("Countine ? (Y / N) : ");
				String str = scan.next();
				if(str.equalsIgnoreCase("Y"))	break;
				else if(str.equalsIgnoreCase("N"))	break esc;
				else	System.out.println("�߸��� �Է�");
			}
			
		}
		
		// �·� ���
		
		System.out.println("��" + tCount + "���� �����ؼ� " + wCount + " �� �̰���ϴ�.");
		double rate = (int)((wCount/tCount * 100)*100)/100.0;
		System.out.println("�·��� :" +  rate);
	
	}	
}
