package com.capgemini.codility.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemStatement4 {

	public static void main(String[] args) {
		int[] test1 = new int[] { 2, 2, 2, 2, 2, 3, 4, 4, 4, 6 };
		int[] test2 = new int[] { 1, 1, 1, 1, 50 };
		System.out.println(new ProblemStatement4().solution(test2));
	}

	public int solution(int[] A) {

		Arrays.sort(A);
		int n = A.length;

		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());

		int count = 1, result = 0, prevCount = 1;
		int firstArrValue = A[0];
		int prevValue = 0;
		for (int i = 1; i < A.length; i++) {
			if (firstArrValue == A[i]) {
				if (list.contains(A[i])) {
					count++;
				}
			} else {
				firstArrValue = A[i];
				prevCount = count;
				count = 1;
				if (result < prevCount) {
					result = prevCount;
				}
			}
			if (prevCount < count) {
				prevValue = A[i];
			}
		}
		if (prevCount < count) {
			result = count;
		} else if (result < prevCount) {
			result = prevCount;
		}
		return result > n / 2 ? prevValue : -1;
	}
}
