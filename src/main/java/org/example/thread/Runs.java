package org.example.thread;

public class Runs implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 30; i++) {
            System.out.print("Thread 1: " + i +"\n");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runs());

        thread1.start();

        for (int i = 30; i >= 0; i--) {
            System.out.print("Thread 2: " + i +"\n");
            Thread.sleep(1000);
        }

        new Thread(() -> System.out.println("Hi, this is short form of thread run with lambda")).start();
    }
}
