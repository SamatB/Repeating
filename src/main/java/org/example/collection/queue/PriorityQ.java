package org.example.collection.queue;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        ints();
    }

    public static void op() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println("After removing");
        System.out.println(priorityQueue);
        priorityQueue.poll();
        System.out.println("After polling");
        System.out.println(priorityQueue);
        priorityQueue.add(1);
        priorityQueue.add(2);
        System.out.println("After adding");
        System.out.println(priorityQueue);
        priorityQueue.remove(2);
        System.out.println("After removing 2");
        System.out.println(priorityQueue);
        priorityQueue.offer(2);
        System.out.println("After offering 2");
        System.out.println(priorityQueue);
        System.out.println("Peeking : " + priorityQueue.peek());
        System.out.println("Elementing : " + priorityQueue.element());
    }

    public static void ints() {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(10);
        integers.add(1);
        integers.add(15);
        integers.add(5);
        integers.add(8);
        System.out.println(integers);
        System.out.println(integers.peek());
        System.out.println(integers.contains(3));
    }


}
