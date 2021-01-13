package com.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        String s = "1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5";
        Integer[] s1 = Arrays.stream(s.split(" ")).map(Integer::valueOf).toArray(Integer[]::new);
        System.out.println(designerPdfViewer(s1, "abc"));
    }

    static int designerPdfViewer(Integer[] h, String word) {
        String s = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
        String[] alfabet = s.split(", ");
        Map<Character, Integer> letterHeights = new HashMap<>();

        for (int i = 0; i < alfabet.length; i++) {
            letterHeights.put(alfabet[i].toCharArray()[0], h[i]);
        }

        String upperW = word.toUpperCase(Locale.ROOT);

        int highest = 0;
        for (char c : upperW.toCharArray()) {
            Integer letterHeight = letterHeights.get(c);
            if (letterHeight > highest) {
                highest = letterHeight;
            }
        }

        return highest * word.length();
    }
}
