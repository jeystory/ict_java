package com.ict.edu2;

public class Ex06 {
	public void add(String s1, String s2) {
			add(Integer.parseInt(s1), Integer.parseInt(s2) );
	}

	public void add(String s1, int s2) {
		add(Integer.parseInt(s1), s2);
	}

	public void add(int s1, String s2) {
		add(s1, Integer.parseInt(s2) );
	}

	public void add(int s1, int s2) {
		System.out.println(s1 + "+" + s2 + "=" + (s1+s2));
	}
}
