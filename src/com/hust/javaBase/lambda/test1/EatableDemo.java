package com.hust.javaBase.lambda.test1;

public class EatableDemo {

    public static void main(String[] args) {
        Eatable e = new EatableImpl();
        e.eat();

        useEatable(new Eatable(){
            @Override
            public void eat() {
                System.out.println("aasasdasdas");
            }
        });

        useEatable(() -> System.out.println("abv"));
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }
}
