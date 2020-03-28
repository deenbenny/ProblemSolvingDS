package com.problem.solving.arrays.easy;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0/
//https://www.youtube.com/watch?v=96YQObqYVCk&feature=youtu.be

/**
 * Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
 * <p>
 * Input:
 * The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.
 * <p>
 * Output:
 * For each testcase, print the sorted array.
 * <p>
 * Constraints:
 * 1 <= T <= 500
 * 1 <= N <= 106
 * 0 <= Ai <= 2
 * <p>
 * Example:
 * Input :
 * 2
 * 5
 * 0 2 1 2 0
 * 3
 * 0 1 0
 * <p>
 * Output:
 * 0 0 1 2 2
 * 0 0 1
 * <p>
 * Explanation:
 * Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
 */

public class SortArrayOf012 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int tcs = scanner.nextInt();
		int oneCount;
		int twoCount;


		for (int counting = 0; counting < tcs; counting++) {
			oneCount = 0;
			twoCount = 0;
			int size = Integer.parseInt(scanner.next());

			if (size > 0) {

				int[] elements = new int[size];

				for (int count = 0; count < size; count++) {
					elements[count] = scanner.nextInt();
					if (elements[count] == 0) {
						System.out.print("0 ");
					} else if (elements[count] == 1) {
						oneCount++;
					} else if (elements[count] == 2) {
						twoCount++;
					}
				}

				for (int count = 0; count < oneCount; count++) {
					System.out.print("1 ");
				}

				for (int count = 0; count < twoCount; count++) {
					System.out.print("2 ");
				}
				System.out.println();
			}
		}
	}

}
