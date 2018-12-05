package com.designpatterns;

import java.text.ParseException;

public class Hackerrank_12 {


	private static final String YES = "YES";
	private static final String NO = "NO";

	public static void main(String[] args) throws ParseException {
		System.out.println(kangaroo(0, 3, 4, 2));
		System.out.println(kangaroo(0, 2, 5, 3));

	}


	static String kangaroo(int x1, int v1, int x2, int v2) {
		int firstStart = x1;
		int secondStart = x2;

		int firstSpeed = v1;
		int secondSpeed = v2;

		if (firstStart < secondStart && firstSpeed < secondSpeed ||
				secondStart < firstStart || secondSpeed > firstSpeed) {
			return NO;
		} else if (firstStart < secondStart) {
			return match(firstStart, secondStart, firstSpeed, secondSpeed);
		} else {
			return match(secondStart, firstStart, secondSpeed, firstSpeed);
		}
	}

	private static String match(int firstStart, int secondStart, int firstSpeed, int secondSpeed) {
		int firstCurrentPosition = firstStart;
		int secondCurrentPosition = secondStart;
		while (firstCurrentPosition <= secondCurrentPosition) {
			if (firstCurrentPosition == secondCurrentPosition) {
				return YES;
			}
			firstCurrentPosition += firstSpeed;
			secondCurrentPosition += secondSpeed;
		}

		return NO;
	}

}
