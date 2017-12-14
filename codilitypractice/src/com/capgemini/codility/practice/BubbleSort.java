package com.capgemini.codility.practice;

public class BubbleSort {

	public static void main(String[] args) {

		int[] result = new BubbleSort().bubbleSort(new int[] { 1, 5, 2, 8, 9, 4, 7, 6 });
		for (int i : result) {
			System.out.print(i + ",");
		}
	}

	public int[] bubbleSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;
	}
}
