package com.ict.edu1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream�� DataOutputStream
// �⺻ �ڷ����� �����͸� �ְ� ���� �� ���
// ** �ݵ�� �Է� ������ ��� ������ ����� �Ѵ�.
//  �⺻ �����ڰ� ��� BufferedInputStream, BufferedOutputStreamó�� 
// FileInputStream �� FileOutputStream�� �̿��Ѵ�.
public class Ex09 {
	public static void main(String[] args) {
		String pathName = "C:"+File.separator+"study"+File.separator+"util" +File.separator+ "test03.txt";
		File file = new File(pathName);
		
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fos =new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			// wrtieXXX() : XXX �� �⺻ �ڷ���
			dos.writeInt(975);
			dos.writeLong(41L);
			dos.writeChar('C');
			dos.writeDouble(24.12);
			dos.writeFloat(21.369f);
			dos.writeBoolean(true);
			dos.flush();
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXX() : XXX �� �⺻ �ڷ��� 
			// *** �ݵ�� writeXXX() �� �Է��� ������� �о ó���ؾ� ��
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			//System.out.println(dis.readFloat());
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if(dis != null)	dis.close();
				if(fis != null)		fis.close();
				if(dos != null)	dos.close();
				if(fos != null)	fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
