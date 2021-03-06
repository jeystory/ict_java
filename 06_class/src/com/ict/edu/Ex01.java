package com.ict.edu;

public class Ex01 {
	/* 클래스
	정의 : 객체(Object)를 만들기 위한 모든 정보를 담은 파일 (설계도,거푸집 등로 표현 한다.)
	클래스가 가지고 있는 정보 :  상태값(데이터), 기능, 생성자를 가지고 있다.
	
	1. 상태값 = 데이터(변수, 상수) = 속성 = 아는 것  => 멤버 필드(filed) 
	2. 기능  = 메소드 = 동작 = 하는 것           => 멤버 메소드(method)
	3. 생성자 = 클래스를 객체로 만들때 호출되는 것     =>  생성자 

	클래스의 구조 : 헤더, 멤버필드 , 멤버 메소드, 생성자
	1. 헤더 : [접근제한자][클래스종류] class 클래스이름{ 멤버필드,멤버메소드,생성자 }
		1-1. 접근제한자 : 클래스, 필드, 메서드에 모두 사용. 
		                          외부에서 접근할 수 있는 권한의 단계를 말함 (메소드도 접근제한자가 있다.)
			           public > protected > 생략 > private 

					   - public : 누구나다 접근 해서 사용 가능. 공용
    				   - protected : 같은패키지  +  상속관계에 있는 클래스만 접근 해서 사용 가능
    				   - 생략(디폴트) : 같은 패키지에 있는 클래스만 접근 해서 사용 가능. 다른 패키지에서 접근 불가
    			       - private : 외부에서는 절대로 접근 할 수 없음, 내부 멤버끼리는 접근 가능
  
    1-2. 클래스 종류 : 현재 클래스의 종류를 표시하는 일종의 수식어
                   일반 클래스는 이 부분을 생략한다.
                   특정 클래스일때 해당 예약어를 사용한다.(final, abstract)

    1-3. class : 클래스임을 나타내는 예약어

    1-4. 클래스 이름 : 저장이름, 첫글자 대문자 나머지 소문자, 공백 사용 X
                   두 단어 이상일때 단어의 첫글자는 대문자 , 특수문자 사용X
  
  2. 멤버 필드(변수와 상수) : 상태값, 데이터, 속성, 특징   
    2-1. 변수 : 언제든지 변할 수 있는 데이터를 저장하는 메모리 공간
              첫글자 소문자이며 두 단어 이상일때 단어의 첫글자는 대문자, 공백 사용 X, 특수문자 사용X

    2-2. 상수 : 한번 저장되면 변경할 수 없는 데이터를 저장하는 메모리 공간
               모든 글자가 대문자, 단어와 단어 사이에 '_' 를 사용할 수 있다.

	3. 멤버 메소드(메소드) : 기능, 동작, 하는 것
                      해당 메소드를 호출하면 해당 메소드 안에 존재하는 내용이 실행된다.
                      메소드는 다른 메소드를 호출할 수 있다.
                      해당 메소드가 끝나면 호출한 곳으로 다시 되돌아간다.
		3-1. 구성 : [접근제한][메소드종류] 반환형 메소드이름([인자들]){ 실행문들 } 
			1) 접근제한은 class의 접근제한과 같음.
			public > protected > 생략 > private
			2) 메소드 종류 : 현재 메소드의 종류를 표시하는 일종의 수식어
                   일반 메소드는 이 부분을 생략한다.
                   특정 메소드일때 해당 예약어를 사용한다.(static)
			3) 반환형 : 해당 메소드를 호출한 곳으로 결과를 가지고 되돌아 갈때 그 결과의 자료형를 말한다.
                만약에 결과를 가지고 가지 않은 경우 void라는 예약어를 사용한다.
				예) public static void main(String[] args){}
				위의 메소드의 이름 main고 main메소드를 호출한 것은 JVM이다.
				main메소드의 일이 모두 끝나면 결과를 보내지 않은다. (이유 : void)   
			4) 메소드이름 : 변수 이름 만드는 방법과 동일
				첫글자 소문자이며 두 단어 이상일때 단어의 첫글자는 대문자, 공백 사용 X, 특수문자 사용X
			5) 인자 : 메소드가 실행할때 필요한 정보를 외부에서 받을때 사용한다.
				외부의 정보가 필요없을때는 생략이 가능하다.
				외부의 정보가 필요할때는 인자의 갯수를 늘릴 수 있다.
				** 메소드이름이 같아도 인자의 갯수와 자료형이 다르면 다른 메소드로 판단한다.
				** 오버로딩 : 하나의 클래스안에서 같은 이름을 가진 메소드가 여러개 존재하는 것을 말함
									단, 인자의 갯수나 자료형는 달라야 한다.
				** getter(): 메소드를 호출해서 변수값을 가져갈 올때 사용. (메소드 함수 안에서는 보내는 것)
				** setter(): 메소드를 호출해서 변수값을 변경할 때 사용.
	4. 생성자 : 클래스를 객체로 만들 때 한번 호출되어 사용된다.
		4-1. 목적 : 멤버 필드(변수와 상수)의 초기값을 지정할 때 사용
		4-2. 생성자는 클래스 이름과 같다.
            ex) Random 클래스의 생성자는 Random()이다.
		4-3. 구조 : 메소드와 같으나 반환형이 없다.
		4-4. 모든 클래스는 기본적으로 생성자를 소유하고 있음.
			생성자가 없으면 기본적으로 객체를 생성할 수 없다.(인터페이스)
		4-5. 기본 생성자란 인자가 없는 생성자를 말한다.  '클래스이름()' <- 기본 생성자
		4-6. 생성자가 보이지 않으면 기본 생성자가 생략되어 있는 것이라 간주.
			생성자가 보이면 해당 생성자를 이용해서 객체를 생성해야 한다.
		4-7. 생성자는 오버로딩이 가능. 즉, 하나의 클래스에 여러개의 생성자가 존재할 수 있다.

		
		** 생성자를 이용해서 객체 생성 반법 **
		Scanner scan = new Scanner(System.in);
		클래스    참조변수  new  생성자; 

		// 객체를 만드는 이유 -> 멤버 필드, 메소드를 사용하기 위해서
		// 멤버 필드와 메소드를 사용하기 위한 접근법 : 참조변수.멤버필드 or 참조변수.멤버메소드()
		 
		** static과 instance : 멤버 필드와 멤버 메소드에 해당하는 내용 **
		1. instance :
			- instance 멤버 필드나 멤버 메소드 : 객체(object) 생성될 때 같이 생성되는 필드와 메소드라고 한다.
			- heap memory의 영역을 차지하면서 멤버 필드나 멤버 메소드가 생성되는 것
			- 접근법 : 객체 참조변수.변수 , 객체 참조변소.메소드()
			- 일반적인 변수와 메소드는 인스턴스 변수와 메소드이다.
		2. static 
			- **객체 생성과 상관없이 미리 만들어진 멤버 필드(변수와 상수), 멤버 메소드를 말한다.
			- static이라는 별도의 메모리에 생성되어 사용된다.
			- 이름 앞에 반드시 static 이라는 예약어를 사용해야 함.
			- 인스턴스와 다르게 객체를 만들지 않고도 사용가능
			- 접근법 : 클래스 이름.멤버피드, 클래스 이름. 멤버메소드
			- public static void main(String[] args){}
  */
}
