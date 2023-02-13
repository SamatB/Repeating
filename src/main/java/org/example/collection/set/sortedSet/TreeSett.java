package org.example.collection.set.sortedSet;

import java.util.Random;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {
//        randoms();
        countries();
//        randoms();
    }

    public static void sett() {
        SortedSet<String> set = new TreeSet<>();

        set.add("Харьков");
        set.add("Киев");
        set.add("Львов");
        set.add("Кременчуг");
        set.add("Харьков");

        System.out.println(set);
    }

    public static void randoms() {
        Random random = new Random(30);
        SortedSet<Integer> numberSet = new TreeSet<>();

        for (int i = 0; i < 1000; i++)
            numberSet.add(random.nextInt(10));
        System.out.println(numberSet);

        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(11);
        nums.add(1);
        nums.add(15);
        nums.add(21);
        nums.add(2);
        System.out.println("Tree set objects: " + nums);
        Spliterator<Integer> spliterator = nums.spliterator();
        System.out.println("Elements of TreeSet after using spliterator() method: ");
        spliterator.forEachRemaining(System.out::println);
    }

    public static void countries() {
        SortedSet<String> country = new TreeSet<>();
        country.add("Россия");
        country.add("Франция");
        country.add("Гондурас");
        country.add("Кот-Д'Ивуар");
        System.out.println(country);

        System.out.println(country.first());
        

    }
}
