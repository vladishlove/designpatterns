package com.designpatterns;

import java.util.Arrays;

public class Balls {
	static int weightCount = 0;

	public static void main(String[] args) {
		int position;
		int[] arr = new int[] {2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

		int[] leftPart = Arrays.copyOfRange(arr, 0, 6);
		int[] rightPart = Arrays.copyOfRange(arr, 6, 12);

		for (int i : leftPart) {
			System.out.println(i);
		}

		System.out.println("--");

		for (int i : rightPart) {
			System.out.println(i);
		}

		System.out.println("-------");

		int[] leftPartOfLeftPart = Arrays.copyOfRange(leftPart, 0, 3);
		int[] rightPartOfLeftPart = Arrays.copyOfRange(leftPart, 3, 6);

		System.out.println("left part");
		for (int i : leftPartOfLeftPart) {
			System.out.println(i);
		}

		System.out.println("--");

		for (int i : rightPartOfLeftPart) {
			System.out.println(i);
		}


		System.out.println("-------");
		// firstWeight
		int comparisonResult = compare(leftPartOfLeftPart, rightPartOfLeftPart);

		if (comparisonResult == 0) {
			// means the heavier ball in right part
			int[] leftPartOfRightPart = Arrays.copyOfRange(rightPart, 0, 3);
			int[] rightPartOfRightPart = Arrays.copyOfRange(rightPart, 3, 6);

			System.out.println("right part");
			for (int i : leftPartOfRightPart) {
				System.out.println(i);
			}
			System.out.println("--");
			for (int i : rightPartOfRightPart) {
				System.out.println(i);
			}

			// second weight
			comparisonResult = compare(leftPartOfRightPart, rightPartOfRightPart);

			if (comparisonResult > 0) {
				// third weight
				int compare = compare(leftPartOfRightPart);
				if (compare == 0) {
					position = 8;
				} else if (compare > 0) {
					position = 6;
				} else {
					position = 7;
				}
			} else {
				// third weight
				int compare = compare(rightPartOfRightPart);
				if (compare == 0) {
					position = 11;
				} else if (compare > 0) {
					position = 9;
				} else {
					position = 10;
				}
			}
		} else if (comparisonResult > 0) {
			// second weight
			int compare = compare(leftPartOfLeftPart);
			if (compare == 0) {
				position = 2;
			} else if (compare > 0) {
				position = 0;
			} else {
				position = 1;
			}
		} else {
			// second weight
			int compare = compare(rightPartOfLeftPart);
			if (compare == 0) {
				position = 5;
			} else if (compare > 0) {
				position = 3;
			} else {
				position = 4;
			}
		}

		System.out.println("Position is: " + position);
	}

	private static int compare(int[] leftPartOfRightPart) {
		weightCount++;
		System.out.println("weight method called " + weightCount + " time(s)");
		return Integer.compare(leftPartOfRightPart[0], leftPartOfRightPart[1]);
	}

	private static int compare(int[] leftPartOfLeftPart, int[] rightPartOfLeftPart) {
		weightCount++;
		int leftPartSum = 0;
		int rightPartSum = 0;
		for (int i : leftPartOfLeftPart) {
			leftPartSum += i;
		}
		for (int i : rightPartOfLeftPart) {
			rightPartSum += i;
		}

		System.out.println("weight method called " + weightCount + " time(s)");
		return Integer.compare(leftPartSum, rightPartSum);
	}
}
