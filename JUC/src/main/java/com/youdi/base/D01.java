package com.youdi.base;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class D01 {
    public static void main(String[] args) {
        Thread hello = new Thread(() -> {
        }, "hello");

        hello.setDaemon(true);
        hello.start();
    }
}



class MyThread implements Runnable {
    @Override
    public void run() {

    }
}

class MyThread2 implements Callable<String> {
    @Override
    public String call() throws Exception {
        return null;
    }
}


// runable => runableFuture => runableFutureTask
//  构造注入
//  多线程 有返回值 异步
