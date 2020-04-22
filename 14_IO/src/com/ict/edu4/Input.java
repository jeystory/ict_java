package com.ict.edu4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//ObjectInputStream : ��ü �Է� ��Ʈ��
//readObject() => ������ȭ �޼ҵ�
//������ȭ�� ����ȭ �ݴ��  

public class Input {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test10.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// ������ȭ : ����ȭ�� ������ ������� �ǵ����°�
			ArrayList<VO> list = (ArrayList<VO>)ois.readObject();
			for (VO vo : list) {
				System.out.println(vo.getName());
				System.out.println(vo.getAge());
				System.out.println(vo.getWeight());
				System.out.println(vo.isGender());
				System.out.println("=========");
			}
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
