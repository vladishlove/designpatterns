package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Hackerrank_19 {

	public static void main(String[] args) {
		Integer[] socks = new Integer[] {3, 2, 2, 1, 3, 2, 2, 3, 3};

		System.out.println(sockMerchant(socks.length, socks));
	}

	static int sockMerchant(int n, Integer[] ar) {
		int rez = 0;
		Map<Integer, Integer> socksStorage = new HashMap();

		for (int i = 0; i < n; i++) {
			if (!socksStorage.containsKey(ar[i])) {
				socksStorage.put(ar[i], 1);
			} else {
				Integer currentQuantity = socksStorage.get(ar[i]);
				currentQuantity += 1;
				socksStorage.put(ar[i], currentQuantity);
			}
		}

		for (Map.Entry<Integer, Integer> entry : socksStorage.entrySet()) {
			rez += entry.getValue() / 2;
		}

		return rez;
	}
}
