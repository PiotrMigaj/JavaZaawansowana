package pl.migibud.thread;

import java.time.Instant;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ThreadMain {

    private static Counter counter = new Counter();

    public static void main(String[] args) throws InterruptedException {

        Runnable myJob = ()-> IntStream.range(0,30_000).forEach(i-> counter.increment());

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(myJob);
        executorService.submit(myJob);

        executorService.shutdown();
        executorService.awaitTermination(10,TimeUnit.SECONDS);

        System.out.println(counter.getCount());


    }

}
