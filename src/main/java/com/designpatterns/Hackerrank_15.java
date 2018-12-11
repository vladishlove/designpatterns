package com.designpatterns;

import java.util.Arrays;
import java.util.List;

public class Hackerrank_15 {

	public static void main(String[] args) {
		List<Integer> bar = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 ,4);
		System.out.println(birthday(bar, 12, 12));
	}

	static int birthday(List<Integer> s, int d, int m) {
		int rez = 0;
		for (int i = 0; i < s.size(); i++) {
			Integer currentPiece = s.get(i);
			int sumWithNextMElems = currentPiece;
			int totalPieces = 1;

			for (int j = i + 1; totalPieces < m && j < s.size(); j++) {
				int nextElem = s.get(j);
				sumWithNextMElems += nextElem;
				totalPieces++;
			}

			if (sumWithNextMElems == d && totalPieces == m) {
				rez++;
			}
		}

		return rez;
	}
}
