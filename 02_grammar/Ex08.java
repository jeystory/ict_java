class Ex08{
      public static void main(String[] args){
        
	//3989�� ��ð� ��� ����
	int time = 3989;
	int hour = 0, min = 0, sec = 0;

	hour = time / 3600;
	//min = (time - (hour * 3600))/60;
	//sec = time - (hour * 3600) - (min * 60);
	
	int res = time % 3600;
	min = res / 60;	//��
	sec = res % 60;	//��
	

	System.out.println("3989�ʴ� " + hour + "�ð� " + min + "�� " + sec + "���Դϴ�.");

      }
}