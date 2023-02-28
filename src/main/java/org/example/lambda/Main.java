package org.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.example.lambda.Condition.sum;

public class Main {
    public static void main(String[] args) {
        Printable printable = s -> System.out.println(s);

        printable.print("Hi, sam!");


        Operationable operationable = Integer::sum;
        Operationable operationable2 = (int x, int y) -> {
            if (y == 0) {
                return 0;
            } else {
                return x / y;
            }
        };
        System.out.println(operationable.calculate(30, 35));
        System.out.println(operationable2.calculate(30, 0));
        System.out.println("---------------------------");


        System.out.println(sum(new int[] {0, 1, 0, 3, 0, 5, 0, 7, 0, 9}, (n) -> n != 0));



        System.out.println(sort(new ArrayList<>(List.of(new String[]{"Sam", "Max", "Hank"}))));

        //Что такое «ссылка на метод»?
        Measurable a = String::length;
        System.out.println(a.length("abc"));
    }

    //        Как отсортировать список строк с помощью лямбда-выражения?
    public static List<String> sort(List<String> list){
        Collections.sort(list, (a, b) -> a.compareTo(b));
        return list;
    }
}
