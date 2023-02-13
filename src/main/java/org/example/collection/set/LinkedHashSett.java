package org.example.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class LinkedHashSett {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("C");
        linkedHashSet.add("F");
        System.out.println(linkedHashSet);
        System.out.println("=============");
        String[] array = linkedHashSet.toArray(new String[0]);
        linkedHashSet.toArray(array);
        for (String a: array) {
            System.out.println(a);
        }
        System.out.println("==============");
        linkedHashSet.forEach(s -> System.out.print(s + ", "));
        System.out.println("\n==============");
        System.out.println(linkedHashSet.stream().sorted().collect(Collectors.toList()));
        System.out.println("\n==============");
        linkedHashSet.stream().sorted().forEach(System.out::println);

        HashSet<Integer> integers =new HashSet<>(100, 0.5F);
    }
}
