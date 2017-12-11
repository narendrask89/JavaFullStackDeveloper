package com.capgemini.codility.practice;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int k = 4;

		int[] result = new ArrayRotation().solution(arr, k);
		
		if (result != null) {
			for (int i : result) {
				System.out.print(i + " ");
			}
		}
	}

	public int[] solution(int[] arr, int k) {

		if (arr == null)
			return null;

		int arrLength = arr.length;
		int[] result = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			result[(i + k) % arrLength] = arr[i];
		}
		return result;
	}
}
