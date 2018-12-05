package com.designpatterns;

public class Hackerrank_14 {
	static int highestScore;
	static int lowestScore;

	public static void main(String[] args) {
		int[] results = new int[9];
		results[0] = 10;
		results[1] = 5;
		results[2] = 20;
		results[3] = 20;
		results[4] = 4;
		results[5] = 5;
		results[6] = 2;
		results[7] = 25;
		results[8] = 1;

		for (int i : breakingRecords(results)) {
			System.out.println(i);
		}
	}

	static int[] breakingRecords(int[] scores) {
		int[] rez = new int[2];
		highestScore = scores[0];
		lowestScore = scores[0];
		int highCount = 0;
		int lowCount = 0;

		for (int score : scores) {
			if (checkIfHighest(score)) {
				highestScore = score;
				highCount++;
			} else if (checkIfLowest(score)) {
				lowestScore = score;
				lowCount++;
			}
		}

		rez[0] = highCount;
		rez[1] = lowCount;

		return rez;
	}

	private static boolean checkIfHighest(int score) {
		return score > highestScore;
	}

	private static boolean checkIfLowest(int score) {
		return score < lowestScore;
	}

}
