package org.example.collrction;

import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

//        Collection<String> element = Collections.singletonList("Hello, world!");
//        Set<String> elements = new HashSet<>(element);
//        List<String> array = new ArrayList<>(elements);
//
////        System.out.println(array);
//
//        Collection<String> elements2 = new ArrayList<>();
//        elements2.add("Hello,");
//        elements2.add(" world");
//        elements2.add("!!!");

//        Collection<String> copied = elements2.stream().collect(Collectors.toList());

        Collection<Integer> digits = List.of(1, 5, -33, 0);
        Collection<Integer> sorted = digits.stream()
                .sorted((e, u) -> u - e)
                .collect(Collectors.toList());
        System.out.println(sorted);

    }
}
