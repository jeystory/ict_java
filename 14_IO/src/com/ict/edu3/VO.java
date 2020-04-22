package com.ict.edu3;

import java.io.Serializable;

// 객체의 정보를 담을 수 있는 멤버변수들로 구성 되어야 한다.
// Serializable Interface 를 사용하여 직렬화를 만든다.(추상메소드가 없음)
// *** 모든 멤버 변수들이 직렬화 대상이 된다.
// 멤버중 직렬화 대상에서 제외하려면 transient 예약어를 멤버 앞에 써준다.
// 제외 대상인 멤버의 값은 기본적인 값으로 대체

// 직렬화를 하는 이유는 객체 단위로 저장, 이동을 하기 위한 것
public class VO implements Serializable {
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	public VO() {
		// TODO Auto-generated constructor stub
	}

	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
}
