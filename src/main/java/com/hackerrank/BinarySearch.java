package com.hackerrank;

import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 12, 15, 16, 24, 30, 50);
        integers.stream().map(el -> find(integers, 0, integers.size(), el)).forEach(System.out::println);
    }

    private static int find(List<Integer> integers, int low, int high, int intToFind) {
        int mid = (high + low) / 2;

        if (integers.get(mid) > intToFind) {
            return find(integers, low, mid, intToFind);
        } else if (integers.get(mid) < intToFind) {
            return find(integers, mid, high, intToFind);
        } else if (integers.get(mid) == intToFind) {
            return mid;
        }

        return 0;
    }

}
