package com.ict.edu1;
/*
 * File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
 * - 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
 * 			File(URI uri), File(File 상위경로, String 하위경로)
 * - 메소드 : createNewFile() : 파일 생성
 * 			mkdir(), mkdirs() : 디렉토리 생성
 * 			delete()
 * 			exists() : 존재 유무
 * 			isDirectory() : 디렉토리 유무
 * 			isFile() : 파일 유무
 * 			list() : 특정 위치의 내용을 배열로 저장
 * 			getName() : 이름 반환
 * 			length() : 파일의 크기 byte 
 * 			getPath() : 상대주소
 * 			getAbsolutePath() : 절대주소
 * 			getCanonicalPath() : 정규화 주소
 */

import java.io.File;

public class Ex01 {
	public static void main(String[] args) {
		//String pathName = "C:\\study\\util";	//  윈도우즈 표기법 주소
		//String pathName = "C:/study/util";
		//운영체제와 상관없이 사용하는 주소
		String pathName = "C:"+File.separator+"study"+File.separator+"util";		
		File file = new File(pathName);
		String[] list = file.list();
		for (String k : list) {
			System.out.println(k);
					
			File file2 = new File(pathName, k);
			if(file2.isDirectory())	{
				// 디렉토리는 크기 X
				System.out.println("디렉토리 " + file2);
			} else {
				System.out.println("파일 : " + file2 + ", 크기는 : "+  file2.length() + "byte");
			}
		}
				
	}
} 
