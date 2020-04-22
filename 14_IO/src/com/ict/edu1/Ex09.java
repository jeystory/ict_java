package com.ict.edu1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream과 DataOutputStream
// 기본 자료형의 데이터를 주고 받을 때 사용
// ** 반드시 입력 순서와 출력 순서를 맞춰야 한다.
//  기본 생성자가 없어서 BufferedInputStream, BufferedOutputStream처럼 
// FileInputStream 과 FileOutputStream을 이용한다.
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
			
			// wrtieXXX() : XXX 는 기본 자료형
			dos.writeInt(975);
			dos.writeLong(41L);
			dos.writeChar('C');
			dos.writeDouble(24.12);
			dos.writeFloat(21.369f);
			dos.writeBoolean(true);
			dos.flush();
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// readXXX() : XXX 는 기본 자료형 
			// *** 반드시 writeXXX() 로 입력한 순서대로 읽어서 처리해야 함
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
