package com.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PickingNumbers_20 {
    /*
        Given an array of integers, find the longest subarray where the absolute difference
        between any two elements is less than or equal to 1

        1 1 2 2 2 3
     */
    public static void main(String[] args) {
        String s = "4 97 5 97 97 4 97 4 97 97 97 97 4 4 5 5 97 5 97 99 4 97 5 97 97 97 5 5 97 4 5 97 97 5 97 4 97 5 4 4 97 5 5 5 4 97 97 4 97 5 4 4 97 97 97 5 5 97 4 97 97 5 4 97 97 4 97 97 97 5 4 4 97 4 4 97 5 97 97 97 97 4 97 5 97 5 4 97 4 5 97 97 5 97 5 97 5 97 97 97";
        String[] strings = s.split(" ");
        Integer[] integersArr = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integersArr[i] = Integer.valueOf(strings[i]);
        }
        List<Integer> integers = Arrays.asList(integersArr);

        Collections.sort(integers);

        System.out.println(integers);

        int i = pickingNumbers(integers);
        System.out.printf("max length is %d", i);
    }


    public static int pickingNumbers(List<Integer> a) {
//        if (a == null || a.size() == 0) {
//            return 0;
//        }
//
//        Map<Integer, Integer> resultMap = new TreeMap<>();
//
//
//        for (Integer integer : a) {
//            resultMap.merge(integer, 1, Integer::sum);
//        }
//
//        System.out.println(resultMap);
//
//        int currSqLength;
//        int currKey;
//        int previousKey = -1;
//        int prevSqLength = 0;
//        int maxSqLength = 0;
//
//        for (Map.Entry<Integer, Integer> integerEntry : resultMap.entrySet()) {
//            currSqLength = integerEntry.getValue();
//            currKey = integerEntry.getKey();
//
//            if (currSqLength > maxSqLength) {
//                maxSqLength = currSqLength;
//            }
//
//            if (previousKey != -1 && Math.abs(currKey - previousKey) <= 1) {
//                int sum = currSqLength + prevSqLength;
//                if (sum > maxSqLength) {
//                    maxSqLength = sum;
//                }
//            }
//
//            prevSqLength = currSqLength;
//            previousKey = currKey;
//        }


        int[] intArr = new int[100];

        for (Integer integer : a) {
            intArr[integer]++;
        }

        int max = 0;
        for (int i = 0; i < 99; i++) {
            max = Math.max(max, intArr[i] + intArr[i+1]);
        }

        return max;
    }

}
