package org.example.stream.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
    }
}
