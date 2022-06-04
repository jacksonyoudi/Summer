package com.youdi.base;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


/**
 * get join区别
 */
public class CF02 {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(
                () -> {
                    System.out.println(Thread.currentThread().getName() + " come in");
                    int i = ThreadLocalRandom.current().nextInt(10);
                    try {
                        TimeUnit.SECONDS.sleep(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("----1秒钟后出结果" + i);
                    return i;
                }
        ).whenComplete(
                (v, e) -> {
                    if (e == null) {
                        System.out.println("----计算完成，更新系统updateva:" + v);

                    }
                }
        ).exceptionally(
                e -> {
                    e.printStackTrace();
                    System.out.println("异常情况:" + e.getCause() + "\t" + e.getMessage());
                    return null;
                }

        );
    }
}
