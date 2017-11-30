package com.capgemini.jfs.lambda.expression.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.capgemini.jfs.lambda.expression.Customer;

public class FirstStreamExample {

	public static void main(String[] args) {

		List<Customer> list = new ArrayList<>();
		list.add(new Customer("d", "e"));
		list.add(new Customer("r", "g"));
		list.add(new Customer("h", "b"));
		list.add(new Customer("r", "e"));

		Stream<Customer> stream = list.stream();
		Consumer<Customer> c = System.out::println;
		stream.forEach(c);

		Stream<String> streams = Stream.of("one", "two", "three", "four");

		Predicate<String> p1 = s -> s.length() > 3;
		streams.filter(p1).forEach(System.out::println);
	}

}
