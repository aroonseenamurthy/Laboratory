package com.laboratory.kata;

import java.util.Arrays;

public class ListProcessor {

    public static void main(String[] args){
        Arrays.asList(1,2,3,4,5).stream().forEach(System.out::println);
        Arrays.asList(1,2,3,4,5).stream().forEachOrdered(System.out::println);
    }
}
