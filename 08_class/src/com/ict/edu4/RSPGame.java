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
			System.out.print("�Է� : (1:  ����, 2: ����, 3:��) ");
			int  num = scan.nextInt();
			
			if(num == 1 ||  num == 2 || num == 3) {
				int res = (int)(ran.nextDouble()*3)+1;
				
				String cIn = "", pIn ="";
				if(num == 1)		pIn = "����";
				else if(num == 2)	pIn = "����";
				else if(num == 3)	pIn = "��";
				
				if(res == 1)			cIn = "����";
				else if(res == 2)	cIn = "����";
				else	 if(res == 3)	cIn = "��";
				
				System.out.println("��ǻ�� ���� : " + cIn + " ������� ���� : " + pIn);
				tCount++;
				if(num == 1 && res == 3)		{wCount++; System.out.println("win");}
				else if(num== 2 && res ==  1)	{wCount++;System.out.println("win");}
				else if(num==3 && res == 2)	{wCount++;System.out.println("win");}
				
			} else {
				System.out.println("�߸��� �Է� : (1:  ����, 2: ����, 3:��) �� �Է� ");
				continue;
			}
			
						
			while(true) {
				System.out.print("Countine ? (Y / N) : ");
				String str = scan.next();
				if(str.equals("Y") || str.equals("y"))	break;
				else if(str.equals("N") || str.equals("n"))	break esc;
				else	System.out.println("�߸��� �Է�");
			}
			
		}
		
		// �·� ���
		
		System.out.println("��" + tCount + "���� �����ؼ� " + wCount + " �� �̰���ϴ�.");
		double rate = (int)((wCount/tCount * 100)*100)/100.0;
		System.out.println("�·��� :" +  rate);
	
	}	
	
}
