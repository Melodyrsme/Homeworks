package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int)(Math.random() * 100);
        }
        HashSet<Integer> integerHashSet = new LinkedHashSet<>();
        for (int i : array) {
            if(i % 2 == 0 && i % 5 == 0){
                integerHashSet.add(i);
            }
        }
        for (int i : array) {
            if(i % 2 == 0 && i % 5 != 0){
                integerHashSet.add(i);
            }
        }
        System.out.println(integerHashSet);
    }
}
