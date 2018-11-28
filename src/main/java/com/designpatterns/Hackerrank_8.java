package com.designpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hackerrank_8 {

	//-4 3 -9 0 4 1
	public static void main(String[] args) {
		int[] arr = new int[5];
		int a = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = a + 1;
			a++;
		}

		miniMaxSum(arr);
		System.out.println("Product Interchangeability Equivalence evidence".toLowerCase().replaceAll(" ", "-").concat(".pdf"));
	}

	private static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		int[] minInts = Arrays.copyOfRange(arr, 0, 4);
		int[] maxInts = Arrays.copyOfRange(arr, arr.length - 4, arr.length);

		int minSum = sum(minInts);
		int maxSum = sum(maxInts);

		System.out.println(minSum + " " + maxSum);
	}

	private static int sum(int[] ints) {
		int rez = 0;

		for (int i = 0; i < ints.length; i++) {
			rez += ints[i];
		}

		return rez;
	}


}
