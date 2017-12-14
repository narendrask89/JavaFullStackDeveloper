package com.capgemini.codility.practice;

public class ProblemStatement17 {

	public static void main(String[] args) {
		System.out.println(new ProblemStatement17().solution(new int[] { 3, 5, 6, 3, 3, 5 }));
	}

	public int solution(int[] A) {

		int result = 0;
		int arrLength = A.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (A[i] == A[j])
					result++;
			}
		}
		if(result > 1000000000){
			return 1000000000;
		}
		return result;
	}
}
