package com.ict.edu;

public class Ex11_1 {
	// �հ�
	public int sum(int k1, int k2, int k3) {
		return k1+k2+k3;
	}
	// ���
	public double avg(int k1) {
		return (int)(k1/3.0*10)/10.0;
	}
	
	// ����
	public String grade(double k1) {
		String str_grade = "";
		
		if(k1>= 90) {
			str_grade  = "A����";
		} else if(k1>= 80) {
			str_grade  = "B����";
		} else if(k1>= 70) {
			str_grade  = "C����";
		} else {
			str_grade  = "F����";
		}
		return str_grade;
	}
	
}
