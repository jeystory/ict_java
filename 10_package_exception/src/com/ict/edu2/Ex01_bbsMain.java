package com.ict.edu2;

import com.ict.edu1.BBS;


public class Ex01_bbsMain extends MySite2 {
	public static void main(String[] args) {
		BBS.setCategory("자유게시판");

		BBS bb1 = new BBS(1, "첫번째 글 제목" , "2019-11-28");
		BBS bb2 = new BBS(2, "두번째 글 제목" , "2019-11-28");
		BBS bb3 = new BBS(3, "세번째 글 제목" , "2019-11-28");
		
		System.out.println(bb1.prn());
		System.out.println(bb2.prn());
		System.out.println(bb3.prn());
		System.out.println("-----------------------------------");
		
		BBS.setCategory("공지사항");
		System.out.println(bb1.prn());
		System.out.println(bb2.prn());
		System.out.println(bb3.prn());
		System.out.println("-----------------------------------");
		
		System.out.println(bb1.site1);	// protected
		System.out.println(bb1.site4);	// public
	}
}
