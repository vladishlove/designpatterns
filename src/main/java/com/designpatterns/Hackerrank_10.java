package com.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hackerrank_10 {


	public static void main(String[] args) throws ParseException {
		int[] arr = new int[4];
		arr[0] = 73;
		arr[1] = 67;
		arr[2] = 38;
		arr[3] = 33;

		int[] ints = gradingStudents(arr);
		for (int anInt : ints) {
			System.out.println(anInt);
		}
	}

	private static int[] gradingStudents(int[] grades) {
		int[] rounded = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			rounded[i] = round(grades[i]);
		}

		return rounded;
	}

	private static int round(int i) {
		int rez;

		if (i < 38) {
			rez = i;
		} else {
			int rest = i % 5;
			int whole = i + 5 - rest;
			if (whole - i < 3) {
				rez = whole;
			} else {
				rez = i;
			}
		}

		return rez;
	}
}
