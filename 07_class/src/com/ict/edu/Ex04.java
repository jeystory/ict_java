package com.ict.edu;

public class Ex04 {
	String name;
	int sum;
	double avg;
	String grade;
	int rank = 1;
	
	// ��� �ʵ��� ���� �����ϴ� �޼ҵ�
	public void setName(String k) {
		name = k;
	}
	
	public void setSum(int k) {
		sum = k;
	}
	
	public void play() {
		avg = (int)(sum/3.0*10)/10.0;
		if(avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 70) grade = "C";
		else grade = "F";
	}
	
	public void play2() {
		
	}
}
