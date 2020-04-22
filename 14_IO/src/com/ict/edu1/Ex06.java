package com.ict.edu1;

import java.io.File;
import java.io.FileInputStream;


//1. byte stream(��� �߽�) : ��� ó���� 1byte�� ����� ó��
//	����Ʈ�� �̷���� ��� ����(����, �Ҹ�, ����, ���� �� ��� ������ ����)
//	�ֻ��� Ŭ���� : InputStream(�Է�), OutputStream( ���)

//FileInputStream �ֿ�޼ҵ�
//	- read() : int  => ascii code(����)  -> �ϳ��� ���� ��ȯ : �ѱ��ڸ� �о���� �޼ҵ�
//				�� �̻� ���� �� ���� �� -1 ��ȯ 
//         		�񿵾�� ���ڸ� ���� �� ���� => ASCII code(0~9, a~z, A~Z, �Ϻ� Ư�����ڸ� ����)
//				���ڷ� ���� ���ؼ��� char ����ȯ�� �ʿ�


// - read(byte[] b) : int => 1 byte�� �迭�� �����ϰ� ���� �� �ִ� ����ŭ ��ȯ�ϱ�
// 										** ũ�� ������ �ؾ��Ѵ�.

// - close() : �Է� ��Ʈ�� �ݾ��ֱ�


public class Ex06 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test02.txt";
		File file = new File(pathName);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			//int k = fis.read();
			//System.out.println(k + "," + (char)(k));
			// 13 - (CR)carriage return, 10 : (LF) line feed
			
			// ��ü ���� �о����
			// �׸�, ����, ����, ����, �߶󳻱� ���̱⿡ ���
			
			// read()
			int k = 0;
			/*
			while(true) {
				k = fis.read();
				if(k ==  -1)	break;
				System.out.println(k + "," + (char)(k));
			}
			*/
			/*
			while((k = fis.read()) != -1) {
				System.out.println(k + "," + (char)(k));
			}
			*/
			
			// read(byte[] b) : int 
			// �迭�� ũ��� ������ ũ��(length)��ŭ
			byte[] b = new byte[(byte)(file.length())];
			// ������ ������ byte �迭 b�� ����
			fis.read(b);
			
			for (byte c : b) {
				System.out.println(c + " : " + (char)c);
			}
			System.out.println("=======");
			
			
			//String class �̿��ϸ� �񿵾�� �ڵ� ��밡��
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (Exception e) {
		
		} finally {
			try {
				if(fis != null)	fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
