package com.ict.edu5;

public class Monster implements Fight, Move {
	private String name;
	
	public Monster(String name) {
		this.name = name;
	}
	
	@Override
	public void walking() {
		System.out.println(name + ">> " + "걷습니다.");
		
	}

	@Override
	public void run() {
		System.out.println(name + ">> " + "달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println(name + ">> " + "점프를 합니다.");
		
	}

	@Override
	public void attack() {
		System.out.println(name + ">> " + "공격을 했습니다.");
		
	}

	@Override
	public void shield() {
		System.out.println(name + ">> " + "방어를 했습니다.");
		
	}

}
