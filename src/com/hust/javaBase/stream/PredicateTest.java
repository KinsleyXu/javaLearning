package com.hust.javaBase.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        List<String> list = test(strArray, str -> str.split(",")[0].length() > 2, str -> Integer.parseInt(str.split(",")[1]) >33);
        System.out.println(list);
    }

    private static List<String> test(String[] str, Predicate<String> s1, Predicate<String> s2) {
        List<String> list = new ArrayList<>();
        for (String s : str) {
            if (s1.and(s2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }
}
