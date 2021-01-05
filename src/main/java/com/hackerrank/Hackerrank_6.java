package com.hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Hackerrank_6 {

	//-4 3 -9 0 4 1
	public static void main(String[] args) {
		int[] arr = getInts();

		plusMinus(arr);
	}

	static void plusMinus(int[] arr) {
		float[] rez = new float[3];
		List<Integer> minus = new ArrayList<>();
		List<Integer> plus = new ArrayList<>();
		List<Integer> zero = new ArrayList<>();
		int length = arr.length;

		for (int el : arr) {
			if (el == 0) {
				zero.add(el);
			} else if (el > 0) {
				plus.add(el);
			} else {
				minus.add(el);
			}
		}

		rez[0] = (float) plus.size() / (float) length;
		rez[1] = (float) minus.size() / (float) length;
		rez[2] = (float) zero.size() / (float) length;
		DecimalFormat numberFormat = new DecimalFormat("0.000000");

		System.out.println(numberFormat.format(rez[0]));
		System.out.println(numberFormat.format(rez[1]));
		System.out.println(numberFormat.format(rez[2]));
	}


	private static int[] getInts() {
		int[] arr = new int[6];
		arr[0] = -4;
		arr[1] = 3;
		arr[2] = -9;
		arr[3] = 0;
		arr[4] = 4;
		arr[5] = 1;
		return arr;
	}
}
