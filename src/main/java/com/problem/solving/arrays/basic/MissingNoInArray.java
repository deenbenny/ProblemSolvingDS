package com.problem.solving.arrays.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.
 * <p>
 * Output:
 * Print the missing number in array.
 * <p>
 * Constraints:
 * 1 ≤ T ≤ 200
 * 1 ≤ N ≤ 107
 * 1 ≤ C[i] ≤ 107
 * <p>
 * Example:
 * Input:
 * 2
 * 5
 * 1 2 3 5
 * 10
 * 1 2 3 4 5 6 7 8 10
 * <p>
 * Output:
 * 4
 * 9
 * <p>
 * Explanation:
 * Testcase 1: Given array : 1 2 3 5. Missing element is 4.
 */

public class MissingNoInArray {

	public static int getMissingElement(int size, int[] elements) {
		Arrays.sort(elements);
		for (int count = 0; count < elements.length; count++) {
			if (elements[count] != (count + 1)) {
				return count + 1;
			}
		}
		return size;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcs = Integer.parseInt(br.readLine());

		while (tcs-- > 0) {
			int size = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split("\\s+");
			int[] arr = new int[str.length];

			for (int count = 0; count < str.length; count++) {
				arr[count] = Integer.parseInt(str[count]);
			}

			if (arr.length == size) {
				System.out.println("-1");
			} else {
				System.out.println(getMissingElement(size, arr));
			}
		}
	}

}
