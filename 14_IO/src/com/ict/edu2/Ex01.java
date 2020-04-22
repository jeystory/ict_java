package com.ict.edu2;

import java.io.File;
import java.io.FileWriter;

//2. ���� ��Ʈ�� (����߽�): ��� ó���� 2byte�� ó�� (�Է�, ���)
//���� ��Ʈ���� ��� :  ���� ��� ���� ������ ���� ������ ������ϱ⿡ ����
//�ֻ��� Ŭ���� : Reader(�Է½�Ʈ��),  Writer(��½�Ʈ��)

//FileOutputSteram  => write(�ƽ�Ű�ڵ�), write(byte[] b) : ����,��.�ҹ��ڸ� ����
//FileWriter       => 2 byte�� ó��, write(String str) ;
//BufferedWriter => newLine()�� �̿��ؼ� �ٹٲٱⰡ ����
public class Ex01 {
	public static void main(String[] args) {
		
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test05.txt";
		File file = new File(pathName);
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write("123456\n");
			fw.write("Hello~~\n");
			fw.write("���ѹα�");
			fw.write("true");
			fw.write("����");
			fw.flush();
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}
}
