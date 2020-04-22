package com.ict.edu1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1. byte stream(��� �߽�) : ��� ó���� 1byte�� ����� ó��
// 						����Ʈ�� �̷���� ��� ����(����, �Ҹ�, ����, ���� �� ��� ������ ����)
// 						�ֻ��� Ŭ���� : InputStream(�Է�), OutputStream( ���)

// FileOutputStream �ֿ�޼ҵ�
// write(int b) : int  => ASCII code(����)  -> �ϳ��� ����
//						int  ��ſ� char�� �־ ����� �� ����
//						ASCII code(0~9, a~z, A~Z, �Ϻ� Ư�����ڸ� ����)

// write(byte[] b) : int => 1 byte�� �迭�� �����ϰ� ���� �� �ִ� ����ŭ ��ȯ�ϱ�
// flush() : write()�Ŀ� �ݵ�� ����
// close() : ���µ� ��Ʈ�� �ݱ� ( finally���� ó����)

// �߰� : BufferedOutputStream : ���� ��Ʈ�� ������ �����ϱ� ���ؼ� �⺻������ ����ϴ� Ŭ����
//         ȥ�ڼ��� ����� �� ����. �ݵ�� OutputStream�� �Բ� ���

public class Ex05 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test02.txt";
		
		File file = new File(pathName);
		FileOutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			out = new  FileOutputStream(file);	// �����
			//out = new  FileOutputStream(file, true);	// �̾�� 
			
			// BufferedOutputStream
			// ��Ʈ�� ü�� ��� : ��Ʈ���� ��Ʈ�� ���� 
			bos = new BufferedOutputStream(out);
			
			
			//  �ѱ��� ����
			bos.write(65);	// �빮�� 'A'
			bos.flush();
			
		
			
			// ���� ���� �ѹ��� ����
			byte[] b = {'j', 'a', 'v', 'a', 13, 10, 'b', 'o', 'y'};
			bos.write(b);
			bos.flush();
			
			////// write(int b), write(byte[] b) :  ASCII code�� ��밡�� /////////////////
			
			// String class �̿밡�� -  �񿵾�� ���� ��밡��
			String msg = "\nHello\n�ȳ�\n123\n����";
			byte[] b2 = msg.getBytes();
			bos.write(b2);
			bos.flush();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(bos != null)	bos.close();
					if(out != null) 	out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
