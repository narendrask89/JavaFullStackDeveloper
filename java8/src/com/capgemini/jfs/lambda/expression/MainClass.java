package com.capgemini.jfs.lambda.expression;

public class MainClass {

	public static void main(String[] args) {

		// write anonymous class
		MyInterface myInterface = new MyInterface() {
			@Override
			public void myMethod() {
				System.out.println("inside anonymous class with method signature");
			}
		};

		myInterface.myMethod();

		// Lambda Expression
		MyInterface myInterface2 = () -> System.out.println("Lambda Expression");
		myInterface2.myMethod();
	}

}

@FunctionalInterface
interface MyInterface {

	void myMethod();
}