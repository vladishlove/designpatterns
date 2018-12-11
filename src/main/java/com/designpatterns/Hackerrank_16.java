package com.designpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hackerrank_16 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 3, 3, 1, 4, 4);

		System.out.println(migratoryBirds(list));
	}

	static int migratoryBirds(List<Integer> arr) {
		Map<Integer, Integer> stat = new HashMap<>();

		for (Integer birdId : arr) {
			Integer quantity = stat.get(birdId);
			if (quantity == null) {
				stat.put(birdId, 1);
			} else {
				quantity += 1;
				stat.put(birdId, quantity);
			}
		}

		List<Integer> topIds = new ArrayList<>();
		Integer topQuantity = 0;

		for (Map.Entry<Integer, Integer> entry : stat.entrySet()) {
			if (entry.getValue() >= topQuantity) {
				topQuantity = entry.getValue();
			}
		}

		for (Map.Entry<Integer, Integer> entry : stat.entrySet()) {
			if (entry.getValue().equals(topQuantity)) {
				topIds.add(entry.getKey());
			}
		}

		Collections.sort(topIds);

		return topIds.get(0);
	}

	private static Comparator<Map.Entry<Integer, Integer>> getComparator() {
		return new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				if (o1.getValue().equals(o2.getValue())) {
					return 0;
				} else if (o1.getValue() > o2.getValue()){
					return 1;
				} else {
					return -1;
				}
			}
		};
	}
}
