package com.designpatterns;

import java.util.Arrays;
import java.util.List;

public class Hackerrank_18 {

	public static void main(String[] args) {
		List<Integer> bill = Arrays.asList(3, 10, 2, 9);
		bonAppetit(bill, 1, 12);
	}

	static void bonAppetit(List<Integer> bill, int k, int b) {
		Integer rez = 0;

		for (Integer integer : bill) {
			rez += integer;
		}

		int partToPay = (rez - bill.get(k)) / 2;

		int diff = b - partToPay;

		if (diff == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(diff);
		}
	}
}
