package com.matrix.shikha.corejava.polymorphism.overloading;

public class ConstructorOverloading {

    public ConstructorOverloading () {
        System.out.println("0 args");
    }

    public ConstructorOverloading (int a, int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10, 20);
    }
}
