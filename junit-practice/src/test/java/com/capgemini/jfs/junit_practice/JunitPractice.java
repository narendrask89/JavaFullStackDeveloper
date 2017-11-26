package com.capgemini.jfs.junit_practice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;

public class JunitPractice {

	@BeforeClass
	public static void beforeStaticTest() {
		System.out.println("inside before static test method");
	}

	@Before
	public void beforeTest() {
		System.out.println("Before test");
	}

	@Test
	public void test() {
		System.out.println("in test method");
		assertEquals(5, "Hello".length());
	}

	@Test
	public void test1() {
		System.out.println("in test1 method");
		assertEquals(5, "Hello".length());
	}

	@Test
	public void test2() {
		System.out.println("in test2 method");
		assertEquals(5, "Hello".length());
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test(expected = NullPointerException.class)
	@Category(CategoryPractice.class)
	public void excptionTest() {
		
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("");
		
		String s = null;
		System.out.println("inside exception test method");
		System.out.println(s.length());
	}

	@Test(timeout = 300)
	public void timeoutTest() {
		System.out.println("timeout test");
		for (long i = 0; i < 100000000l; i++) {

		}

	}

	@After
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterClass
	public static void afterStaticTest() {
		System.out.println("inside after static test method");
	}
}
