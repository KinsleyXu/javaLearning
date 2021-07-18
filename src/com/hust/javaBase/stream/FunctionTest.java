package com.hust.javaBase.stream;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest {

    public static void main(String[] args) {
        String s = "林青霞,30";
        test(s, str -> Integer.parseInt(s.split(",")[1]), i -> i + 70);

        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();
        list.add("linqingxia"); list.add("zhangmanyu"); list.add("wangzuxian"); list.add("liuyan"); list.add("zhangmin"); list.add("zhangwuji");
//需求1:按照字母顺序把数据在控制台输出 list.stream().sorted().forEach(System.out::println);
//需求2:按照字符串长度把数据在控制台输出
list.stream().sorted((s1,s2) -> {
        int num = s1.length()-s2.length();
        int num2 = num==0?s1.compareTo(s2):num; return num2;
    }).forEach(System.out::println);
    }

    public static void test(String s, Function<String, Integer> fun1, Function<Integer, Integer> fun2){
        Integer apply = fun1.andThen(fun2).apply(s);
        System.out.println(apply);
    }
}
