package org.example.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = () -> {
            return "Hello, world";
        };
        FutureTask<String> task = new FutureTask<>(callable);
        Thread thread =  new Thread(task);
        thread.start();
        System.out.println(task.get());
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.holdsLock(thread));
        System.out.println(thread.getPriority());
        System.out.println(thread.isDaemon());
    }
}
