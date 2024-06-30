package com.laboratory.kata;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMapProcessor {

    public static void main(String args[]){
        Set<Integer> testSet = new TreeSet<>();
        testSet.add(5);
        testSet.add(4);
        testSet.add(3);
        testSet.add(2);
        testSet.add(1);
        System.out.println(testSet);
    }
}
