package com.ict.edu5;

public class Character implements Action, Fight, Move{

	String name;
	public Character(String name) {
		this.name = name;
	}
	@Override
	public void attack() {
		System.out.println(name + ">> " + "공격");
		
	}

	@Override
	public void shield() {
		System.out.println(name + ">> " + "수비");
	}

	@Override
	public void pickup() {
		System.out.println(name + ">> " + "줍다");
		
	}

	@Override
	public void walking() {
		System.out.println(name + ">> " + "걷다");
		
	}

	@Override
	public void run() {
		System.out.println(name + ">> " + "뛰다");
		
	}

	@Override
	public void jump() {
		System.out.println(name + ">> " + "점프");
		
	}

}
