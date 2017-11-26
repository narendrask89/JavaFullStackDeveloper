package com.capgemini.jfs.junit_practice;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	private int input;
	private int expected;

	@Parameters
	public static List<Object[][]> getData(){
		
		return Arrays.asList(
				);
				
	}
	
	public ParameterizedTest(int input, int expected) {
		this.input = input;
		this.expected = expected;
		
	}
}
