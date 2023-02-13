package org.example.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);
        Student student1 = new Student("Sam", "Beg", 1);
        Student student2 = new Student("Max", "Jey", 3);
        Student student3 = new Student("Ali", "Black", 2);
        Student student4 = new Student("Samat", "Began", 4);

        linkedHashMap.put(9.0, student3);
        linkedHashMap.put(5.3, student4);
        linkedHashMap.put(5.8, student1);
        linkedHashMap.put(6.4, student2);

        System.out.println(linkedHashMap.keySet());
    }
}
