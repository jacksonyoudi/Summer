package com.youdi.base;

import java.util.concurrent.*;

public class Pool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        FutureTask<String> hello = new FutureTask<String>(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "hello");

        pool.submit(hello);

        // 阻塞 可以设置超时时间
        // 可以轮询进行
        hello.get();

        while (true) {
            if (hello.isDone()) {
                System.out.println("done");
                break;
            } else {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println("运行中.....");
            }
        }

    }
}




