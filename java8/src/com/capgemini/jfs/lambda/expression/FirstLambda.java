package com.capgemini.jfs.lambda.expression;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FirstLambda {

	public static void main(String[] args) {

		// Anonymous class
		FileFilter fileFilter = new FileFilter() {

			public boolean accept(File file) {
				System.out.println("anonymous class");
				return file.getName().endsWith(".java");
			}

		};
		File pathname = new File(
				"D:\\All-Tech\\workspace\\java8\\java8-pluralsight\\src\\com\\nandulabs\\lambda\\expression");
		fileFilter.accept(pathname);

		FileFilter fileFilterLambdaExprs = (file) -> {
			System.out.println("Lambda expression");
			return file.getName().endsWith(".java");
		};
		fileFilterLambdaExprs.accept(pathname);

		Runnable runnable = () -> System.out.println("thread name " + Thread.currentThread().getName());
		Thread thread = new Thread(runnable);
		thread.start();

		CustomInterface customInterface = () -> System.out.println("custom interface");
		customInterface.someMethod();

		Consumer<String> c = System.out::println;
		c.accept("Hello World");

		Comparator<Integer> comparator = Integer::compare;

		List<Customer> list = new ArrayList<>();
		list.add(new Customer("d", "e"));
		list.add(new Customer("r", "g"));
		list.add(new Customer("h", "b"));
		list.add(new Customer("r", "e"));

		System.out.println("With Lambda Expression");
		list.forEach(cust -> System.out.println(cust));
		
		System.out.println("With method reference");
		list.forEach(System.out::println);
		
		Predicate<String> p1 = s -> s.length() >4;
		Predicate<String> p2 = s -> s.length() <4;
		
		Predicate<String> p3 = p1.and(p2);
		
		List<String> lists = Arrays.asList("one","two","three");
		
		List<String> results = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = results::add;
		
		System.out.println("Before foreach Size of result "+ results.size());
		
		lists.forEach(c1.andThen(c2));
		
		System.out.println("Size of result "+ results.size());
		
	}

}
