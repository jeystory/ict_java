package com.ict.edu5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

// ��ü�� ������ ���� �� �ִ� ���������� ���� �Ǿ�� �Ѵ�.
// Externalizable Interface �� ����Ͽ� ����ȭ�� �����.(�߻�޼ҵ尡 ����)
//  - readExternal
//  -  writeExternal
// �߻� �޼ҵ忡 �ش� ������� �־���� ����ȭ ����� ��. ���࿡ ���� ������ ��󿡼� ����

public class VO implements Externalizable {
	private String name;
	private int age;
	private  double weight;
	private  boolean gender;
	
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

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		//age = (int) in.readObject();
		weight = (double) in.readObject();
		//gender = (boolean) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		//out.writeObject(age);
		out.writeObject(weight);
		//out.writeObject(gender);
	}
}