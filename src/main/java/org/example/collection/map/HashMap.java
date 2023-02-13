package org.example.collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap {
    public static void main(String[] args) {
        people();
    }

    public static void people() {
        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(123, "Sam Began");
        map.put(1000, "Baha Began");
        map.put(3568, "Ali Aliev");
        map.put(1247, "Nano Key");
        map.put(null, "Nano Key");
        map.put(56900, null);
        map.putIfAbsent(123, "Day Oy");

        System.out.println(map);
        System.out.println(map.get(1000));
        map.remove(null);
        System.out.println(map);
        System.out.println(map.keySet());

    }
}
