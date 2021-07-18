package com.hust.javaBase.lambda.test1;

import com.hust.javaBase.lambda.test1.Eatable;

public class EatableImpl implements Eatable {
    @Override
    public void eat() {
        System.out.println("想休息休息");
    }
}
