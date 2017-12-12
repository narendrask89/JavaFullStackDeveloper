package com.capgemini.codility.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { -1, -3 }));
	}

	public static int solution(int[] A) {
		
		if(A == null)
			return 0;

		int arrLength = A.length;
		if(arrLength < 1 && arrLength > 100000)
			return 0;
			
		Arrays.sort(A);
		int result = 0;
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		boolean flag = false;
		boolean checkFlag = false;
		int smallest = A[arrLength - 1];
		for (int i = arrLength - 1; i > 0; i--) {
			if (A[i] < 0) {
				flag = true;
				continue;
			} else {
				flag = false;
				if (A[i - 1] < smallest) {
					smallest = smallest - 1;
				}

				if (!list.contains(smallest)) {
					checkFlag = true;
					result = smallest;
				}
			}
			if (!checkFlag) {
				result = A[arrLength - 1] + 1;
			}
			if (flag) {
				result = 1;
			}
		}
		return flag ? 1 : result;
	}
}
