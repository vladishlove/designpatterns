package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Hackerrank_5 {

	private static final int INITIAL_RESULT = 0;
	private static final int ALICE_RESULT_POSITION = INITIAL_RESULT;
	private static final int BOB_RESULT_POSITION = 1;
	private static final int ASSESS_QUANTITY = 3;

	public static void main(String[] args) {

		int[][] arr = getInts();

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}

		System.out.println(compareTriplets(arr));
	}

	static int compareTriplets(int[][] arr) {
		List<List<Integer>> leftDiagIndexes = new ArrayList<>();
		List<List<Integer>> rightDiagIndexes = new ArrayList<>();
		int n = arr.length - 1;

		for (int i = 0; i <= n; i++) {
			List<Integer> leftDiagIndex = new ArrayList<>();
			leftDiagIndex.add(n - (n - i));
			leftDiagIndex.add(n - (n - i));
			leftDiagIndexes.add(leftDiagIndex);
		}

		for (int i = 0, j = n; i <= n; i++, j--) {
			List<Integer> rightDiagIndex = new ArrayList<>();
			rightDiagIndex.add(n - (n - i));
			rightDiagIndex.add(n - (n - j));
			rightDiagIndexes.add(rightDiagIndex);
		}

		int sumLeft = 0;
		for (List<Integer> leftDiagIndex : leftDiagIndexes) {
			sumLeft += arr[leftDiagIndex.get(0)][leftDiagIndex.get(1)];
		}

		int sumRight = 0;
		for (List<Integer> rightDiagIndex : rightDiagIndexes) {
			sumRight += arr[rightDiagIndex.get(0)][rightDiagIndex.get(1)];
		}

		return abs(sumLeft - sumRight);
	}

	private static int[][] getInts() {
		int[][] arr = new int[3][3];
		arr[0][0] = 11;
		arr[0][1] = 1;
		arr[0][2] = 4;

		arr[1][0] = 2;
		arr[1][1] = 5;
		arr[1][2] = 2;

		arr[2][0] = 10;
		arr[2][1] = 3;
		arr[2][2] = -12;
		return arr;
	}
}
