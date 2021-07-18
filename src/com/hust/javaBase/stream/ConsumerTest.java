package com.hust.javaBase.stream;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        String[] strArray = {"lin,30", "zhang,35", "wang,33"};
        printInfo(strArray, str -> {
            String name = str.split(",")[0];
            System.out.print(name);
        }, str -> {
            int age = Integer.parseInt(str.split(",")[1]);
            System.out.println("," + age);
        });
    }

    public static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String s : strArray) {
            con1.andThen(con2).accept(s);
        }
    }
}
