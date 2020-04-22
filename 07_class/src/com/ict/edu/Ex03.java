package com.ict.edu;

public class Ex03 {
	String[][] str = new String[5][8];
    // 총점 계산 (void) 
	public void sum(String[] name, int[] kor, int[] eng,  int[] math) {
		for (int i = 0; i < str.length; i++) {
			str[i][0] = name[i];
			
			str[i][1] = String.valueOf(kor[i]);
			str[i][2] = String.valueOf(eng[i]);
			str[i][3] = String.valueOf(math[i]);
			int sum = kor[i] + eng[i] + math[i] ;
			
			str[i][4] = String.valueOf(sum);
		}
			
		avg();
	}
    // 평균 계산(void)
	public void avg() {
		for (int i = 0; i < str.length; i++) {
		    str[i][5] = String.valueOf((int)(Integer.parseInt(str[i][4]) /3.0*10)/10.0);
		}
		hak();
	}
    // 학점  계산(void)
	public void hak() {
		for (int i = 0; i < str.length; i++) {
			if(Double.parseDouble(str[i][5])>=90) {
				str[i][6] = "A";
			}else if(Double.parseDouble(str[i][5])>=80) {
				str[i][6] = "B";
			}else if(Double.parseDouble(str[i][5])>=70) {
				str[i][6] = "C";
			}else {
				str[i][6] = "F";
			}
			// 순위 초기값 
			str[i][7] = "1";
		}
		rank();
	}
    // 순위 (void)
	public void rank() {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(Integer.parseInt(str[i][4])< Integer.parseInt(str[j][4])) {
					int k = Integer.parseInt(str[i][7]);
					str[i][7] = String .valueOf(k+1);
				}
			}
		}
		sort();
	}
    // 정렬(void)
	public void sort() {
		String[] tmp = new String[8];
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(Integer.parseInt(str[i][4]) < Integer.parseInt(str[j][4])) {
					tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
		prn();
	}
	
    // 출력(void)
	public void prn() {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
