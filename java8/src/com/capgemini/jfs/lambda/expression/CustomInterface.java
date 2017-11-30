package com.capgemini.jfs.lambda.expression;

@FunctionalInterface
public interface CustomInterface {

	void someMethod();
	
	boolean equals(Object object);
	
	default void defaultMethod() {
		System.out.println("default method");
	}
	
	static void staticMethod() {
		System.out.println("static method");
	}
}
