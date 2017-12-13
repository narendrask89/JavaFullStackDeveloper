package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.capgemini.model.Product;

public class CollectionDemo {

	public static void main(String[] args) {

		Product window = new Product("Window", 35);
		Product door = new Product("Door", 25);
		Product floor = new Product("Floor", 10);

		Collection<Product> products = new ArrayList<>();

		products.add(window);
		products.add(door);
		products.add(floor);

		System.out.println(products);

		Iterator<Product> iterator = products.iterator();

		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (product.getWeight() > 20) {
				System.out.println(product);
			} else {
				iterator.remove();
			}
		}

		System.out.println(products);
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		System.out.println(products.contains(floor));
		System.out.println(products.contains(door));
		
		
	}
}
