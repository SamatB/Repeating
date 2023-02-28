package org.example.lambda.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobbie", 5, 3);

        Converter<Dog, Raccoon> converter = x -> new Raccoon(x.name, x.age, x.weight);

        Raccoon raccoon = converter.convert(dog);

        System.out.println("Raccoon has parameters: name - " + raccoon.name + ", age - " + raccoon.age +
                ", weight - " + raccoon.weight);

        Predicate<Integer> isEvenNumber = x -> x % 2==0;
        List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2 == 0).toList();
        System.out.println(evenNumbers);

        System.out.println(isEvenNumber.test(4));
        System.out.println(isEvenNumber.test(3));

        Consumer<String> greetings = x -> System.out.println("Hello " + x + " !!!");
        greetings.accept("Elena");

        ArrayList<String> nameList = new ArrayList<>();
        nameList .add("Elena");
        nameList .add("John");
        nameList .add("Alex");
        nameList .add("Jim");
        nameList .add("Sara");

        Supplier<String> randomName = () -> {
            int value = (int)(Math.random() * nameList.size());
            return nameList.get(value);
        };

        System.out.println(randomName.get());

        Function<String, Integer> valueConverter = Integer::valueOf;
        System.out.println(valueConverter.apply("678"));

        StringJoiner joiner = new StringJoiner("/", "-", "+");
        for (String s: "Hello the brave world".split("")){
            joiner.add(s);
        }
        System.out.println(joiner);
    }
}
