package org.example.thread;

public class MyThread {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 30; i++) {
            System.out.print("Thread 1: " + i +"\n");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 30; i >= 0; i--) {
            System.out.print("Thread 2: " + i +"\n");
        }
    }
}

