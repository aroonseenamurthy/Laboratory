package com.laboratory.kata;

import java.util.HashMap;
import java.util.Map;

public class MapProcessor {
    public static void main(String[] args){

        Map <Integer,String>map = new HashMap();
        map.put(1,"abc");


        map.forEach((key,val) -> System.out.println("Key " + key + " Value " +val));


    }
}
