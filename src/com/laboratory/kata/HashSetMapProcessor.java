package com.laboratory.kata;

import java.util.HashSet;

public class HashSetMapProcessor {
    public static void main(String args[]){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(3);

        hashSet.stream().forEach(h -> {System.out.println(h.intValue());});

    }
}
