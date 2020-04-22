package com.ict.edu2;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03_DCPhone dCPh = new Ex03_DCPhone("Ä«¸Þ¶ó");
		System.out.println("Digital Camera phone");
		dCPh.takePicture();
		dCPh.call();
		dCPh.text();
		
		EX03_MP3Phone mP3Ph = new EX03_MP3Phone("MP3");
		System.out.println("MP3 phone");
		mP3Ph.listenMusic();
		mP3Ph.call();
		mP3Ph.text();

		Ex03_GamePhone gPh = new Ex03_GamePhone("Game");
		System.out.println("Game phone");
		gPh.playGame();
		gPh.call();
		gPh.text();
	}
}
