package com.ict.edu5;

public class Character implements Action, Fight, Move{

	String name;
	public Character(String name) {
		this.name = name;
	}
	@Override
	public void attack() {
		System.out.println(name + ">> " + "����");
		
	}

	@Override
	public void shield() {
		System.out.println(name + ">> " + "����");
	}

	@Override
	public void pickup() {
		System.out.println(name + ">> " + "�ݴ�");
		
	}

	@Override
	public void walking() {
		System.out.println(name + ">> " + "�ȴ�");
		
	}

	@Override
	public void run() {
		System.out.println(name + ">> " + "�ٴ�");
		
	}

	@Override
	public void jump() {
		System.out.println(name + ">> " + "����");
		
	}

}
