package com.ict.edu2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//  InputStreamReader : ����Ʈ �Է� ��Ʈ���� �����Է� ��Ʈ��
//  InputStream => InputStreamReader => Reader => BufferedReader
// ���(Ű����)�� ���ؼ� �Էµ� ������ ����� ���ϰ� ����ϱ� ����

public class Ex06 {
	public static void main(String[] args) {
		System.out.print("���ϴ� ���� : ");
		//Scanner scan = new Scanner(System.in);
		
		InputStreamReader isr = null;
		BufferedReader br = null;
				
		try {
			isr = new  InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			System.out.println("��ĳ�� ��� ����Ͽ� ���� ���� " + msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(br != null)		br.close();
				if(isr != null)		isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
