package com.ict.edu;

public class Ex08_MyTest {
	// 접근제한자 : public > protected > 생략 > private
	// public : 누구나 다 접근 가능
	// protected : 같은 패키지나 다른 패키지 일 경우 상속관계에서만 접근 가능
	// 생략 : 같은 패키지에서만 접근 가능
	// private : 외부에서 접근 불가, 내부 멤버끼리만 접근 가능(보완, 캡슐화)
	String name = "호돌이";
	private int age = 4;
	static final String GENDER = "남";
	private static String lang = "korea";
	private static final String COUNTRY = "대한민국";
	
	public void prn() {
		System.out.println("이름 " + name);
		System.out.println("나이 " + age);
		System.out.println("GENDER " + GENDER);
		System.out.println("lang " + lang);
		System.out.println("COUNTRY " + COUNTRY);
	}
	
	// 메소드를 이용해서 멤버의 정보를 보내기 : getter()
	public int  getAge() {
		return age;
	}
	
	public String getLang() {
		return lang;
	}
	
	public String getCountry() {
		return COUNTRY;
	}
	
	// 메소드를 이용해서 멤버의 정보를 변경 : setter();
	//  인자값을 받아서 멤버의 정보를 변경
	public void setName(String s) {
		name = s;
	}
	
	public void setAge(int k) {
		age =k;
	}
}
