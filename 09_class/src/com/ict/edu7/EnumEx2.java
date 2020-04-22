package com.ict.edu7;

public class EnumEx2 {
	public enum Item{
		Add, Del, Search, Cancel
	}
	
	public static void main(String[] args) {
		Item a1 = Item.Search;
		
		if(a1 instanceof Object) {
			System.out.println(a1.toString() + "^^");
			System.out.println("OK instanceof Object");
			System.out.println("����� ���� ������ " + a1.ordinal());
		}
		
		Item[] items = Item.values();
		
		System.out.println("items.length : " + items.length);
		
		for (Item n : Item.values()) {
			System.out.println(n + " : " + n.ordinal());
		}
	}
}
