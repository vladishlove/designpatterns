package com.designpatterns;

import java.text.ParseException;

public class Hackerrank_11 {


	public static void main(String[] args) throws ParseException {
		int houseStart = 7;
		int houseEnd = 11;
		int apple = 5;
		int orange = 15;
		int[] apples = new int[3];
		int[] oranges = new int[2];
		apples[0] = -2;
		apples[1] = 2;
		apples[2] = 1;

		oranges[0] = 5;
		oranges[1] = -6;

		countApplesAndOranges(houseStart, houseEnd, apple, orange, apples, oranges);

	}

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int[] applesPositions = countFruitPosition(a, apples);
		int[] orangePositions = countFruitPosition(b, oranges);

		int appleQuantityInRange = countFruitsInRange(s, t, applesPositions);
		int orangeQuantityInRange = countFruitsInRange(s, t, orangePositions);

		System.out.println(appleQuantityInRange);
		System.out.println(orangeQuantityInRange);
	}

	private static int countFruitsInRange(int s, int t, int[] apples) {
		int rez = 0;

		for (int apple : apples) {
			if (apple >= s && apple <= t) {
				rez++;
			}
		}

		return rez;
	}

	private static int[] countFruitPosition(int a, int[] apples) {
		int[] positions = new int[apples.length];

		for (int i = 0; i < apples.length; i++) {
			positions[i] = a + apples[i];
		}

		return positions;
	}
}
