package com.ict.edu1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//1. byte stream(��� �߽�) : ��� ó���� 1byte�� ����� ó��
// 						����Ʈ�� �̷���� ��� ����(����, �Ҹ�, ����, ���� �� ��� ������ ����)
// 						�ֻ��� Ŭ���� : InputStream(�Է�), OutputStream( ���)

// FileOutputStream �ֿ�޼ҵ�
// write(int b) : int  => ascii code(����)  -> �ϳ��� ����
//						int  ��ſ� char�� �־ ����� �� ����
//						ASCII code(0~9, a~z, A~Z, �Ϻ� Ư�����ڸ� ����)

// write(byte[] b) : int => 1 byte�� �迭�� �����ϰ� ���� �� �ִ� ����ŭ ��ȯ�ϱ�
// flush() : write()�Ŀ� �ݵ�� ����
// close() : ���µ� ��Ʈ�� �ݱ� ( finally���� ó����)
public class Ex04 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test01.txt";
		
		File file = new File(pathName);
		FileOutputStream out = null;
		try {
			out = new  FileOutputStream(file);	// �����
			//out = new  FileOutputStream(file, true);	// �̾�� 
			
			//  �ѱ��� ����
			out.write(65);	// �빮�� 'A'
			out.flush();
			
			// ascii code�� ��ſ� char�� ���� �Է�
			out.write('J');	// �빮�� 'J'
			out.write('A');	// �빮�� 'J'
			out.write('V');	// �빮�� 'J'
			out.write('A');	// �빮�� 'J'
			out.flush();
			
			// ���� ���� �ѹ��� ����
			byte[] b = {'j', 'a', 'v', 'a', 13, 10, 'b', 'o', 'y'};
			out.write(b);
			out.flush();
			
			////// write(int b), write(byte[] b) :  ascii code�� ��밡�� /////////////////
			
			// String class �̿밡�� -  �񿵾�� ���� ��밡��
			String msg = "\n Hello \n �ȳ� \n 123 \n ����";
			byte[] b2 = msg.getBytes();
			out.write(b2);
			out.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(out != null) out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
