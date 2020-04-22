package com.ict.edu1;
import com.ict.edu2.MySite2;

public class BBS extends MySite2 {
	// 전체 게시물의 수
	private static int count = 0;
	// 게시물 분류
	private static String category;
	//글번호
	private  int num;
	//글제목
	private  String title;
	// 작성일시
	private  String regDate;
	
	public BBS(int num, String title, String regDate) {
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		count++;
	}

	public String prn() {
		 return "글 분류 = " + category+", 전체 글 수 = "+ count+ 
	    		   "BBS [num= "+num+", title=" + title+", regDate=" +regDate + "]";
	}
	
	public void prn2() {
		// 부모클래스가 다른 패키지에 존재할때 
		// protected는 가져 올 수 있다.
		System.out.println(site1);
		// defeault는  가져 올수 없다. 
		//System.out.println(site2);
		// private 가져 올수 없다.
		//System.out.println(site3);
		// public 가져올 수 있다.
		System.out.println(site4);
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		BBS.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		BBS.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	

}
