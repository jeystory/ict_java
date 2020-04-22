package com.ict.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ict.edu.Ex04;

public class Ex04_Test {

	Ex04 test1;
	@Before
	public void testBefore() {
		test1 = new Ex04();
	}
	@Test
	public void test() {
		assertEquals(24, test1.mul(3, 8));
	}

}
