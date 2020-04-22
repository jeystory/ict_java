package com.ict.edu3;

public class EX03 {
	String name;
	int kor, eng, math;
	int sum;
	double avg;
	String grade;
	int rank = 1;
	
	public EX03() {}
	
	public EX03(String name ,int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 멤버 필드의 값을 변경하는 메소드
	
	public void setSum() {
		sum = kor + eng + math;
		play();
	}
	

	
	public void play() {
		avg = (int)(sum/3.0*10)/10.0;
		if(avg >= 90) grade = "A";
		else if (avg >= 80) grade = "B";
		else if (avg >= 70) grade = "C";
		else grade = "F";
	}
	

}
