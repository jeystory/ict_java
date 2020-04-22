package com.ict.edu5;

public class TestMain {
	public static void main(String[] args) {
		Character ch = new Character("주인공");
		ch.walking();
		ch.run();
		ch.attack();
		ch.shield();
		
		Monster mon = new Monster("악당");
		mon.walking();
		mon.run();
		mon.attack();
		mon.shield();
	}
}
