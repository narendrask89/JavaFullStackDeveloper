package com.capgemini.codility.practice;

public class ProblemStatement3 {

	public static void main(String[] args) {

		int[] A = new int[] { 0, 1, 2, 2, 3, 5 };
		int[] B = new int[] { 500000, 500000, 0, 0, 0, 20000 };

		System.out.println(new ProblemStatement3().solution(A, B));
	}

	public int solution(int[] A, int[] B) {

		int length = A.length;

		if (length <= 1)
			return 0;
		if (B.length <= 1)
			return 0;

		float[] C = new float[length];
		int count = 0;
		for (int i = 0; i < length; i++) {
			C[i] = A[i] + (float) B[i] / 1000000;
		}

		for (int i = 0; i < length - 1; i++) {
			if (C[i] >= 2.0 && C[i + 1] >= 2.0) {
				count += ((length - 1 - i) * (length - i)) / 2;
				i = length;
			} else {
				for (int j = i + 1; j < length; j++) {
					if ((C[i] * C[j]) >= (C[i] + (C[j]))) {
						count++;
					}
				}
			}
		}
		return count > 1000000000 ? 1000000000 : count;
	}
}
