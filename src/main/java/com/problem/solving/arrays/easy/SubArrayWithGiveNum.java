package com.problem.solving.arrays.easy;

import java.util.Scanner;

//Window Sliding Technique
//https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0

/**
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
 * <p>
 * Input:
 * The first line of input contains an integer T denoting the number of test cases.
 * Then T test cases follow. Each test case consists of two lines.
 * The first line of each test case is N and S, where N is the size of array and S is the sum.
 * The second line of each test case contains N space separated integers denoting the array elements.
 * <p>
 * Output:
 * For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such
 * occuring subarray from the left if sum equals to subarray, else print -1.
 * <p>
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 107
 * 1 <= Ai <= 1010
 * <p>
 * Example:
 * Input:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 * Output:
 * 2 4
 * 1 5
 * <p>
 * Explanation :
 * Testcase1: sum of elements from 2nd position to 4th position is 12
 * Testcase2: sum of elements from 1st position to 5th position is 15
 */

public class SubArrayWithGiveNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tcs = scanner.nextInt();

		for (int counting = 0; counting < tcs; counting++) {

			int size = Integer.parseInt(scanner.next());
			int inputCount = scanner.nextInt();

			int wsum = 0;
			int header = 0;


			if (size > 0) {
				int[] elements = new int[size];
				for (int count = 0; count < size; count++) {
					elements[count] = scanner.nextInt();
				}

				if (inputCount > 0) {
					for (int counter = 0; counter < size; counter++) {
						wsum = wsum + elements[counter];

						if (wsum > inputCount) {
							do {
								wsum = wsum - elements[header];
								header++;
							} while (wsum > inputCount);
						}

						if (wsum == inputCount) {
							System.out.println((header + 1) + " " + (counter + 1));
							break;
						}
					}
				}
				if (wsum != inputCount) {
					System.out.println("-1");
				}
			}
		}
	}

}
