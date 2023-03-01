package org.example.stream.maps;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;
import java.util.stream.Stream;

public class Tasks {
    public static void main(String[] args) {
        //Как вывести на экран 10 случайных чисел, используя forEach()?
        (new Random())
                .ints(50, 90)
                .limit(10)
                .forEach(System.out::println);

        //Как можно вывести на экран уникальные квадраты чисел используя метод map()?
        Stream.of(1, 2, 3, 2, 1)
                .map(s -> s * s)
                .distinct()
                .forEach(System.out::println);

        System.out.println(Stream.of("Hello", "", "", ", ", "world", "!")
                .filter(String::isEmpty)
                .count());
        //Как вывести на экран 10 случайных чисел в порядке возрастания?
        (new Random())
                .ints(50, 90)
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        //Как найти максимальное число в наборе?
        System.out.println("Max from 5, 3, 4, 55, 2 :" + Stream
                .of(5, 3, 4, 55, 2)
                .mapToInt(value -> value)
                .max()
                .getAsInt());

        //Как получить сумму всех чисел в наборе?
        System.out.println("Sun of 5, 3, 4, 55, 2 :" + Stream
                .of(5, 3, 4, 55, 2)
                .mapToInt(value -> value)
                .sum());

        // Как добавить 1 неделю, 1 месяц, 1 год, 10 лет к текущей дате с использованием Date Time API?
        System.out.println(
                "LocalDate.now: " + LocalDate.now() +
                        "\nLocalDate.now + week : " + LocalDate.now().plusWeeks(1) +
                        "\nLocalDate.now + months: " + LocalDate.now().plusMonths(1) +
                        "\nLocalDate.now + year : " + LocalDate.now().plusYears(1) +
                        "\nLocalDate.now + 10 years: " + LocalDate.now().plus(1, ChronoUnit.DECADES)
        );

        System.out.println(
                "ZoneDate time: " + ZonedDateTime.now()
        );
        //Как получить следующий вторник используя Date Time API?
        System.out.println(
                LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY))
        );

    }
}
