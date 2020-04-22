package com.ict.edu2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

//2. ���� ��Ʈ�� (����߽�): ��� ó���� 2byte�� ó�� (�Է�, ���)
//���� ��Ʈ���� ��� :  ���� ��� ���� ������ ���� ������ ������ϱ⿡ ����
//�ֻ��� Ŭ���� : Reader(�Է½�Ʈ��),  Writer(��½�Ʈ��)

//FileOutputSteram  => write(�ƽ�Ű�ڵ�), write(byte[] b) : ����,��.�ҹ��ڸ� ����
//FileWriter       => 2 byte�� ó��, write(String str) ;
//�߰�) BufferedWriter => newLine()�� �̿��ؼ� �ٹٲٱⰡ ����
public class Ex02 {
	public static void main(String[] args) {
		
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test06.txt";
		File file = new File(pathName);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("123456789\n");
			bw.write("Hello\n");
			bw.write("���ѹα�");
			bw.newLine();
			bw.write("true");
			bw.newLine();
			bw.write("����");
			bw.flush();
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(bw != null) fw.close();
				if(fw != null) fw.close();
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}
