package com.laboratory.kata;


import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class NavigableMapProcessor {

    public static void main(String [] args){

        NavigableMap <Integer,String> navigableMap = new TreeMap();
        navigableMap.put(10,"Ten");
        navigableMap.put(30, "Thrity");
        navigableMap.put(50, "Fifty");

       NavigableMap testMap = navigableMap.descendingMap();

       testMap.forEach((k,v) -> System.out.println(k ));

        SortedMap headMap =  navigableMap.headMap(30);

        headMap.forEach((k,v) -> System.out.println(k ));

        SortedMap tailMap =  navigableMap.tailMap(30);

        tailMap.forEach((k,v) -> System.out.println(k ));


    }
}
