package com.problem.solving.arrays.basic;

import java.util.Scanner;

/**
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).
 * <p>
 * Input:
 * The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.
 * <p>
 * Output:
 * For each testcase, in a new line, output the rotated array.
 * <p>
 * Constraints:
 * 1 <= T <= 200
 * 1 <= N <= 107
 * 1 <= D <= N
 * 0 <= arr[i] <= 105
 * <p>
 * Example:
 * Input:
 * 2
 * 5 2
 * 1 2 3 4 5
 * 10 3
 * 2 4 6 8 10 12 14 16 18 20
 * <p>
 * Output:
 * 3 4 5 1 2
 * 8 10 12 14 16 18 20 2 4 6
 * <p>
 * Explanation :
 * Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
 */

public class RotateArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		while (test-- > 0) {
			int N = in.nextInt();
			int D = in.nextInt();
			int a[] = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = in.nextInt();
			}
			StringBuffer s = new StringBuffer();
			for (int i = D; i < N; i++) {
				s.append(a[i] + " ");
			}
			for (int i = 0; i < D; i++) {
				s.append(a[i] + " ");
			}
			System.out.println(s);
		}
	}

	/*public static void rotateArray(int rotatePos, int[] array){
		reverseArray(0, rotatePos-1, array);
		reverseArray(rotatePos, array.length-1, array);
		reverseArray(0, array.length-1, array);
	}

	public static void reverseArray(int begin, int end, int[] array){
		do{
			int temp = array[end];
			array[end] = array[begin];
			array[begin] = temp;
			begin++; end--;
		}while(begin<end);
	}

	public static void main (String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcs = Integer.parseInt(br.readLine());

		while (tcs-- > 0) {
			String[] second = br.readLine().split("\\s+");

			int size = Integer.parseInt(second[0]);
			int rotate = Integer.parseInt(second[1]);

			int[] arr = new int[size];
			String[] str = br.readLine().split("\\s+");

			for (int count = 0; count < size; count++) {
				arr[count] = Integer.parseInt(str[count]);
			}
			rotateArray(rotate, arr);
			for (int count = 0; count < arr.length; count++) {
				System.out.print(arr[count]+" ");
			}
			System.out.println();
		}
	}*/

}
