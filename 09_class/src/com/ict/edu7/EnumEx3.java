package com.ict.edu7;

public class EnumEx3 {
	public enum Item{
		Add(5, "ADD"), Del(11, "DEL"), Search(2, "SEARCH"), Cancel(22, "CANCEL");
		private final int var;
		private final String var2;
		
		Item(int v, String v1){
			var = v;
			var2 = v1;
		}
		
		public int getVar() {
			return var;
		}
		
		public String getString() {
			return var2;
		}
		
		public static void main(String[] args) {
			Item test = Item.Add;
			System.out.println(test.Add);
			System.out.println(Item.valueOf("Add"));
			System.out.println("=======");
			
			for (Item n : Item.values()) {
				System.out.println(n + " : " +n.getVar());
				System.out.println(n + " : " +n.getString());
			}
			
			Item[] items = Item.values();
			System.out.println(items.length);
		
			for(int i =0 ; i<items.length;i++) {
				System.out.print(items[i].getVar() + ", ");
				System.out.println(items[i].getString());
				
			}
		}
	}
}
