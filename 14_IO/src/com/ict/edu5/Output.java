package com.ict.edu5;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//ObjectOutputStream : ��ü ��� ��Ʈ��
//writeObject() => ����ȭ �޼ҵ�

public class Output {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test11.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// �������� ��ü�� ������ ��Ƽ� ������
			VO vo1 = new VO("��浿", 35, 84.7, true);
			VO vo2 = new VO("��浿", 15, 34.0, false);
			VO vo3 = new VO("�ڱ浿", 30, 74.4, true);
			VO vo4 = new VO("���浿", 57, 54.7, true);
			
			// �������� ��ü�� �ϳ��� ��Ƽ� �����ϴ� �� : �÷���
			// �÷��� �� �迭 ���·� : ArrayList, Vector(�ǽð� ó���� �� ���)
			ArrayList<VO> list = new ArrayList<VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			
			
			// ��ü ����ȭ
			oos.writeObject(list);
			oos.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
