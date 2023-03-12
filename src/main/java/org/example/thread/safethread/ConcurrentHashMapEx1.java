package org.example.thread.safethread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx1 {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Zaur");
        map.put(2, "Sam");
        map.put(3, "Jon");
        map.put(4, "Ali");
        map.put(5, "Beko");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.println(i + ": " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(6, "Jenny");
        };

        Thread myThread1 = new Thread(runnable1);
        Thread myThread2 = new Thread(runnable2);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(map);
    }
}
