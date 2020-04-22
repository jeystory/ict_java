package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.edu.Ex03;

// JUnit :단위 테스트 도구, 이클립스에서 기본적으로 제공
//JUnit : 단위 테스트 도구, 이클립스에서 기본으로 제공  
//블랙박스 테스트 : 입력값을 넣어서 예상값이 나오면 성공, 나오지 않으면 실패
//assertEquals : 기본형 변수 또는 (객체의 값) 두 개의 값이 같은지 검사한다.
//assertSame : 두 객체가 같은 객체인지 검사 (주소가 같냐?)
//assertNull : 객체가 null 인지 검사
//assertNotNull : 객체가 null이 아닌지 검사 한다.
//assertTrue(a) : a 가 참인지 확인
//assertArrayEquals(a,b) : 배열 a, 배열b가 일치한지 확인

public class Ex03_Test {

	Ex03  t1;
	
	@Before
	public void testBefore() {
		System.out.println("이전");
		t1 = new Ex03();
	}
	
	// 실제 테스트하는 메소드
	@Test
	public void test() {
		int result = t1.add(10,  20);
		assertEquals(30, result);
	}
	
	@Test
	public void test2() {
		int result = t1.sub(10,  20);
		assertEquals(-10, result);
	}
	
	@After
	public void testAfter() {
		System.out.println("bye");
	}

}
