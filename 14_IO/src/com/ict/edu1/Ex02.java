package com.ict.edu1;

import java.io.File;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test01.txt";
		File file = new File(pathName);
		boolean res;
		
		try {
			res = file.createNewFile();
			if(res) {
				System.out.println("success of  file creation ");
			}else {
				System.out.println("file exist,  faile to create  file");
			}
		} catch (IOException e) {
			System.out.println("wrong path of the file, fail to create file");
		}
		
		
		try {
			System.out.println("������ : "  + file.getAbsolutePath());
			System.out.println("����� : "  + file.getPath());
			System.out.println("����ȭ��� : "  + file.getCanonicalPath());
			System.out.println("�����̸� : "  + file.getName());
			System.out.println("���� ���丮 : "  + file.getParent());
			System.out.println("======================" );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String pathName2 = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test01";
		File file2 = new File(pathName2);
		res = file2.mkdir();
		
		if(res) {
			System.out.println("create directory");
		} else
		{
			System.out.println("fail to create the diectory. already existed.");
		}
		
		res = file.delete();		// delete file
		if(res ) {
			System.out.println("success to delete file");
		} else {
			System.out.println("fail to delete file");
		}
		
		res = file2.delete();	// delete directory
		if(res ) {
			System.out.println("success to delete directory");
		} else {
			System.out.println("fail to delete directory");
		}
	
	}
}
