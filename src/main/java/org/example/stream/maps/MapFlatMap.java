package org.example.stream.maps;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class MapFlatMap {
    public static void main(String[] args) {

        List<Human> humans = asList(
                new Human("Sam", asList("Buddy", "Lucy")),
                new Human("Bob", asList("Frankie", "Rosie")),
                new Human("Marta", asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .map(Human::getPets)
                .flatMap(Collection::stream).toList();
        System.out.println(humans.stream().map(Human::getName).collect(Collectors.toList()));
        System.out.println(petNames);

        List<Integer> nums = asList(1,4,2,6,7,9,11,5,14,3);
//        nums.stream()
//                .map(n-> n * 2).forEach(System.out::println);

        System.out.println("\nПараллельный поток");
        Optional<Integer> result = nums.stream().parallel().reduce((x,y) -> x* y);
        System.out.println(result.get());


        List<String> people = Arrays.asList("Tom","Bob", "Sam", "Kate", "Tim");

        System.out.println("Последовательный поток");
        people.stream().filter(p -> p.length()==3).forEach(System.out::println);

        System.out.println("\nПараллельный поток");
        people.parallelStream().filter(p -> p.length()==3).forEach(System.out::println);

        System.out.println("Count od people: " + people.stream().count());
    }
}
