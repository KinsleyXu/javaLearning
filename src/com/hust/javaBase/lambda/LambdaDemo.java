package com.hust.javaBase.lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        Runnabledemo runnabledemo = new Runnabledemo();
        Thread t = new Thread(runnabledemo);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程1启动");
            }
        }).start();

        new Thread(() -> {
            System.out.println("多线程2启动");
        }).start();
    }
}
