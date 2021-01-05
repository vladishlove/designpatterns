package com.hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Hackerrank_7 {

	//-4 3 -9 0 4 1
	public static void main(String[] args) {
		staircase(10);
	}

	private static void staircase(int n) {
		String dash = "#";
		List<String> lines = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			StringBuilder line = new StringBuilder(dash);
			for (int j = 0; j < i; j++) {
				line.append(dash);
			}

			lines.add(line.toString());
		}

		for (String line : lines) {
			System.out.printf("%" + n +"s", line);
			System.out.println();
		}
	}


}
