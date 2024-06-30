package com.laboratory.kata;

import java.util.HashSet;
import java.util.Set;

public class HashSetMapProcessor {
    public static void main(String args[]){
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(3);

        hashSet.stream().forEach(h -> {System.out.println(h.intValue());});

    }
}
