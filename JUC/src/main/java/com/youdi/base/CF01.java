package com.youdi.base;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.TimeUnit.*;

public class CF01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);


        CompletableFuture<Void> future = CompletableFuture.runAsync(
                () -> {
                    System.out.println(Thread.currentThread().getName());

                    try {
                        MILLISECONDS.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }, pool
        );

        System.out.println(future.get());

    }
}
