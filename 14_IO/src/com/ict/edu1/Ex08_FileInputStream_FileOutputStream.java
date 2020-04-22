package com.ict.edu1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex08_FileInputStream_FileOutputStream {
	public static void main(String[] args) {
		String rPathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "setting.png";
		String wPathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "setting01.png";
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test2";

		// 폴더 생성
		File outFile = new File(pathname2);
		if (!outFile.exists()) {
			outFile.mkdirs();
		}
		// 폴더 + 파일 이름
		File outFile2 = new File(outFile, "설치_1.png");
			
		// Input
		File readFile = new File(rPathName);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		// output
		File writeFile = new File(wPathName);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			// read file
			fis = new FileInputStream(readFile);
			bis = new BufferedInputStream(fis);

			// write 파일
			//fos = new FileOutputStream(writeFile); // 덮어쓰기
			fos = new FileOutputStream(outFile2);
			bos = new BufferedOutputStream(fos);

			int inChar = 0;
			while ((inChar = fis.read()) != -1) {
				bos.write(inChar);
				bos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();
				if (fis != null)
					fis.close();
				if (bis != null)
					bis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
