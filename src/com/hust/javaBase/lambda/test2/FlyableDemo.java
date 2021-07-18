package com.hust.javaBase.lambda.test2;

import com.hust.javaBase.lambda.test2.Flyable;

public class FlyableDemo {

    public static void main(String[] args) {
        useFlyable(s -> {
            System.out.println(s);
        });

        useFlyable(System.out::println);
    }

    private static void useFlyable(Flyable flyable){
        flyable.fly("test");
    }
}
