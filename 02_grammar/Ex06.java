class Ex06{
      public static void main(String[] args){
        // �Է�
	String name = "ȫ�浿";
        int math = 90, kor = 80, eng = 80 ;
        
	// ó�� - �����Ͻ� ����
	int sum = math + kor + eng ;
        double avg = (int)((sum/3.0) * 10) /10.0 ;

	      
        System.out.println("�̸�: " + name);
	System.out.println("����: " + sum);
	System.out.println("���: " + avg);   
      }
}