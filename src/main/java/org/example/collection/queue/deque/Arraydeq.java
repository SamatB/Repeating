package org.example.collection.queue.deque;

import java.util.ArrayDeque;


public class Arraydeq {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();
        // стандартное добавление элементов
        deque.add("Germany");
        deque.addFirst("France"); // добавляем элемент в самое начало
        deque.push("Great Britain"); // добавляем элемент в самое начало
        deque.addLast("Spain"); // добавляем элемент в конец коллекции
        deque.add("Italy");
        deque.offerLast("Kyrgyzstan");

        String[] array = new String[deque.size()];
        deque.toArray(array);
        System.out.println("===to array===");
        for (String a: array) {
            System.out.print(a + ", ");
        }


        System.out.println("\n===================");
        // получаем первый элемент без удаления
        String sFirst = deque.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = deque.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", deque.size());  // 5

        // перебор коллекции
        while(deque.peek()!=null){
            // извлечение c начала
            System.out.println(deque.pop());
        }

//        System.out.println("===clone===");
//        ArrayDeque<String> deque1 = new  ArrayDeque<>(deque.clone());
//        for (String d: deque1) {
//            System.out.println(d);
//        }

        // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for(Person p : people){
            System.out.println(p.getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}
