package org.example.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
//        ints();
        union();
    }

    public static void country() {
        HashSet<String> countrySet = new HashSet<>();
        countrySet.add("Russia");
        countrySet.add("France");
        countrySet.add("Durand");
        countrySet.add("Italy");
        countrySet.add("Italy");

        System.out.println("Size of list: " + countrySet.size());
        System.out.println("====================");
        Iterator<String> iterator = countrySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====to array====");
        String[] array = new String[countrySet.size()];
        countrySet.toArray(array);
        for (String a : array) {
            System.out.println(a);
        }
    }

    public static void ints() {
        Random random = new Random(30);
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            numSet.add(random.nextInt(10));
            System.out.println(numSet);
        }
    }

    public static void union() {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(5);
        set.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set.add(2);
        set.add(7);
        set.add(1);
        set.add(5);
        set.add(8);

//        HashSet<Integer> union = new HashSet<>(set);
//        union.addAll(set2);
//        System.out.println("Union: " + union);
//
//        HashSet<Integer> intersect = new HashSet<>(set);
//        intersect.retainAll(set2);
//        System.out.println("intersect: " + intersect);

        HashSet<Integer> subtract = new HashSet<>(set);
        subtract.removeAll(set2);
        System.out.println("Remove all: " + subtract);
    }
}
