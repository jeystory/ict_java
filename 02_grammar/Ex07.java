class Ex07{
      public static void main(String[] args){
        
	// �����ī 4500. ����. ���� ����, tax 10%, �ܵ�?
	int money = 10000;
	int su = 2, menu = 4500;
	int total = menu * su;
	int tax = (int)(total * 0.1);
	int change = money - (total + tax);

	System.out.println("order total : " + (int)(total * 1.1));
	System.out.println("change : " + change);

      }
}