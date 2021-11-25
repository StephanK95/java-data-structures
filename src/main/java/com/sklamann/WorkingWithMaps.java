package com.sklamann;

import java.util.Map;
import java.util.TreeMap;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new TreeMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));
        System.out.println(map);
        System.out.println(map.size());

    }
}
