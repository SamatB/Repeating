package org.example.initblocks;

import java.util.LinkedList;
import java.util.List;

public class Dog {
    private String name;
    private String poroda;
    private int age;
    static List<Character> abc;

    static {
        abc = new LinkedList<>();
        for (char c = 'A'; c <= 'Z'; ++c) {
            abc.add(c);
        }
        System.out.println(abc);
    }

    {
        System.out.println("Это нестатический блок инициализации!");

    }

    public Dog(String x, String y, int z) {
        name = x;
        poroda = y;
        age = z;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                '}';
    }
}
