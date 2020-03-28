package com.problem.solving.arrays.easy;

//https://practice.geeksforgeeks.org/problems/equilibrium-point/0/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
 * <p>
 * Input:
 * The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.
 * <p>
 * Output:
 * For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 106
 * 1 <= Ai <= 108
 * <p>
 * Example:
 * Input:
 * 2
 * 1
 * 1
 * 5
 * 1 3 5 2 2
 * <p>
 * Output:
 * 1
 * 3
 * <p>
 * Explanation:
 * Testcase 1: Since its the only element hence its the only equilibrium point.
 * Testcase 2: For second test case equilibrium point is at position 3 as elements below it (1+3) = elements after it (2+2).
 */

public class EquilibriumPoint {

	public static int getPoint(int sum, int[] elements) {
		if (elements.length == 1) {
			return 1;
		}
		int leftSum = 0;
		for (int count = 0; count < elements.length; count++) {
			sum = sum - elements[count];
			if (leftSum == sum) {
				return count + 1;
			}
			leftSum = leftSum + elements[count];
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcs = Integer.parseInt(br.readLine());
		int sum;

		while (tcs-- > 0) {
			sum = 0;
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];

			String[] str = br.readLine().split("\\s+");

			for (int count = 0; count < size; count++) {
				arr[count] = Integer.parseInt(str[count]);
				sum = sum + arr[count];
			}
			System.out.println(getPoint(sum, arr));
		}
	}

}
