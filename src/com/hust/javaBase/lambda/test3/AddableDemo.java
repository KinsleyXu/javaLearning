package com.hust.javaBase.lambda.test3;

public class AddableDemo {

    public static void main(String[] args) {
        useAddable((x, y) -> {
            return x + y;
        });

    }

    public static void useAddable(Addable addable) {
        int add = addable.add(10, 20);
        System.out.println(add);
    }
}
