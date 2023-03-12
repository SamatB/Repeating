package org.example.thread.safethread;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Zaur");
        list.add("Sam");
        list.add("Jon");
        list.add("Ali");
        list.add("Beko");
        System.out.println(list);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(4);
            list.add("Max");
        };

        Thread myThread1 = new Thread(runnable1);
        Thread myThread2 = new Thread(runnable2);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(list);
    }
}
