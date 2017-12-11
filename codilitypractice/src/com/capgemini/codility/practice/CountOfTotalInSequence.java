package com.capgemini.codility.practice;

public class CountOfTotalInSequence {

	public static void main(String[] args) {
		System.out.println(new CountOfTotalInSequence().countOfTotal(10));
	}

	public int countOfTotal(int n) {
		int result = n * (n + 1) / 2;
		return result;
	}
}
