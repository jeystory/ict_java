package com.ict.edu;

public class Ex11_2 {
	String name;
	int sum;
	double avg;
	String grade;

	public Ex11_2(String name) {
		this.name = name;
	}

	public void sum(int k1, int k2, int k3) {
		sum = k1 + k2 + k3;
		avg();
	}

	// ���
	public void avg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
		grade();
	
	}

	// ����
	public void grade() {

		if (avg >= 90) {grade = "A����";}
		else if (avg >= 80) {grade = "B����";} 
		else if (avg >= 70) {grade = "C����";} 
		else {
			grade = "F����";
		}
		
		print();
	}

	public void print() {
		System.out.println("name : " + name + "\ttotal " + sum + "\tAvg. " + avg + "\tGrade :" + grade);
	}

}
