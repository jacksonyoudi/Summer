package com.youdi.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CFD01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyTh());
        Thread t1 = new Thread(task, "t1");
        t1.start();
        task.get();
    }
}


class MyTh implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("come in callable----");
        return "hello callable";
    }
}

