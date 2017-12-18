package com.capgemini.codility.practice;

public class ProblemStatement15 {

	public static void main(String[] args) {

		String testcase1 = "(())))(";
		String testcase2 = "((";
		String testcase3 = "((())))(";

		System.out.println(new ProblemStatement15().solution(testcase3));
	}

	public int solution(String s) {

		int strLength = s.length();
		int openCount = 0;
		int closeCount = 0;
		int j = 0;

		for (int i = 0; i < (s.length() % 2 == 0 ? s.length() / 2 : (s.length() + 1) / 2); i++) {
			if (s.charAt(i) == '(') {
				openCount++;
			}
		}

		for (int i = 0; i < strLength - 1; i++) {
			if (s.charAt(i) == ')') {
				closeCount++;
				if (openCount == closeCount) {
					j = openCount + closeCount;
					break;
				}
			}
		}
		return j;
	}
}
