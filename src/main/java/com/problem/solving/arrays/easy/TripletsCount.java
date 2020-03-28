package com.problem.solving.arrays.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.
 * <p>
 * Output:
 * For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 3 <= N <= 105
 * 1 <= A[i] <= 106
 * <p>
 * Example:
 * Input:
 * 2
 * 4
 * 1 5 3 2
 * 3
 * 3 2 7
 * Output:
 * 2
 * -1
 * <p>
 * Explanation:
 * Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 */

public class TripletsCount {

	public static int getTripletsOptimal(int[] elements) {
		Arrays.sort(elements);

		int triplets = 0;
		if (elements.length >= 3) {
			for (int count = elements.length - 1; count > 1; count--) {
				int p1 = 0;
				int p2 = count - 1;

				while (p1 < p2) {
					if (elements[count] == elements[p1] + elements[p2]) {
						triplets++;
						p1++;
						p2--;
					} else if (elements[count] < elements[p1] + elements[p2]) {
						p2--;
					} else {
						p1++;
					}
				}
			}
		}
		return triplets == 0 ? -1 : triplets;
	}

	public static int getTriplets(int[] elements) {

		int triplets = 0;
		if (elements.length >= 3) {
			for (int count = 0; count < elements.length - 1; count++) {
				for (int count1 = count + 1; count1 < elements.length; count1++) {
					int no = elements[count] + elements[count1];
					for (int count2 = 0; count2 < elements.length; count2++) {
						if (no == elements[count2]) {
							triplets++;
						}
					}
				}
			}
		}
		return triplets == 0 ? -1 : triplets;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcs = Integer.parseInt(br.readLine());

		while (tcs-- > 0) {
			int size = Integer.parseInt(br.readLine());
			int[] arr = new int[size];

			String[] str = br.readLine().split("\\s+");

			for (int count = 0; count < size; count++) {
				arr[count] = Integer.parseInt(str[count]);
			}
			System.out.println(getTripletsOptimal(arr));
		}
	}

}
