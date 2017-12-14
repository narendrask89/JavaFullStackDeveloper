package com.capgemini.codility.practice;

public class ProblemStatement1 {

	public static void main(String[] args) {
		System.out.println(new ProblemStatement1().solution(new int[] { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 }));
	}

	public int solution(int A[]) {
		int pits = 0;
		int p = 0, q = -1, r = -1;

		for (int i = 1; i < A.length; i++) {
			if (q < 0 && A[i] >= A[i - 1])
				q = i - 1;
			if ((q >= 0 && r < 0) && (A[i] <= A[i - 1] || i + 1 == A.length)) {
				if (A[i] <= A[i - 1])
					r = i - 1;
				else
					r = i;
				pits = Math.max(pits, Math.min(A[p] - A[q], A[r] - A[q]));
				p = i - 1;
				q = r = -1;
			}
		}
		if (pits == 0)
			pits = -1;

		return pits;
	}

}
