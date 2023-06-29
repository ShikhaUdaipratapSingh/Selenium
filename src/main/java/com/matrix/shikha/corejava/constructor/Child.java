package com.matrix.shikha.corejava.constructor;

public class Child extends Parent {

    Child() {
        super(); // Keyword default added by compiler as a first statement in constructor
        System.out.println("I am in child constructor");

    }

    public static void main(String[] args) {
        Child ch =  new Child();
    }

    //PrivateConstructor obj = new PrivateConstructor();

}
