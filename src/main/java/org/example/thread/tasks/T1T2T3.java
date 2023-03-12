package org.example.thread.tasks;

public class T1T2T3 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
    }

    static class T1 extends Thread {
        @Override
        public void run() {
            System.out.println(this.getName() + "is first");
        }
    }

    static class T2 extends Thread {
        @Override
        public void run() {
            System.out.println(this.getName() + "is second");
        }
    }

    static class T3 extends Thread {
        @Override
        public void run() {
            System.out.println(this.getName() + "is third");
        }
    }
}
