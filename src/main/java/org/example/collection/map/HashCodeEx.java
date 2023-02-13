package org.example.collection.map;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student, Double> map= new HashMap<>();
        Student student1 = new Student("Sam", "Beg", 1);
        Student student2 = new Student("Max", "Jey", 3);
        Student student3 = new Student("Ali", "Black", 2);
        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);
        System.out.println(map);
        Student student4 = new Student("Sam", "Begj", 1);
        boolean result = map.containsKey(student4);
        System.out.println("result: " + result);
        System.out.println(student1.hashCode());
        System.out.println(student4.hashCode());

    }
}

