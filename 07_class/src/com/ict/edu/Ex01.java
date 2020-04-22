package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		String[][] arr = new String[5][8]; 
		
		String[] p1 = {"Hong", "90", "90", "90", "90.0", "270", "A", "1"};
		String[] p2 = {"kim", "70", "70", "70", "70.0", "210", "C", "1"};
		String[] p3 = {"Lee", "95", "95", "95",  "95.0","285", "A", "1"};
		String[] p4 = {"Park", "80", "80", "80", "80.0", "240", "B", "1"};
		String[] p5 = {"Go", "85", "85", "85",  "85.0", "255", "B", "1"};
				
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		arr[4] = p5;
		
		// rank 
		// string -> number : Integer.parseInt(), Double.parseDouble()
		// number -< string : String.valueOf(int or double)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][5])  < Integer.parseInt(arr[j][5]))	
				{
					int k = Integer.parseInt(arr[i][7]);
					arr[i][7] = String.valueOf(k+1);
				}
				
			}
		}
		
		// sort
		String[] temp = new String[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][5])  < Integer.parseInt(arr[j][5]))	
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		// print
		System.out.println("name\t kor\t eng\t math\t Avg\t sum\t grade\t rank\t");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length; j++) {
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}
}
