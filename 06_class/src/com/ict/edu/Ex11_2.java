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

	// 평균
	public void avg() {
		avg = (int) (sum / 3.0 * 10) / 10.0;
		grade();
	
	}

	// 학점
	public void grade() {

		if (avg >= 90) {grade = "A학점";}
		else if (avg >= 80) {grade = "B학점";} 
		else if (avg >= 70) {grade = "C학점";} 
		else {
			grade = "F학점";
		}
		
		print();
	}

	public void print() {
		System.out.println("name : " + name + "\ttotal " + sum + "\tAvg. " + avg + "\tGrade :" + grade);
	}

}
