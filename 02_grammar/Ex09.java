class Ex09{
      public static void main(String[] args){
        
	// 2시간 40분 30초는 몇초인가
	int res_sec = 0;
	int hour = 2, min = 40, sec = 30;

	res_sec = (2 * 60 + 40) * 60 + 30;

	System.out.println(hour + "시간 " + min + "분 " + sec + "초는 "+ res_sec + "초입니다.");

      }
}