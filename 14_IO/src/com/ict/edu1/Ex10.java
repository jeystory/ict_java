package com.ict.edu1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

//DataInputStream�� DataOutputStream �� ��ü�ϴ� Ŭ���� ����.

//PrintStream �� ��� ������ �ڷ����� ����� �� �ִ�.
// ������ ȭ�� �Ǵ� File �� ����Ѵ�

//PrintWriter�� ����, OutputStream, Writer�� ���� ��� ����
public class Ex10 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test04.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.print('C');
			ps.print(3.141);
			ps.print(47);
			ps.print(false);
			ps.print(13.145f);
			ps.println(147L);
			ps.println("Hello");
			ps.println("���ѹα�");
			ps.flush();
			
			System.out.println("������");
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(ps != null) 	ps.close();
				if(bos != null)	bos.close();
				if(fos != null)	fos.close();
				
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
		
	}
}