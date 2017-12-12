package com.capgemini.codility.practice;

public class Solution2 {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { -1, -33 }));
	}

	public static int solution(int[] A) {
		
		int[] sumA = new int[A.length];
		for (int i = 0; i < sumA.length; i++) {
			sumA[i] = A[i]-i;
		}
		
		int maxA = Integer.MIN_VALUE;
		int indexA = -1;
		for (int i = 0; i < sumA.length; i++) {
			if(sumA[i] > maxA){
				maxA = sumA[i];
				indexA = i;
			}
		}
		
		int[] sumI = new int[A.length];
		for (int i =0; i < A.length; i++)
		{
		      sumI[i] = A[i] - i;
		}
		 
		int maxI = Integer.MIN_VALUE;
		int maxIIndex = -1;
		for (int i =0; i < A.length; i++)
		{
		     if (sumI[i] > maxI)
		     {
		          maxI = sumI[i];
		          maxIIndex = i;
		     }
		}
		return maxI;
	}

}
