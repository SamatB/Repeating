package org.example.thread.threadpools;

import java.util.concurrent.*;

public class ThreadsPoolls {
    static int numOfCores = Runtime.getRuntime().availableProcessors();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.submit(new Myrun());
        System.out.println(service.submit(new MyCall()).get());
        service.shutdown();
        System.out.println("cores: " + numOfCores);
    }

    static class Myrun implements Runnable{

        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCall implements Callable<String> {

        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
