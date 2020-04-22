package com.ict.edu;

public class Ex13_StringEx {
	public static void main(String[] args) {
		// String class �ֿ� �޼ҵ�(���)

		// 1.String Ŭ���� ���� ���
		String str1 = "Korea";
		char ch1[] = { '��', '��' };
		String str2 = new String(ch1);
		String str3 = new String("Korea");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// ����� �ٸ��� - String '==' ������� �ʴ´�.
		//  String �Ǵ� ��ü���� '==' ������ �ּҰ��� �����İ� ���°��̴�. 
		// ��ü�� ����Ǵ� ���� �����Ͱ��� �ƴ϶� �ּҰ� ���� ����
		if(str1 == str3)		System.out.println("����");
		else 						System.out.println("�ٸ���");
		
	
		// 2.�ֿ� �޼ҵ�
// 1) charAt(int index) : char
		// - int index�� �����̸�, �ǹ̴� �迭�� ��ġ��, 0���� ~ length -1
		// - char : ��ȯ�� - �޼ҵ尡 ���� �� ����� �ڷ����� ��
		// - charAt : ��ġ���� �޾Ƽ� �ش� ��ġ�� �����ϴ� ���ڸ� �����Ͽ� ��ȯ.
		String msg = "���ѹα� �� Korea";

		char ch = msg.charAt(3);
		System.out.println(ch);

		ch = msg.charAt(7);
		System.out.println(ch);
		
// 2) length() : int
		// - �ش� ���ڿ��� ���̸� ���������� ��ȯ.
		int res = msg.length();
		System.out.println(res);
		
		System.out.println("++++++++++++++++++++++++++++++");
		// �迭�� ���� : length
		// String�� ���� : length()
		// msg ������ �ϳ��� ��������
		for (int i = 0; i < msg.length(); i++) {
			System.out.print(msg.charAt(i) + " ");
		}
				
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		// �޽����� ������ �ҹ��ڸ� ��������
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')
				System.out.print(msg.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		// �޽����� ������ �ҹ��ڸ� �빮��
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z')
				System.out.print((char) (msg.charAt(i) - 32) + " ");
			else {
				System.out.print(msg.charAt(i) + " ");
			}
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		// �빮��, �ҹ��ڸ� ������ ���ڸ� ���
		for (int i = 0; i < msg.length(); i++) {
			if ((msg.charAt(i) >= 'a' && msg.charAt(i) <= 'z') || (msg.charAt(i) >= 'A' && msg.charAt(i) <= 'Z'))
				continue;
			else
				System.out.print(msg.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
	
// 3) concat(String str) : String
		// - �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� �߰��ϴ� ��
		// - ���ڿ�����(+)�� ���� ȿ��
		msg = "���ѹα�";
		String msg2 = msg.concat(" KOREA");
		System.out.println(msg2);
		System.out.println("+++++++++++++++++++++++++++++++++++");

		String msg3 = msg + " korea";
		System.out.println(msg3);
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
// 4) contains(CharSequence s) : boolean
		// - CharSequence s -> String���� ����
		// - �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� �����ϸ� true �ƴϸ� false
		// - ��ҹ��� ����
		msg = "KOREA @ ���ѹα�";
		// boolean result = msg.contains('Q'); Error -> char�� ���ڷ� ����� �� ����
		boolean result = msg.contains("Q");	//false
		System.out.println(result);
		
		result = msg.contains("@");		//true
		System.out.println(result);
		
		result = msg.contains("���ѹ�"); // true
		System.out.println(result);
		
		result = msg.contains("rea"); 	// false -> ��ҹ��� ����
		System.out.println(result);	
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		// 5) equals(String str) : boolean
		// - �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� ������ true, ��ҹ��ڸ� ����
		// - ���ڿ��� '==' �� ����� �� ����. �� ������� equals�� ���

		// 6) equalsIgnoreCase(String str) : boolean
		// �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� ������ true, ��ҹ��� �������� ����.
		// ***** equals�� equalsIgnoreCase�� string�� ��ġ�ϴ��� Ȯ��
		// '==' �� ���ڳ� char�� ���. ���ڿ����� ����� �� ����

		msg = "korea";
		msg2 = "KOREA";
		msg3 = "Korea";
		System.out.println(msg.equals(msg2));					// false
		System.out.println(msg.equals("korea"));					// true
		System.out.println(msg.equalsIgnoreCase(msg2));	// true
		
// 7) toLowerCase() : String
		// �ش繮�ڿ��� �ҹ��ڷ� ����
		msg = "java8 Javascript �ڹ�8 �ڹٽ�ũ��Ʈ JSP";
		System.out.println(msg.toLowerCase());	//java8 javascript �ڹ�8 �ڹٽ�ũ��Ʈ jsp

// 8) toUpperCase() : String
		// �ش繮�ڿ��� �����ڷ� ����
		System.out.println(msg.toUpperCase());	//JAVA8 JAVASCRIPT �ڹ�8 �ڹٽ�ũ��Ʈ JSP

		System.out.println(msg2.equals("korea".toUpperCase()));	//true
		
// 9-1) indexOf(int ch) 							: int -> ó������ �˻��ؼ� ���ڷ� ���� char �Ǵ� ������ ��ġ���� ��ȯ
		// indexOf(String str)					: int -> ó������ �˻��ؼ� ���ڷ� ���� ���ڿ��� ��ġ���� ��ȯ
		// - int ch�� char�� ���.
		//  - �ش� ���ڿ��� ������ ���ڳ� ���ڿ��� ó�� ��ġ���� ���ڷ� ǥ��
		// 	���� :  ���ڳ� ���ڿ��� �������� ������ -1�� ��ȯ

		msg = "java, jsp, android";
		res = msg.indexOf('a');	// index -> 1
		System.out.println(res);
		res = msg.indexOf("av");	// index -> 1
		System.out.println(res);
		res = msg.indexOf("a");	// index -> 1
		System.out.println(res);
		res = msg.indexOf(97);
		System.out.println(res);
		res = msg.indexOf("k");	// -1
		System.out.println(res);
		
		
// 9-2 indexOf(int ch, int fromIndex) : int
		// indexOf(String str, int fromIndex) : int
		// - fromIndex�� ������ġ.
		// - fromIndex�� ������ ������ġ���� �ش� ���ڿ��� ������ ���ڳ� ���ڿ��� ó�� ��ġ���� ���ڷ� ǥ��
		// - ** �ι�°, ����° ���ڳ� ���ڿ��� ��ġ���� ã�� �� ���
		res = msg.indexOf('a', 2);
		System.out.println(res);
		res = msg.indexOf('a', msg.indexOf('a') + 1);
		System.out.println(res);
		
		res = msg.indexOf('a' , msg.indexOf('a', res ) + 1);
		System.out.println(res);

// 10) lastIndexOf(int ch) : int
		// lastIndexof(String str) : int
		// �ش� ���ڿ����� ���ڷ� ���� ������ ������ ��ġ�� ��ȯ.
		res = msg.lastIndexOf('a');
		System.out.println(res);

// 11) isEmpty() : boolean
		// �ش� ���ڿ��� ��� ������ true, ������ false
		msg = "java JAVA �ڹ�";
		System.out.println(msg.isEmpty());	//false

		msg = "";
		System.out.println(msg.isEmpty());	//true
		
		//msg = null;			//���� �߻�  NullPointerException
		//boolean b = msg.isEmpty();

// 12) replace(char oldChar, char newChar) : String
		// replace(String oldString, String newString) : String
		// �ش� ���ڸ� �ٸ� ���ڷ� ����(ġȯ)
		System.out.println("replace()===========================");
		msg = "���ѹα�";
		String msg4 = msg.replace("���ѹα�", "KOREA");	// KOREA
		System.out.println(msg4);
		String msg5 = msg4.replace('O', 'o');					// KoREA
		System.out.println(msg5);
		String msg6 = msg.replace(msg, msg + " ������");	// �븸�α� ������
		System.out.println(msg6);		
		
// 13) substring(int beginIndex) : String
		// - �ش� ���ڿ��� ������ġ���� ������ ���ڿ� ��ȯ(����)
		// substring(int beginIndex, int endIndex) : String
		// - �ش� ���ڿ��� ������ġ���� ����ġ������ ���ڿ� ��ȯ(����), �� ��ġ�� �������� ������ ����.
		System.out.println("subString()===========================");
		msg = "010-7777-9999";
		String msg7 = msg.substring(4);	//7777-9999
		System.out.println(msg7);

		String msg8 = msg.substring(4, 8); // 8(���ڸ�)-4(���ڸ�) = 4���� ���ڰ� ��µȴ�.	
		System.out.println(msg8);	//7777

		msg = "770707-1";
		String msg9 = msg.substring(0, 2); // 2-0=2
		System.out.println(msg9);	//77
	
		msg9 = msg.substring(7,8); 
		System.out.println(msg9);	//1
	
		// ���� �ϳ��� �����ϱ�
		for(int i=0;i<msg.length();i++) {
			msg9 = msg.substring(i, i+1);
			System.out.println(msg9);
		}
		
// 14) toString()
		// Object(��ü) : ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
		// String������ toString() :  ���ڿ� ��ü�� ��ȯ. (��ü �ڱ��ڽ��� ȣ��)
		msg = "Java Version 8";
		System.out.println(msg);
		System.out.println(msg.toString());
		System.out.println("========================");

// 15) trim() : String
		// - �ش� ���ڿ��� �յڿ� �ʿ���� ���鹮�� ����
		msg = "   java Java test      ";
		System.out.println(msg + " : " + msg.length());
		msg = msg.trim();
		System.out.println(msg + " : " + msg.length());
		System.out.println("========================");
		
// 16) valueOf(�⺻�ڷ���) : String
		// - ���� �⺻ �ڷ����� �޾Ƽ� ���ڿ�(String)�� �����Ŵ
		boolean b1 = true;
		char c1 = 'A';
		int n1 = 34;
		long n2 = 56L;
		float n3 = 3.14f;
		double n4 = 13.410;

		// System.out.println(b1+10); //����Ұ�
		System.out.println(c1 + 10 + ":" + (int) (c1 + 10));
		System.out.println(n1 + 10);
		System.out.println(n2 + 10);
		System.out.println(n3 + 10);
		System.out.println(n4 + 10);
		System.out.println("========================");

		System.out.println(String.valueOf(b1) + 10); // true10 ���� ���
		System.out.println(String.valueOf(c1) + 10); // A10
		System.out.println(String.valueOf(n1) + 10); // 3410
		System.out.println(String.valueOf(n2) + 10); // 5610
		System.out.println(String.valueOf(n3) + 10); // 3.1410
		System.out.println(String.valueOf(n4) + 10); // 13.41910
		
		System.out.println(b1 + "10" ); // valueOf�� ���� ����� ������ �޸𸮿� �δ��� ���ܼ� ��õ���� ����
		System.out.println(c1 + "10" );
		System.out.println(n1 + "10" );
		System.out.println(n2 + "10" );
		System.out.println(n3 + "10" );
		System.out.println(n4 + "10" );	//	System.out.println(n4 + "" + 10);	 �̷��� �ص� ��

// 17) Wrapper class  : �⺻ �ڷ����� ��ü�� ���鶧 ����ϴ� Ŭ����(�ڵ����� ��ȯ��)
		// 							-> �⺻ �ڷ��� ���·� �̷���� ���ڸ� ��¥ �ڷ������� �����ϴ� Ŭ����

		//17-1) boolean�� : Boolean.parseBoolean();
		String op1 = "true";
		boolean r_op1 = Boolean.parseBoolean(op1);
		if (r_op1) {
			System.out.println(r_op1);
		}
		System.out.println("========================");

		// 17-2) int �� : Integer.parseInt();
		String op2 = "127";
		System.out.println(op2 + 10);

		int r_op2 = Integer.parseInt(op2);
		System.out.println(r_op2 + 10);

		// 17-3) long�� : Long.parseLong();
		String op3 = "1234L";
		System.out.println(op3 + 10);
		// long r_op3 = Long.parseLong(op3); // �����߻� - 1234L 'L'�� �پ ���ڷ� ����� �ټ� ���.
		// System.out.println(r_op3+10);

		// 17-4) double�� : Double.parseDouble();
		String op4 = "12.7";
		System.out.println(op4 + 10);
		double r_op4 = Double.parseDouble(op4);
		System.out.println(r_op4 + 10);

		// 17-5) char���� ������ Ŭ������ �������� ����
		// String Ŭ������ CharAt() ���
		String op5 = "P";
		System.out.println(op5 + 5);

		char r_op5 = op5.charAt(0);
		System.out.println((char) (r_op5 + 5));
		

		// 18) getBytes() : byte[]
		// �ش繮�ڿ��� byte[]�� ����� ��.(�����, ��Ʈ��ũ���� ����)
		// byte �ڷ����̹Ƿ� ����, ������ ��ҹ���, �Ϻ� Ư�����ڸ� ǥ�� ����(ASCII code�̸� 127�ڸ� ����)
		// *** �ڹ������(java I/O)�� �� ���
		msg = "java 123456 JAVA";
		byte[] by = msg.getBytes();

		for (int i = 0; i < by.length; i++) {
			System.out.println(by[i] + " : " + (char) (by[i]));
		}
		
		// 19) toCharArray() : char[]
		// - ��� ���ڸ� char[]�� �����Ѵ�.
		// - char �ڷ����̹Ƿ� ��� ���ڰ� ��밡��
		// - getByte() ASCII Code�� ������ �� ����.
		msg = "java2 ���ѹα� �� ���� JSP";
		char ch2[] = msg.toCharArray();
		for (int i = 0; i < ch2.length; i++) {
			System.out.println(ch2[i]);
		}
		System.out.println();
		System.out.println("========================");
	
	
		// 14) split(String regex) : String[]
		// �ش� ���ڿ��� ���ڷ� ���� ���ڿ��� �������� ����� �迭�� ����
		msg = "java,jsp,android";
		String[] arr = msg.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// �����ڰ� �ش� ���ڿ��� ������ ù��° �迭�� ��� ����.
		String[] arr2 = msg.split("/");
		System.out.println(arr2[0]);

//20.   split(String regex) : String[]
		//split(String regex, int limit) : String[]
		// �ش� ���ڿ��� ���ڷ� ���� ���ڿ� �������� ����� �迭�� �־��ش�
		//  regex : �����ڸ� ���Ѵ�.
		// - int limit: �迭�� ũ�⸦ ����
		System.out.println("==split ==================");
		msg = "java,jsp,spring, android,python";
		String[] arr3 = msg.split(",");

		for (int i = 0; i < arr3.length; i++)
			System.out.println(arr3[i]);
		System.out.println("========================");
		
		String[] arr4 = msg.split(" ");
		for (int i = 0; i < arr4.length; i++)
			System.out.println(arr4[i]);
		System.out.println("========================");

		String[] arr5 = msg.split(",", 2);
		for (int i = 0; i < arr5.length; i++)
			System.out.println(arr5[i]);
		System.out.println("========================");

		String[] arr6 = msg.split(",", 3);
		for (int i = 0; i < arr6.length; i++)
			System.out.println(arr6[i]);
		System.out.println("========================");
		
		arr6 = msg.split(",", 6); // �ʰ��ϸ� �� ���������.
		for (int i = 0; i < arr6.length; i++) {
			System.out.println(arr6[i]);
		}
	
		System.out.println("=======");
		//System.out.println(arr[5]);	//  �ʰ��ϸ� �� ���������.
		System.out.println("=======");
		msg = "010-9393-7777";
		arr[1] = "*****";
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
		System.out.println("========================");

		System.out.print(arr[0] + "-" + arr[1] + "-" + arr[2]);
		System.out.println();
		System.out.println("========================");
		
	}
}
