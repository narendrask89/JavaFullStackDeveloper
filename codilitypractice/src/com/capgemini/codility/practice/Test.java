package com.capgemini.codility.practice;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		System.out.println(new Test().solution(new int[] { 0, 3, 3, 7, 5, 3, 11, 1 }));
	}

	public int solution(int[] A) {

		int length = A.length;
		int[] temp = A;
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			int low_bound = i;
			for (int j = 0; j < length; j++) {
				if (temp[j] > temp[i] && (low_bound == i || temp[low_bound] > temp[j])) {
					low_bound = j;
				}
			}
			if (low_bound != i) {
				for (int j = 0; j < length; j++) {
					if (temp[j] == temp[low_bound] || (temp[j] == temp[i] && i < j)) {
						result[j] = (Math.max(i, j) - Math.min(j, j));
					}
				}
			}
		}
		Arrays.sort(result);
		for (int i : result) {
			System.out.println(i);
		}
		return result[result.length-1];
	}

}
