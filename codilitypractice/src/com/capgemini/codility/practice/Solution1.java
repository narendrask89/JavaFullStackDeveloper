package com.capgemini.codility.practice;

public class Solution1 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { -1, -33 }));
	}

	public static int solution(int[] A) {
		
		int max = Integer.MIN_VALUE;
		
		int arrLength = A.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength; j++) {
				max = Math.max(max, A[i] + A[j] + (i - j));
			}
		}
		return max;
	}

}
