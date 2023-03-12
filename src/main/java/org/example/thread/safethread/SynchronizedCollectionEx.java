package org.example.thread.safethread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(i);
        }
        List<Integer> list = Collections.synchronizedList(arrayList);
        Runnable runnable1 = () -> {
            synchronized (list) {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next() + " ");
                }
            }
        };
        Runnable runnable2 = () -> {
            list.remove(11);
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join(2500);
        System.out.println("Main ends \n");
        System.out.println(list);
    }
}
