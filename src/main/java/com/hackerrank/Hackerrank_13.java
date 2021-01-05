package com.hackerrank;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Hackerrank_13 {


	private static final String YES = "YES";
	private static final String NO = "NO";

	public static void main(String[] args) throws ParseException {
		int[] firstArr = new int[1];
		int[] secondArr = new int[3];

		firstArr[0] = 2;
		secondArr[0] = 4;
		secondArr[1] = 32;
		secondArr[2] = 64;


		System.out.println(getTotalX(firstArr, secondArr));
	}

	static int getTotalX(int[] a, int[] b) {
		List<List<Integer>> secondArrayFactors = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			secondArrayFactors.add(getFactorsForElement(b[i]));
		}

		List<Integer> commonSecondArrayFactors = getCommonFactor(secondArrayFactors);
		System.out.println(commonSecondArrayFactors);
		int count = 0;

		for (int commonSecondArrayFactor : commonSecondArrayFactors) {
			boolean isFactor = false;
			for (Integer firstArrElem : a) {
				if (commonSecondArrayFactor < firstArrElem) {
					isFactor = false;
					break;
				}

				isFactor = commonSecondArrayFactor % firstArrElem == 0;

				if (!isFactor) {
					break;
				}
			}

			if (isFactor) {
				count++;
			}
		}

		return count;
	}

	private static List<Integer> getCommonFactor(List<List<Integer>> secondArrayFactors) {
		List<Integer> rez = new ArrayList<>();
		int length = secondArrayFactors.size();
		List<Integer> firstElementFactors = secondArrayFactors.get(0);

		for (Integer firstElementFactor : firstElementFactors) {
			boolean contains = false;
			for (int i = 0; i < length; i++) {
				contains = secondArrayFactors.get(i).contains(firstElementFactor);

				if (!contains) {
					break;
				}
			}
			if (contains) {
				rez.add(firstElementFactor);
			}
		}

		return rez;
	}

	private static List<Integer> getFactorsForElement(int elem) {
		List<Integer> rez = new ArrayList<>();
		for (int i = 1; i <= elem; i++) {
			if (elem % i == 0) {
				rez.add(i);
			}
		}

		return rez;
	}

}
