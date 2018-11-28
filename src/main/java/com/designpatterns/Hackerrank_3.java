package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Hackerrank_3 {

	private static final int INITIAL_RESULT = 0;
	private static final int ALICE_RESULT_POSITION = INITIAL_RESULT;
	private static final int BOB_RESULT_POSITION = 1;
	private static final int ASSESS_QUANTITY = 3;

	public static void main(String[] args) {

	}

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList();
		result.add(INITIAL_RESULT);
		result.add(INITIAL_RESULT);

		for (int i = 0; i < ASSESS_QUANTITY; i++) {
			int alicePoints = a.get(i);
			int bobPoints = b.get(i);
			if (alicePoints != bobPoints) {
				int aliceResult = result.get(ALICE_RESULT_POSITION);
				int bobResult = result.get(BOB_RESULT_POSITION);
				if (alicePoints > bobPoints) {
					result.set(ALICE_RESULT_POSITION, ++aliceResult);
				} else {
					result.set(BOB_RESULT_POSITION, ++bobResult);
				}
			}
		}

		return result;
	}
}
