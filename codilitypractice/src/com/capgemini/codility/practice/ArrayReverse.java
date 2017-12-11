package com.capgemini.codility.practice;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] result = reverseArray(arr);
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	public static int[] reverseArray(int[] arr) {

		if (arr == null)
			return null;

		int arrLength = arr.length;
		int[] result = new int[arrLength];

		for (int i = 0; i < arrLength / 2; i++) {
			int k = arrLength - i - 1;
			result[i] = arr[k];
			result[k] = arr[i];
		}
		return result;
	}
}
