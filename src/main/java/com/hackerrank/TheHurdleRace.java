package com.hackerrank;

import java.util.Arrays;

public class TheHurdleRace {
    public static void main(String[] args) {

    }

    static int hurdleRace(int k, int[] height) {
        int rez = 0;
        Arrays.sort(height);
        int top = height[height.length - 1];
        int diff = top - k;
        if (diff > 0) {
            rez = diff;
        }

        return rez;
    }
}
