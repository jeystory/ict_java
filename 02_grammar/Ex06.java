class Ex06{
      public static void main(String[] args){
        // 입력
	String name = "홍길동";
        int math = 90, kor = 80, eng = 80 ;
        
	// 처리 - 비지니스 로직
	int sum = math + kor + eng ;
        double avg = (int)((sum/3.0) * 10) /10.0 ;

	      
        System.out.println("이름: " + name);
	System.out.println("총점: " + sum);
	System.out.println("평균: " + avg);   
      }
}