package com.ict.edu1;
/*
 * File Ŭ���� : Ư�� ��ġ�� �����ϴ� �����̳� ���丮(����)�� ó���ϴ� Ŭ����
 * - ������ : File(String ���), File(String �������, String �������)
 * 			File(URI uri), File(File �������, String �������)
 * - �޼ҵ� : createNewFile() : ���� ����
 * 			mkdir(), mkdirs() : ���丮 ����
 * 			delete()
 * 			exists() : ���� ����
 * 			isDirectory() : ���丮 ����
 * 			isFile() : ���� ����
 * 			list() : Ư�� ��ġ�� ������ �迭�� ����
 * 			getName() : �̸� ��ȯ
 * 			length() : ������ ũ�� byte 
 * 			getPath() : ����ּ�
 * 			getAbsolutePath() : �����ּ�
 * 			getCanonicalPath() : ����ȭ �ּ�
 */

import java.io.File;

public class Ex01 {
	public static void main(String[] args) {
		//String pathName = "C:\\study\\util";	//  �������� ǥ��� �ּ�
		//String pathName = "C:/study/util";
		//�ü���� ������� ����ϴ� �ּ�
		String pathName = "C:"+File.separator+"study"+File.separator+"util";		
		File file = new File(pathName);
		String[] list = file.list();
		for (String k : list) {
			System.out.println(k);
					
			File file2 = new File(pathName, k);
			if(file2.isDirectory())	{
				// ���丮�� ũ�� X
				System.out.println("���丮 " + file2);
			} else {
				System.out.println("���� : " + file2 + ", ũ��� : "+  file2.length() + "byte");
			}
		}
				
	}
} 
