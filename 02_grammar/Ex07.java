class Ex07{
      public static void main(String[] args){
        
	// ±îÆä¸ğÄ« 4500. µÎÀÜ. ³½µ· ¸¸¿ø, tax 10%, ÀÜµ·?
	int money = 10000;
	int su = 2, menu = 4500;
	int total = menu * su;
	int tax = (int)(total * 0.1);
	int change = money - (total + tax);

	System.out.println("order total : " + (int)(total * 1.1));
	System.out.println("change : " + change);

      }
}