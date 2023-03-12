package org.example.thread.synchronizators;

import java.util.concurrent.Semaphore;

public class Semaforsss {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.table =table;
        person2.table =table;
        person3.table =table;
        person4.table =table;
        person5.table =table;


        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();


    }

    static class Person extends Thread {
        Semaphore table;
        @Override
        public void run() {
            System.out.println(this.getName() + " waiting for table");
            try {
                table.acquire();
                System.out.println(this.getName() + " eating at the table");
                sleep(1000);
                System.out.println(this.getName() + " release table");
                table.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
