package org.example.thread;

public class Sleeps {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Go!");
    }
}
