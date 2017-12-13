package com.capgemini.model;

public class Product {

	private String name;
	private int weight;

	public Product(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", weight=" + weight + "]";
	}
}
