package org.example.collection.map.treemap;


import org.example.collection.map.Student;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student student1 = new Student("Sam", "Beg", 1);
        Student student2 = new Student("Max", "Jey", 3);
        Student student3 = new Student("Ali", "Black", 2);
        Student student4 = new Student("Samat", "Began", 4);
        Student student5 = new Student("Maxim", "Jeyer", 1);
        Student student6 = new Student("Alima", "White", 4);
        Student student7 = new Student("Jack", "chmo", 3);

        treeMap.put(5.8, student1);
        treeMap.put(6.4, student2);
        treeMap.put(9.0, student3);
        treeMap.put(5.3, student4);
        treeMap.put(6.1, student5);
        treeMap.put(7.9, student6);
        treeMap.put(8.8, student7);

        System.out.println(treeMap);
//        System.out.println(treeMap.get(5.8));
//        treeMap.pollFirstEntry();
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.descendingKeySet());
    }
}
