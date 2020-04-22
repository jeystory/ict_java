package com.ict.edu;

public class Ex03_VO {
	private String name;
	private int age;
	private double height;
	private char hak;

	public Ex03_VO() {
	}

	public Ex03_VO(String name, int age, double height, char hak) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getHak() {
		return hak;
	}

	public void setHak(char hak) {
		this.hak = hak;
	}
	
}
