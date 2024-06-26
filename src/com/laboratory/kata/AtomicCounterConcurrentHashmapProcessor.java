package com.laboratory.kata;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class AtomicCounterConcurrentHashmapProcessor {
    public static void main(String args[]){
        ConcurrentHashMap<String, LongAdder> longAdderConcurrentHashMap = new ConcurrentHashMap<>();
        longAdderConcurrentHashMap.computeIfAbsent("key", k -> new LongAdder()).increment();
       System.out.println(longAdderConcurrentHashMap.get("key"));
    }
}
