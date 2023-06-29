package com.matrix.shikha.corejava.inheritance;

public class TestChildClassConstructor extends TestParentClassConstructor{

    public TestChildClassConstructor() {

        super(46); //because when extending the parent class, compiler will add super keyword as first statement which is a default function.
        // Hence first the Parent class constructor will be executed and then object of child class constructor will be executed
        // Even if parent class is not extending, still super(); will be present in class extending to the Object class.

        System.out.println("Test Child Constructor");
        System.out.println(a);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(b);
        System.out.println();
    }

    public static void main(String[] args) {

        TestChildClassConstructor obj = new TestChildClassConstructor();

    }

}
