class Ex08{
      public static void main(String[] args){
        
	//3989초 몇시간 몇분 몇조
	int time = 3989;
	int hour = 0, min = 0, sec = 0;

	hour = time / 3600;
	//min = (time - (hour * 3600))/60;
	//sec = time - (hour * 3600) - (min * 60);
	
	int res = time % 3600;
	min = res / 60;	//분
	sec = res % 60;	//초
	

	System.out.println("3989초는 " + hour + "시간 " + min + "분 " + sec + "초입니다.");

      }
}