package com.ict.edu5;

public class TestMain {
	public static void main(String[] args) {
		Character ch = new Character("���ΰ�");
		ch.walking();
		ch.run();
		ch.attack();
		ch.shield();
		
		Monster mon = new Monster("�Ǵ�");
		mon.walking();
		mon.run();
		mon.attack();
		mon.shield();
	}
}
