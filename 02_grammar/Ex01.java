class Ex01{
	public static void main(String[] args){
		/*
		���� : ������(�Ҽ��� X) < �Ǽ���(�Ҽ��� O)
		-  ������ : byte < short < int(�⺻) < long
		-  �Ǽ��� : float < double(�⺻)
		*/
		
		// float - ���ڵڿ� �ݵ�� f or F ���δ�. �����ϸ� �����߻�
		float su1 = 3.14f;
		System.out.println(su1);

		//su1 = 3.14;	// error - f or F�� ������ �Ǽ��� double�� ó����
		
		// double
		double su2 = 3.14;
		System.out.println(su2);

		su2 = 254.0f;
		System.out.println(su2);
	}
}