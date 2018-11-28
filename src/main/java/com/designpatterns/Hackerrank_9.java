package com.designpatterns;

import java.util.Arrays;

public class Hackerrank_9 {


	public static void main(String[] args) {
		int[] arr = new int[5];
		int a = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
//			arr[i] = a + 1;
			arr[i] = 5;
			a++;
		}
		arr[arr.length - 1] = 5;

		int i1 = birthdayCakeCandles(arr);
		System.out.println(i1);
	}

	static private int birthdayCakeCandles(int[] arr) {
		int rez = 0;
		Arrays.sort(arr);
		int arrayLastElementIndex = arr.length - 1;
		int maxValue = arr[arrayLastElementIndex];

		int i = 0;
		while (i < arr.length && arr[arrayLastElementIndex - i] == maxValue) {
			rez++;
			i++;
		}

		return rez;
	}
}
