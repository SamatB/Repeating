package org.example.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedL {
    public static void main(String[] args) {
//        linkedL();

    }

    public static void linkedL() {
        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Moscow";

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(str1);
        linkedList.add(str2);
        linkedList.add(str3);
        linkedList.add(str4);

        System.out.println(linkedList);

        linkedList.add(1, "!!!");
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);
//        У LinkedList есть много общих с ArrayList методов.
//         Например, такие методы как add(), remove(), indexOf(), clear(), contains() (содержится ли элемент в списке),
//         set() (вставка элемента с заменой) и size() есть в обоих классах.
    }
}
