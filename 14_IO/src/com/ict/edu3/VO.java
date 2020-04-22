package com.ict.edu3;

import java.io.Serializable;

// ��ü�� ������ ���� �� �ִ� ���������� ���� �Ǿ�� �Ѵ�.
// Serializable Interface �� ����Ͽ� ����ȭ�� �����.(�߻�޼ҵ尡 ����)
// *** ��� ��� �������� ����ȭ ����� �ȴ�.
// ����� ����ȭ ��󿡼� �����Ϸ��� transient ���� ��� �տ� ���ش�.
// ���� ����� ����� ���� �⺻���� ������ ��ü

// ����ȭ�� �ϴ� ������ ��ü ������ ����, �̵��� �ϱ� ���� ��
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
