package com.ict.edu;

public class Ex01 {
	/* Ŭ����
	���� : ��ü(Object)�� ����� ���� ��� ������ ���� ���� (���赵,��Ǫ�� ��� ǥ�� �Ѵ�.)
	Ŭ������ ������ �ִ� ���� :  ���°�(������), ���, �����ڸ� ������ �ִ�.
	
	1. ���°� = ������(����, ���) = �Ӽ� = �ƴ� ��  => ��� �ʵ�(filed) 
	2. ���  = �޼ҵ� = ���� = �ϴ� ��           => ��� �޼ҵ�(method)
	3. ������ = Ŭ������ ��ü�� ���鶧 ȣ��Ǵ� ��     =>  ������ 

	Ŭ������ ���� : ���, ����ʵ� , ��� �޼ҵ�, ������
	1. ��� : [����������][Ŭ��������] class Ŭ�����̸�{ ����ʵ�,����޼ҵ�,������ }
		1-1. ���������� : Ŭ����, �ʵ�, �޼��忡 ��� ���. 
		                          �ܺο��� ������ �� �ִ� ������ �ܰ踦 ���� (�޼ҵ嵵 ���������ڰ� �ִ�.)
			           public > protected > ���� > private 

					   - public : �������� ���� �ؼ� ��� ����. ����
    				   - protected : ������Ű��  +  ��Ӱ��迡 �ִ� Ŭ������ ���� �ؼ� ��� ����
    				   - ����(����Ʈ) : ���� ��Ű���� �ִ� Ŭ������ ���� �ؼ� ��� ����. �ٸ� ��Ű������ ���� �Ұ�
    			       - private : �ܺο����� ����� ���� �� �� ����, ���� ��������� ���� ����
  
    1-2. Ŭ���� ���� : ���� Ŭ������ ������ ǥ���ϴ� ������ ���ľ�
                   �Ϲ� Ŭ������ �� �κ��� �����Ѵ�.
                   Ư�� Ŭ�����϶� �ش� ���� ����Ѵ�.(final, abstract)

    1-3. class : Ŭ�������� ��Ÿ���� �����

    1-4. Ŭ���� �̸� : �����̸�, ù���� �빮�� ������ �ҹ���, ���� ��� X
                   �� �ܾ� �̻��϶� �ܾ��� ù���ڴ� �빮�� , Ư������ ���X
  
  2. ��� �ʵ�(������ ���) : ���°�, ������, �Ӽ�, Ư¡   
    2-1. ���� : �������� ���� �� �ִ� �����͸� �����ϴ� �޸� ����
              ù���� �ҹ����̸� �� �ܾ� �̻��϶� �ܾ��� ù���ڴ� �빮��, ���� ��� X, Ư������ ���X

    2-2. ��� : �ѹ� ����Ǹ� ������ �� ���� �����͸� �����ϴ� �޸� ����
               ��� ���ڰ� �빮��, �ܾ�� �ܾ� ���̿� '_' �� ����� �� �ִ�.

	3. ��� �޼ҵ�(�޼ҵ�) : ���, ����, �ϴ� ��
                      �ش� �޼ҵ带 ȣ���ϸ� �ش� �޼ҵ� �ȿ� �����ϴ� ������ ����ȴ�.
                      �޼ҵ�� �ٸ� �޼ҵ带 ȣ���� �� �ִ�.
                      �ش� �޼ҵ尡 ������ ȣ���� ������ �ٽ� �ǵ��ư���.
		3-1. ���� : [��������][�޼ҵ�����] ��ȯ�� �޼ҵ��̸�([���ڵ�]){ ���๮�� } 
			1) ���������� class�� �������Ѱ� ����.
			public > protected > ���� > private
			2) �޼ҵ� ���� : ���� �޼ҵ��� ������ ǥ���ϴ� ������ ���ľ�
                   �Ϲ� �޼ҵ�� �� �κ��� �����Ѵ�.
                   Ư�� �޼ҵ��϶� �ش� ���� ����Ѵ�.(static)
			3) ��ȯ�� : �ش� �޼ҵ带 ȣ���� ������ ����� ������ �ǵ��� ���� �� ����� �ڷ����� ���Ѵ�.
                ���࿡ ����� ������ ���� ���� ��� void��� ���� ����Ѵ�.
				��) public static void main(String[] args){}
				���� �޼ҵ��� �̸� main�� main�޼ҵ带 ȣ���� ���� JVM�̴�.
				main�޼ҵ��� ���� ��� ������ ����� ������ ������. (���� : void)   
			4) �޼ҵ��̸� : ���� �̸� ����� ����� ����
				ù���� �ҹ����̸� �� �ܾ� �̻��϶� �ܾ��� ù���ڴ� �빮��, ���� ��� X, Ư������ ���X
			5) ���� : �޼ҵ尡 �����Ҷ� �ʿ��� ������ �ܺο��� ������ ����Ѵ�.
				�ܺ��� ������ �ʿ�������� ������ �����ϴ�.
				�ܺ��� ������ �ʿ��Ҷ��� ������ ������ �ø� �� �ִ�.
				** �޼ҵ��̸��� ���Ƶ� ������ ������ �ڷ����� �ٸ��� �ٸ� �޼ҵ�� �Ǵ��Ѵ�.
				** �����ε� : �ϳ��� Ŭ�����ȿ��� ���� �̸��� ���� �޼ҵ尡 ������ �����ϴ� ���� ����
									��, ������ ������ �ڷ����� �޶�� �Ѵ�.
				** getter(): �޼ҵ带 ȣ���ؼ� �������� ������ �ö� ���. (�޼ҵ� �Լ� �ȿ����� ������ ��)
				** setter(): �޼ҵ带 ȣ���ؼ� �������� ������ �� ���.
	4. ������ : Ŭ������ ��ü�� ���� �� �ѹ� ȣ��Ǿ� ���ȴ�.
		4-1. ���� : ��� �ʵ�(������ ���)�� �ʱⰪ�� ������ �� ���
		4-2. �����ڴ� Ŭ���� �̸��� ����.
            ex) Random Ŭ������ �����ڴ� Random()�̴�.
		4-3. ���� : �޼ҵ�� ������ ��ȯ���� ����.
		4-4. ��� Ŭ������ �⺻������ �����ڸ� �����ϰ� ����.
			�����ڰ� ������ �⺻������ ��ü�� ������ �� ����.(�������̽�)
		4-5. �⺻ �����ڶ� ���ڰ� ���� �����ڸ� ���Ѵ�.  'Ŭ�����̸�()' <- �⺻ ������
		4-6. �����ڰ� ������ ������ �⺻ �����ڰ� �����Ǿ� �ִ� ���̶� ����.
			�����ڰ� ���̸� �ش� �����ڸ� �̿��ؼ� ��ü�� �����ؾ� �Ѵ�.
		4-7. �����ڴ� �����ε��� ����. ��, �ϳ��� Ŭ������ �������� �����ڰ� ������ �� �ִ�.

		
		** �����ڸ� �̿��ؼ� ��ü ���� �ݹ� **
		Scanner scan = new Scanner(System.in);
		Ŭ����    ��������  new  ������; 

		// ��ü�� ����� ���� -> ��� �ʵ�, �޼ҵ带 ����ϱ� ���ؼ�
		// ��� �ʵ�� �޼ҵ带 ����ϱ� ���� ���ٹ� : ��������.����ʵ� or ��������.����޼ҵ�()
		 
		** static�� instance : ��� �ʵ�� ��� �޼ҵ忡 �ش��ϴ� ���� **
		1. instance :
			- instance ��� �ʵ峪 ��� �޼ҵ� : ��ü(object) ������ �� ���� �����Ǵ� �ʵ�� �޼ҵ��� �Ѵ�.
			- heap memory�� ������ �����ϸ鼭 ��� �ʵ峪 ��� �޼ҵ尡 �����Ǵ� ��
			- ���ٹ� : ��ü ��������.���� , ��ü ��������.�޼ҵ�()
			- �Ϲ����� ������ �޼ҵ�� �ν��Ͻ� ������ �޼ҵ��̴�.
		2. static 
			- **��ü ������ ������� �̸� ������� ��� �ʵ�(������ ���), ��� �޼ҵ带 ���Ѵ�.
			- static�̶�� ������ �޸𸮿� �����Ǿ� ���ȴ�.
			- �̸� �տ� �ݵ�� static �̶�� ���� ����ؾ� ��.
			- �ν��Ͻ��� �ٸ��� ��ü�� ������ �ʰ��� ��밡��
			- ���ٹ� : Ŭ���� �̸�.����ǵ�, Ŭ���� �̸�. ����޼ҵ�
			- public static void main(String[] args){}
  */
}