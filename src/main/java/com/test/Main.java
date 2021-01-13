package com.test;

import java.util.TreeMap;

public interface Main {
    default Integer geti() {
        new TreeMap<>();
        return 1;
    }

    static void print() {
        System.out.println("");
    }

}
